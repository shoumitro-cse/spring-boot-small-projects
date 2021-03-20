package com.example.accessingdatamysql;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller	// This means that this class is a Controller
//@RequestMapping(path = "/demo") // This means URL's start with /demo (after Application path)
//@RequestMapping("/") // This means URL's start with /demo (after Application path)
public class MainController {

    // Which is auto-generated by Spring, we will use it to handle the data
    @Autowired // This means to get the bean called userRepository
    private UserRepository userRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/form")
    public String getForm() {
        return "form";
    }


//    curl localhost:8080/demo/add -d name="Rohim hossain" -d email=rohim@gmail.com
//    curl localhost:8080/demo/add -d name=rohit -d email=rohit@gmail.com
//     curl localhost:8080/demo/add -d name=shoumitro -d email=someemail@someemailprovider.com
//    curl localhost:8080/add -d name="Rohim hossain" -d email=rohim@gmail.com
//    curl localhost:8080/add -d name=rohit -d email=rohit@gmail.com
//     curl localhost:8080/add -d name=shoumitro -d email=someemail@someemailprovider.com
//    @GetMapping(path="/add") //http://localhost:8080/demo/add?name=Rohit&email=rohit@gmail.com
    @PostMapping(path = "/add") // Map ONLY POST Requests
    public @ResponseBody
    String addNewUser(@RequestParam String name, @RequestParam String email) {
        // @ResponseBody means the returned String is the response, not a view name
        // @RequestParam means it is a parameter from the GET or POST request

        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "Saved";
    }

    @GetMapping(path = "/all")
    public @ResponseBody
    Iterable<User> getAllUsers() {
        // This returns a JSON or XML with the users
        return userRepository.findAll();
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "Mr, John") String name, Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}