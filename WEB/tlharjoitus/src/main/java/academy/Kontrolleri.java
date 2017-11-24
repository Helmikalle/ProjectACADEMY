package academy;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Kontrolleri {
    @RequestMapping("/tervehdi")
    public String tervehdi(Model model) {
        model.addAttribute("nimi", "Ossi");
        return "terve";
    }
    @RequestMapping ("/lomake")
    public String lomakedata (LomakeData olio, Model model){
        return "lomake";
    }
    @RequestMapping ("/toinensivu")
    public String toinensivu (Model model){
        model.addAttribute("copy");
        return "copy";
    }
}