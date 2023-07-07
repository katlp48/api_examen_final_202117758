package pe.edu.upc.api_examen_final_202117758.services;

import pe.edu.upc.api_examen_final_202117758.entities.Member;

import java.util.List;

public interface IMemberService {
    public void insert(Member kplMember);
    List<Member> list();
}
