package pe.edu.upc.api_examen_final_202117758.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.api_examen_final_202117758.dtos.MemberDTO;
import pe.edu.upc.api_examen_final_202117758.entities.Member;
import pe.edu.upc.api_examen_final_202117758.services.IMemberService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/member")
public class MemberController {
    @Autowired
    private IMemberService kplmS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void insert(@RequestBody MemberDTO dto) {
        ModelMapper m = new ModelMapper();
        Member kplm = m.map(dto, Member.class);
        kplmS.insert(kplm);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('USUARIO')")
    public List<MemberDTO> list() {
        return kplmS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, MemberDTO.class);
        }).collect(Collectors.toList());
    }
}
