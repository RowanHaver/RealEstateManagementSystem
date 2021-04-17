import java.io.Serializable;
import java.util.Formatter;

public class Tenant {

    int tenantID;
    String firstName;
    String lastName;
    String telephone;
    String email;
    int idInfo;



    Tenant(int tenantID, String firstName, String lastName, String telephone, String email, int idInfo) {
        this.tenantID = tenantID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.telephone = telephone;
        this.email = email;
        this.idInfo = idInfo;
    }

    void printTenants() {
        System.out.format("%12s %18s %30s %15d %8s %18s",tenantID,firstName,lastName,telephone,email,idInfo);
    }

}
