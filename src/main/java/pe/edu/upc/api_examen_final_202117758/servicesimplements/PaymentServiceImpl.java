package pe.edu.upc.api_examen_final_202117758.servicesimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.api_examen_final_202117758.entities.Payment;
import pe.edu.upc.api_examen_final_202117758.repositories.IMemberRepository;
import pe.edu.upc.api_examen_final_202117758.repositories.IPaymentRepository;
import pe.edu.upc.api_examen_final_202117758.services.IPaymentService;

import java.util.List;

@Service
public class PaymentServiceImpl implements IPaymentService {
    @Autowired
    private IPaymentRepository kplpR;
    @Override
    public void insert(Payment kplPayment) {
        kplpR.save(kplPayment);
    }

    @Override
    public List<Payment> list() {
        return kplpR.findAll();
    }

    @Override
    public List<Payment> ListarPagosxCode(String kplmcode) {
        return kplpR.ListarPagosxCode(kplmcode);
    }
}
