package projeto.SergipeTech.GerenciadorVeiculos.controller;

import projeto.SergipeTech.GerenciadorVeiculos.entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import projeto.SergipeTech.GerenciadorVeiculos.service.UserService;

import java.net.URI;

@RestController
@RequestMapping("/v1/user")

public class UserController {

    private UserService userService;

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody CreateUserDto createUserDto){
        var userID =userService.createUser(createUserDto);
        return ResponseEntity.created(URI.create("/v1/users/" + userID.toString())).build();
    }
    @GetMapping("/{userid}")
    public ResponseEntity<User> getUserById(@PathVariable("userid")String userid){
        //
        return null;
    }
}
