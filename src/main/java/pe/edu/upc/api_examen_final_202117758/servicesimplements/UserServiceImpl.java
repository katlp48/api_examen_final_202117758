package pe.edu.upc.api_examen_final_202117758.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.api_examen_final_202117758.entities.Users;
import pe.edu.upc.api_examen_final_202117758.repositories.RoleRepository;
import pe.edu.upc.api_examen_final_202117758.repositories.UserRepository;
import pe.edu.upc.api_examen_final_202117758.services.IUserService;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository kpluR;
    @Override
    public Integer insert(Users user) {
        int rpta = kpluR.buscarUsername(user.getUsername());
        if (rpta == 0) {
            kpluR.save(user);
        }
        return rpta;
    }

    @Override
    public List<Users> list() {
        return kpluR.findAll();
    }
}
