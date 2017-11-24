package fi.academy;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Controlleri {
    @Autowired
    CountryRepository countryRepository;
    @Autowired
    SortRepository sortRepository;

    @GetMapping("/all")
    public Iterable<Country> haeMaat() {
        return countryRepository.findAll();
    }

    @RequestMapping("/maat")
    public String listaaMaat(Model model) {
        model.addAttribute("maat",countryRepository.findAll());
        return "tulostalista";
    }
    @RequestMapping("/maita")
    public String findAll (Pageable pageable, Model model){

        model.addAttribute("maita",sortRepository.findAll(pageable));
        model.addAttribute("sivuja", sortRepository.findAll(pageable).getTotalPages()-1);
        model.addAttribute("seuraavasivu",sortRepository.findAll(pageable).nextPageable());
        model.addAttribute("edellinensivu",sortRepository.findAll(pageable).previousPageable());
        return "tulostalista";
    }
}
