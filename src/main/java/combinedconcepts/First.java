package combinedconcepts;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class First
{

    public static void main(String[] args) {

        List<Employee> list= List.of(new Employee("Sai",45000.0),new Employee("Chandu",98765.9),new Employee("Jenny",98789.9));

        OptionalDouble rs=list.stream()
                .mapToDouble(Employee::getSalary)
                .average();

        rs.ifPresent(System.out::println);
    }
}


class Employee
{
    String name;
    Double salary;

    Employee(String name,Double salary)
    {
        this.name=name;
        this.salary =salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return "Name : "+name+" ,Salary : "+ salary;
    }
}
