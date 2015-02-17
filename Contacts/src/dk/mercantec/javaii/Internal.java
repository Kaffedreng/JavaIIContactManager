package dk.mercantec.javaii;

/**
 * Created by code on 17/02/15.
 */
public class Internal extends BaseContact implements iViewable {

    public Internal(String name, String phone, String email, String department) {
        super(name, phone, email);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    private String department;

    @Override
    public String toString() {
        return "Name: " + this.getName() +
                "\nPhone: " + this.getPhone() +
                "\nEmail: " + this.getEmail() +
                "\nDepartment: " + this.getDepartment();
    }
}
