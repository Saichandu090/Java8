package stramapi;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Fifth {
    public static void main(String[] args) {
        List<Employee> list = List.of(new Employee("Sai Chandu", "Software"), new Employee("Jenny", "Software"), new Employee("Vamsi", "Electrical"), new Employee("Sowmya", "TPRM"));

        Map<String, List<Employee>> ls = list.stream()
                .collect(Collectors.groupingBy(Employee::getDept));

        ls.forEach((k, v) -> {
            System.out.println(k + "->");
            v.forEach(System.out::println);
        });//BiConsumer for Map
    }
}

class Employee
{
    String name;
    String dept;

    Employee(String name,String dept)
    {
        this.name=name;
        this.dept=dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString()
    {
        return "Name : "+name+" ,Dept : "+dept;
    }
}
