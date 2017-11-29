package fi.academy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Kontrolleri {
    @Autowired
    SanontaRepository sanontaRepository;

    @GetMapping ("/add")
    public String addNewQuote (@RequestParam String nimi
            , @RequestParam String virsi) {
        Sanonta n = new Sanonta();
        n.setNimi(nimi);
        n.setVirsi(virsi);
        sanontaRepository.save(n);
        return "Saved";
    }
    @GetMapping("/all")
    public Iterable<Sanonta> getAllUsers() {
        return sanontaRepository.findAll();
    }
    @RequestMapping("/haeID")
    public Iterable<Sanonta> getById(@RequestParam(name = "id") Integer id){
        if(id==null)
            return sanontaRepository.findAll();
        return sanontaRepository.haeSanontaIdlla(id);
    }

}
