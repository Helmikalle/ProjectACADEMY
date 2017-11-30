package fi.academy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.net.URISyntaxException;

@RestController
@RequestMapping("/api")
public class Kontrolleri {
    @Autowired
    SanontaRepository sanontaRepository;

    @PostMapping("/all")
    public ResponseEntity luosanonta(@RequestBody Sanonta sanonta) throws URISyntaxException {
        sanontaRepository.save(sanonta);
        URI location = UriComponentsBuilder.newInstance()
                .scheme("http")
                .host("localhost")
                .port(8080)
                .path("api/all/{id}")
                .buildAndExpand(sanonta.getId())
                .toUri();
        return ResponseEntity.created(location).build();
    }


    @RequestMapping ("/add")
    public String addNewQuote (@RequestParam(name="%") String nimi
            , @RequestParam(name="%") String virsi) {
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
