package pe.edu.upc.api_examen_final_202117758.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.api_examen_final_202117758.dtos.UserDTO;
import pe.edu.upc.api_examen_final_202117758.entities.Users;
import pe.edu.upc.api_examen_final_202117758.services.IUserService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private PasswordEncoder bcrypt;
    @Autowired
    private IUserService uService;

    @GetMapping
    public List<UserDTO> list(){
        return uService.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }

    @PostMapping
    public String saveUser( Model model, @RequestBody UserDTO dto)
            throws Exception {
        ModelMapper m = new ModelMapper();
        Users u = m.map(dto, Users.class);
        String bcryptPassword = bcrypt.encode(u.getPassword());
        u.setPassword(bcryptPassword);
        uService.insert(u);
        return "Usuario creado";
    }
}
