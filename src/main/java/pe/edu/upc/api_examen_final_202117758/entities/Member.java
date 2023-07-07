package pe.edu.upc.api_examen_final_202117758.entities;

import javax.persistence.*;

@Entity
@Table(name = "members")
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long kplId;

    @Column(name = "kplName", length = 60, nullable = false)
    private String kplName;

    @Column(name = "kplMember_code", length = 9, nullable = false)
    private String kplMember_code;

    public Member() {
    }

    public Member(long kplId, String kplName, String kplMember_code) {
        this.kplId = kplId;
        this.kplName = kplName;
        this.kplMember_code = kplMember_code;
    }

    public long getKplId() {
        return kplId;
    }

    public void setKplId(long kplId) {
        this.kplId = kplId;
    }

    public String getKplName() {
        return kplName;
    }

    public void setKplName(String kplName) {
        this.kplName = kplName;
    }

    public String getKplMember_code() {
        return kplMember_code;
    }

    public void setKplMember_code(String kplMember_code) {
        this.kplMember_code = kplMember_code;
    }
}
