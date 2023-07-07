package pe.edu.upc.api_examen_final_202117758.dtos;

import com.fasterxml.jackson.annotation.JsonIgnore;
import pe.edu.upc.api_examen_final_202117758.entities.Member;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.time.LocalDate;

public class PaymentDTO {
    private long kplId;

    private String kplMonth;

    private String kplYear;

    private Double kplAmount;

    private Boolean kplStatus;

    private Member member;

    public long getKplId() {
        return kplId;
    }

    public void setKplId(long kplId) {
        this.kplId = kplId;
    }

    public String getKplMonth() {
        return kplMonth;
    }

    public void setKplMonth(String kplMonth) {
        this.kplMonth = kplMonth;
    }

    public String getKplYear() {
        return kplYear;
    }

    public void setKplYear(String kplYear) {
        this.kplYear = kplYear;
    }


    public Double getKplAmount() {
        return kplAmount;
    }

    public void setKplAmount(Double kplAmount) {
        this.kplAmount = kplAmount;
    }

    public Boolean getKplStatus() {
        return kplStatus;
    }

    public void setKplStatus(Boolean kplStatus) {
        this.kplStatus = kplStatus;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
