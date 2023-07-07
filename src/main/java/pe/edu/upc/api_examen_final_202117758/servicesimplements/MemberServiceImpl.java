package pe.edu.upc.api_examen_final_202117758.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.api_examen_final_202117758.entities.Member;
import pe.edu.upc.api_examen_final_202117758.repositories.IMemberRepository;
import pe.edu.upc.api_examen_final_202117758.services.IMemberService;

import java.util.List;

@Service
public class MemberServiceImpl implements IMemberService {
    @Autowired
    private IMemberRepository kplmR;
    @Override
    public void insert(Member kplMember) {
        kplmR.save(kplMember);
    }

    @Override
    public List<Member> list() {
        return kplmR.findAll();
    }
}
