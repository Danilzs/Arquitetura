package com.unifor.arquiteturas;

import com.unifor.arquiteturas.Model.User;
import com.unifor.arquiteturas.Services.UserInterface;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("cadastrar-usuario")
public class UserController {

    private final UserInterface userInterface;

    public UserController(UserInterface userInterface) {
        this.userInterface = userInterface;
    }

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user) {
        return ResponseEntity.ok(userInterface.createUser(user));
    }

    @GetMapping("/allUsers")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userInterface.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        return ResponseEntity.ok(userInterface.getUserById(id));
    }
}
