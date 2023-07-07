package pe.edu.upc.api_examen_final_202117758.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.api_examen_final_202117758.dtos.RoleDTO;
import pe.edu.upc.api_examen_final_202117758.entities.Role;
import pe.edu.upc.api_examen_final_202117758.services.IRoleService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@SessionAttributes
@RequestMapping("/roles")
public class RoleController {
    @Autowired
    private IRoleService rService;

    @GetMapping
    public List<RoleDTO> list(){
        return rService.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, RoleDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    public void insert(@RequestBody RoleDTO dto) {
        ModelMapper m = new ModelMapper();
        Role r = m.map(dto, Role.class);
        rService.insert(r);
    }

}
