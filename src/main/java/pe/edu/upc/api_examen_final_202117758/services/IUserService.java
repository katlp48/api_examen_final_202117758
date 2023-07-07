package pe.edu.upc.api_examen_final_202117758.services;

import pe.edu.upc.api_examen_final_202117758.entities.Users;

import java.util.List;

public interface IUserService {
    public Integer insert(Users user);

    List<Users> list();
}
