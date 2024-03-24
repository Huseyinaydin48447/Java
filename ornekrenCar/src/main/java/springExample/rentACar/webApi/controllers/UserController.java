package springExample.rentACar.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import springExample.rentACar.business.responeses.GetAllBrandsResponse;
import springExample.rentACar.dataAccess.abstracts.UserRepository;
import springExample.rentACar.entities.concreters.User;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/register")
    public String showRegisterForm() {
        return "register.html"; 
    }
  
   
    
    
    

    @PostMapping("/register")
    public String registerUser(@RequestParam String username, @RequestParam String password, @RequestParam String role) {
        // Yeni kullanıcı oluştur
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(password);
        newUser.setRole(role);

        // Kullanıcıyı kaydet
        userRepository.save(newUser);

        return "redirect:/login";
    }
}
