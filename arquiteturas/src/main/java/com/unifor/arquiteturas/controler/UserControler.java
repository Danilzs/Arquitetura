package com.unifor.arquiteturas.controler;

import com.unifor.arquiteturas.Model.User;
import com.unifor.arquiteturas.Services.UserInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cadastrar-usuario")
public class UserControler {
    private UserInterface UserInterface;
    @PostMapping("/create")
    public ResponseEntity<User> CreateUser(@RequestBody User user) {
        return ResponseEntity.ok(UserInterface.createUser(user));
    }

    @GetMapping("allUsers")
    public ResponseEntity<List<User>> GetAllusers(){
        return ResponseEntity.ok(UserInterface.GetAllusers());
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@RequestParam long id) {
        return ResponseEntity.ok(UserInterface.getUseByid(id));
    }
}
