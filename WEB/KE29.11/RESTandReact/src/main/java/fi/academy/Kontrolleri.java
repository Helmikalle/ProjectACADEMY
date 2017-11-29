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

    @GetMapping ("/quotes")
    public String addNewQuote (@RequestParam String name
            , @RequestParam String virsi) {
        Sanonta n = new Sanonta();
        n.setNimi(name);
        n.setVirsi(virsi);
        sanontaRepository.save(n);
        return "Saved";
    }

}
