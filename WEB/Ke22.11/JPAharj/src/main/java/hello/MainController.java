package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller    // This means that this class is a Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private UserRepository userRepository;
    @Autowired
    private AddressRepository addressRepository;

    @GetMapping(path = "/address")
    public @ResponseBody String addNewAddress (@RequestParam String city,@RequestParam String street){
        Address address = new Address();
        address.setStreet(street);
        address.setCity(city);
        addressRepository.save(address);
        return "Address saved";
    }

    @GetMapping(path="/add") // Map ONLY GET Requests
    public @ResponseBody String addNewUser (@RequestParam String name
            , @RequestParam String email,@RequestParam String city,@RequestParam String street) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request
        Address address = new Address();
        address.setCity(city);
        address.setStreet(street);
        addressRepository.save(address);

        User n = new User();
        n.setName(name);
        n.setEmail(email);
        n.setAddress(address);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

    @GetMapping (path ="/all/{name}")
    public @ResponseBody Iterable<User> findUserByName(@PathVariable ("name") String name){
        return userRepository.findByNameIgnoreCase(name);
    }
    public @ResponseBody Iterable<Address> findAddress(@PathVariable ("osoite") Integer id){
        return addressRepository.findById(id);
    }


}