import java.util.List;
import java.util.function.*;

public class Employee {
    String firstName;
    String lastName;
    double salary;

    public Employee(String f, String l, double s){
        firstName = f;
        lastName = l;
        salary = s;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public double getSalary(){
        return salary;
    }

    public static void main(String[] args) {
        List<Employee> employees = List.of(new Employee("Uzeyir", "Bakhishzade", 500),
         new Employee("Xalid", "Nasibov", 1000));

        Function<Employee, String> formatCard = p -> "Name: {" + p.getLastName() + " " + p.getFirstName() + "} - Salary: $" + p.getSalary();
        
        Function<Employee, Double> salaryPicker = Employee::getSalary;

        employees.forEach(p -> {
            System.out.println(formatCard.apply(p));
            System.err.println(salaryPicker.apply(p));
            System.out.println();
        });
    }
}   
