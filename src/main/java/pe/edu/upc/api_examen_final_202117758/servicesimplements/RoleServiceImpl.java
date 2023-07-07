package pe.edu.upc.api_examen_final_202117758.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.api_examen_final_202117758.entities.Role;
import pe.edu.upc.api_examen_final_202117758.repositories.IPaymentRepository;
import pe.edu.upc.api_examen_final_202117758.repositories.RoleRepository;
import pe.edu.upc.api_examen_final_202117758.services.IRoleService;

import java.util.List;

@Service
public class RoleServiceImpl implements IRoleService {
    @Autowired
    private RoleRepository kplrR;
    @Override
    public void insert(Role role) {
        kplrR.save(role);
    }

    @Override
    public List<Role> list() {
        return kplrR.findAll();
    }
}
