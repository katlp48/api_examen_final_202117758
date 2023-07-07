package pe.edu.upc.api_examen_final_202117758.dtos;

import javax.persistence.Column;

public class MemberDTO {
    private long kplId;

    private String kplName;

    private String kplMember_code;

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
