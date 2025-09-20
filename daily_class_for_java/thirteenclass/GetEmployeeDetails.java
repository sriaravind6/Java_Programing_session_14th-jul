package daily_class_for_java.thirteenclass;

import java.util.LinkedHashSet;

public class GetEmployeeDetails {
    public static void main(String[] args) {
        EmployeeDetails emp1 = new EmployeeDetails("John Doe", "123 Main St", 101,
                "1990-01-01", "email1", 1234567890);
        EmployeeDetails emp2 = new EmployeeDetails("Jane Smith", "456 Oak Ave", 102,
                "1992-02-02", "email2", 1343457677);
        EmployeeDetails emp3 = new EmployeeDetails("Alice Johnson", "789 Pine Rd", 103,
                "1994-03-03", "email3", 3456789012L);
        EmployeeDetails emp4 = new EmployeeDetails("Bob Brown", "321 Maple Ln", 104,
                "1996-04-04", "email4", 456789012L);
        LinkedHashSet<EmployeeDetails> emp_Details = new LinkedHashSet<>();
        emp_Details.add(emp1);
        emp_Details.add(emp2);
        emp_Details.add(emp3);
        emp_Details.add(emp4);
        for (EmployeeDetails e : emp_Details) {
            System.out.println(e.getEmployeeDetails());
    }
        }
}
