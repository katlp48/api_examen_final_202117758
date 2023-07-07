package pe.edu.upc.api_examen_final_202117758.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.api_examen_final_202117758.dtos.PaymentDTO;
import pe.edu.upc.api_examen_final_202117758.entities.Payment;
import pe.edu.upc.api_examen_final_202117758.services.IPaymentService;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@RequestMapping("/ api/payment")
public class PaymentController {
    @Autowired
    private IPaymentService kplpS;

    @PostMapping
    @PreAuthorize("hasAuthority('ADMINISTRADOR')")
    public void insert(@RequestBody PaymentDTO dto) {
        ModelMapper m = new ModelMapper();
        Payment kplp = m.map(dto, Payment.class);
        kplpS.insert(kplp);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('USUARIO')")
    public List<PaymentDTO> list() {
        return kplpS.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PaymentDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/{code_member}")
    @PreAuthorize("hasAuthority('USUARIO')")
    public List<PaymentDTO> ListarPagosxCode(@RequestParam("code_member") String kplmcode) {
        return kplpS.ListarPagosxCode(kplmcode).stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PaymentDTO.class);
        }).collect(Collectors.toList());
    }
}
