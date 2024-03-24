package springExample.rentACar.webApi.controllers;

import jakarta.servlet.http.HttpSession;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import springExample.rentACar.business.abstracts.UserService;
import springExample.rentACar.business.requests.CreateUserRequest;
import springExample.rentACar.business.responeses.GetAllUsersResponse;
import springExample.rentACar.business.responeses.GetByIdUsersResponse;
import springExample.rentACar.dataAccess.abstracts.UserRepository;
import springExample.rentACar.entities.concreters.Model;
import springExample.rentACar.entities.concreters.User;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UsersController {
 private UserService userService;
 private UserRepository userRepository;
 
 
 
 
	@GetMapping()
	public List<GetAllUsersResponse> getAll(){
		return userService.getAll();
	}
	

	@PostMapping()
	@ResponseStatus(code=HttpStatus.CREATED)
	public void add(@RequestBody @Valid()  CreateUserRequest createUserRequest) {
		this.userService.add(createUserRequest);
	}
	
	
	@GetMapping("/{id}")
	public GetByIdUsersResponse getById(@PathVariable  int id){
		return userService.getById(id);
	}

	
	
@PutMapping("/{id}")
public ResponseEntity<?> updateModel(@PathVariable int id, @RequestBody User user, HttpSession session) {
    User loggedInUser = (User) session.getAttribute("USER");
    
    if (loggedInUser != null && (loggedInUser.getRole().equals("admin") || loggedInUser.getId() == id)) {
        if (loggedInUser.getRole().equals("admin")) {
            User existingUser = userRepository.findById(id).orElse(null);
            if (existingUser != null) {
                existingUser.setUsername(user.getUsername());
                existingUser.setPassword(user.getPassword());
                existingUser.setRole(user.getRole());
                userRepository.save(existingUser);
                return ResponseEntity.ok(existingUser);
            } else {
                return ResponseEntity.notFound().build();
            }
        } else {
            loggedInUser.setUsername(user.getUsername());
            loggedInUser.setPassword(user.getPassword());
            userRepository.save(loggedInUser);
            return ResponseEntity.ok(loggedInUser);
        }
    } else {
        // Yetkisiz erişim durumunda hata döndür
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("<html><body><h1>Bu işlemi gerçekleştirmek için yeterli yetkiniz yok.</h1></body></html>");
    }
}


	
	
}
