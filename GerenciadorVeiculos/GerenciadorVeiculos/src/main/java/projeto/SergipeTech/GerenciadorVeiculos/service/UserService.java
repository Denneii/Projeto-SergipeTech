package projeto.SergipeTech.GerenciadorVeiculos.service;

import projeto.SergipeTech.GerenciadorVeiculos.controller.CreateUserDto;
import projeto.SergipeTech.GerenciadorVeiculos.entity.User;
import projeto.SergipeTech.GerenciadorVeiculos.repository.UserRepository;

import projeto.SergipeTech.GerenciadorVeiculos.entity.User;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.UUID;

@Service
public class UserService {

    private UserRepository userRepository;
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UUID createUser(CreateUserDto createUserDto){

        var entity = new User(UUID.randomUUID(),
                createUserDto.username(),
                createUserDto.email(),
                createUserDto.password(),
                Instant.now(), null);
       var usedSaved = userRepository.save(entity);

       return usedSaved.getUserId();
    }
}
