package pe.edu.upc.api_examen_final_202117758.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.api_examen_final_202117758.entities.Member;

@Repository
public interface IMemberRepository extends JpaRepository<Member, Long> {

}
