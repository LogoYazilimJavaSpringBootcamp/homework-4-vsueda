package IsbasiModel;

import javax.persistence.*;

@Entity
@Table(name = "ISBASI_BANK")
public class Bank {
    private int bankId;
    private String bankName;
    private String bankLocation;
    private String bankPhone;

    public Bank() {
    }

    public Bank(int bankId, String bankName, String bankLocation, String bankPhone) {
        this.bankId = bankId;
        this.bankName = bankName;
        this.bankLocation = bankLocation;
        this.bankPhone = bankPhone;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "T_ID", nullable = false)
    public int getBankId() {
        return bankId;
    }

    public void setBankId(int bankId) {
        this.bankId = bankId;
    }

    @Column(name = "T_BANK_NAME")
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    @Column(name = "T_BANK_LOCATION")
    public String getBankLocation() {
        return bankLocation;
    }

    public void setBankLocation(String bankLocation) {
        this.bankLocation = bankLocation;
    }

    @Column(name = "T_BANK_PHONE")
    public String getBankPhone() {
        return bankPhone;
    }

    public void setBankPhone(String bankPhone) {
        this.bankPhone = bankPhone;
    }
}
