package pe.edu.upc.api_examen_final_202117758.services;

import pe.edu.upc.api_examen_final_202117758.entities.Role;

import java.util.List;

public interface IRoleService {
    public void insert(Role role);

    List<Role> list();
}
