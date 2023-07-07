package pe.edu.upc.api_examen_final_202117758.services;

import pe.edu.upc.api_examen_final_202117758.entities.Payment;

import java.util.List;

public interface IPaymentService {
    public void insert(Payment kplPayment);
    List<Payment> list();
    public List<Payment> ListarPagosxCode (String kplmcode);
}
