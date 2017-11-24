package fi.academy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class Kontrolleri {
    private static final Logger log = LoggerFactory.getLogger(Aplikaatio.class);
    @Autowired
    JdbcTemplate jdbcTemplate;

    public Kontrolleri(@Autowired JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
//        jdbcTemplate.execute("DROP TABLE customers IF EXISTS");
//        jdbcTemplate.execute("CREATE TABLE customers(" +
//                "id SERIAL, first_name VARCHAR(255), last_name VARCHAR(255))");
//
//        // Split up the array of whole names into an array of first/last names
//        List<Object[]> splitUpNames = Arrays.asList("John Woo", "Jeff Dean", "Josh Bloch", "Josh Long").stream()
//                .map(name -> name.split(" "))
//                .collect(Collectors.toList());
//
//        // Use a Java 8 stream to print out each tuple of the list
//        splitUpNames.forEach(name -> log.info(String.format("Inserting customer record for %s %s", name[0], name[1])));
//
//        // Uses JdbcTemplate's batchUpdate operation to bulk load data
//        jdbcTemplate.batchUpdate("INSERT INTO customers(first_name, last_name) VALUES (?,?)", splitUpNames);

    }

    @RequestMapping("terve")
    public String tervehdi(Model model) {
        model.addAttribute("name", "Kalle");
        return "terve";
    }

    @Autowired
    Numero numero;

    @RequestMapping("numero")
    public String nro(Model model) {
        model.addAttribute("numero", numero.getAndIncrement());
        return "numero";
    }


    @RequestMapping("jdbc")
    public String jdbctest1(Model model) {
                log.info("Querying for customer records where first_name = 'Josh':");
        List<Customer> palautettu =
                jdbcTemplate.query(
                "SELECT id, first_name, last_name FROM customers WHERE first_name = ?", new Object[]{"Josh"},
                (rs, rowNum) -> new Customer(
                        rs.getLong("id"),
                        rs.getString("first_name"),
                        rs.getString("last_name"))
        );
               palautettu.forEach(customer -> log.info(customer.toString()));
        model.addAttribute("asiakkaat",palautettu);
        return "jdbcsivu";
    }


    @RequestMapping ("maat")
    public String maatSivulla (Model model){
        jdbcTemplate.execute("select * from country limit 10");
        model.addAttribute("maat","Vesala");
        return "maat";
    }



}