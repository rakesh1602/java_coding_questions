import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortEmployeeBySalary {

    static class Employee {
        public Employee(String name, Long salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Long getSalary() {
            return salary;
        }

        public void setSalary(Long salary) {
            this.salary = salary;
        }

        String name;
        Long salary;

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", salary=" + salary +
                    '}';
        }
    }


    private static List<Employee> sortEmployeeBasedOnSalary(List<Employee> employeeList) {
        return employeeList.stream()
                .sorted(Comparator.comparing(employee -> employee.salary))
                .collect(Collectors.toList());
    }

    private static List<Employee> sortEmployeeBasedOnSalaryReverse(List<Employee> employeeList) {
        return employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("suresh", 8000L),
                new Employee("ramesh", 900000L),
                new Employee("rakesh", 6000L)
        );
        List<Employee> sortEmployeeBasedOnSalary = sortEmployeeBasedOnSalary(employeeList);
        System.out.println("sortEmployeeBasedOnSalary = " + sortEmployeeBasedOnSalary);

        List<Employee> sortEmployeeBasedOnSalaryReverse = sortEmployeeBasedOnSalaryReverse(employeeList);
        System.out.println("sortEmployeeBasedOnSalaryReverse = " + sortEmployeeBasedOnSalaryReverse);
    }
}
