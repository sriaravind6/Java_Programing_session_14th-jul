package daily_class_for_java.thirteenclass;

import java.util.ArrayList;

public class EmployeeDetails {
    String name;
    String address;
    int empId;
    String dob;
    String email;
    long phoneNumber;

    public EmployeeDetails(String name, String address, int empId, String dob, String email, long phoneNumber) {
        this.name = name;
        this.address = address;
        this.empId = empId;
        this.dob = dob;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public ArrayList getEmployeeDetails() {
        ArrayList details = new ArrayList();
        details.add(name);
        details.add(address);
        details.add(empId);
        details.add(dob);
        details.add(email);
        details.add(phoneNumber);
        return details;
    }
}
