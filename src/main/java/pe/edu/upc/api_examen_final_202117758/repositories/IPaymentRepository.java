package pe.edu.upc.api_examen_final_202117758.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.api_examen_final_202117758.entities.Payment;

import java.util.List;

@Repository
public interface IPaymentRepository extends JpaRepository<Payment, Long> {
    @Query("FROM Payment kplP where kplP.member.kplMember_code = :kplmcode order by kplP.kplAmount asc")
    List<Payment> ListarPagosxCode (@Param("kplmcode")String kplmcode);
}
