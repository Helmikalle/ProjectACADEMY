package fi.academy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RESTeka {
    private static final String template = "%s";
    @RequestMapping ("henkilo")
    public List<Object> näytäHenkilö (@RequestParam(value = "firstName",required = false)String firstName,
                                      @RequestParam(value="lastName",required = false)String lastName){
        List<Object> henkilot = new ArrayList<>();
        henkilot.add(new Customer(1,"Kalle","Helminen"));
        henkilot.add(new Customer(2,"Outi","Helminen"));
        henkilot.add(new Customer(3,"Eliel","Helminen"));
        henkilot.add(new Customer(4,"John","Doe"));

        return henkilot;
    }
    @GetMapping ("henkilot")
    public Customer etsi (String nimi){

        return null;
    }

}
