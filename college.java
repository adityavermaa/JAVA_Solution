class member{
    String name();
    int age();
    int phoneNumber();
    String address();
    int salary();
        public int printSalary(){
            return salary;
    }
}
class Employee extends member{
    String specialization();
}
class Manager extends member{
    String department();
}

public class college{
    public static void main(String[] args){
        Employee x = new Employee();
        x.name = "Aditya Verma";
        x.age = 20;
        x.phoneNumber = 6350237211;
        x.address = "Raja Park";
        x.salary = 2000;
        Manager m = new Manager();
    }
}