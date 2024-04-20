package springExample.rentACar.webApi.controllers;

import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import springExample.rentACar.dataAccess.abstracts.BrandRepository;
import springExample.rentACar.dataAccess.abstracts.ModelRepository;
import springExample.rentACar.dataAccess.abstracts.UserRepository;
import springExample.rentACar.entities.concreters.Brand;
import springExample.rentACar.entities.concreters.User;

import java.util.List;

@Controller
public class PanelController {

    @Autowired
    private BrandRepository brandRepository;
    @Autowired
    private ModelRepository modelRepository;
    @Autowired
    private UserRepository userRepository;

//    @GetMapping("/panel")
//    public String showPanel(Model model) {
//        List<Brand> brands = brandRepository.findAll();
//        List<springExample.rentACar.entities.concreters.Model> models = modelRepository.findAll();
//        List<User> users = userRepository.findAll();
//        model.addAttribute("brands", brands);
//        model.addAttribute("models", models); // Model verilerini ekledik
//        model.addAttribute("users", users);
//        model.addAttribute("showBrandData", false); // Başlangıçta Brand verilerini gizle
//        return "panel";
//    
//    }
    @GetMapping("/panel")
public String showPanel(Model model, HttpSession session) {
    // Oturum açmış kullanıcıyı al
    User loggedInUser = (User) session.getAttribute("USER");
    
    if (loggedInUser != null) {
        List<User> users;
        if (loggedInUser.getRole().equals("admin")) {
            users = userRepository.findAll();
        } else {
           
            users = new ArrayList<>();
            users.add(loggedInUser);
        }
 
        List<Brand> brands = brandRepository.findAll();
        List<springExample.rentACar.entities.concreters.Model> models = modelRepository.findAll();

        model.addAttribute("brands", brands);
        model.addAttribute("models", models);
        model.addAttribute("users", users);
        model.addAttribute("showBrandData", false);
        model.addAttribute("isAdmin", loggedInUser.getRole().equals("admin"));
        model.addAttribute("isStandardUser", loggedInUser.getRole().equals("standard"));

        return "panel";
    } else {
       
        return "redirect:/login";
    }
}


}
