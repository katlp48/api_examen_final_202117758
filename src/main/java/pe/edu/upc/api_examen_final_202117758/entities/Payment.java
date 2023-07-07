package pe.edu.upc.api_examen_final_202117758.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long kplId;

    @Column(name = "kplMonth", length = 60, nullable = false)
    private String kplMonth;

    @Column(name = "kplYear", length = 60, nullable = false)
    private String kplYear;


    @Column(name = "kplAmount", length = 10, nullable = false)
    private Double kplAmount;

    @Column(name = "kplStatus",nullable = false)
    private Boolean kplStatus;

    @ManyToOne
    @JoinColumn(name = "kplMember", nullable = false)
    @JsonIgnore
    private Member member;

    public Payment() {
    }

    public Payment(long kplId, String kplMonth, String kplYear, Double kplAmount, Boolean kplStatus, Member member) {
        this.kplId = kplId;
        this.kplMonth = kplMonth;
        this.kplYear = kplYear;
        this.kplAmount = kplAmount;
        this.kplStatus = kplStatus;
        this.member = member;
    }

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
