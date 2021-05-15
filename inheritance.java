class Employee{
    String name;
    int age;
    int phone;
    String add;
    int salary;
    void printSalary(){ 
        System.out.println(salary);
    }
}
class Officer extends Employee{
    String specialization;
    Officer() {
        System.out.println("name: "+name+"\nage: "+age+"\n: "+phone+"\naddress: "+add+"\nSalary: "+salary);
        System.out.println(specialization);
    
    }   
}
class Manager extends Employee{
    String department;
    Manager() {
        System.out.println("name: "+name+"\nage: "+age+"\nphone: "+phone+"\naddress: "+add+"\nSalary: "+salary);
        System.out.println(department);
    }
    void diplay(){
        System.out.println(department);
    }
}

class inheritance{
    public static void main(String[] args) {
        Employee e=new Employee();
        e.name="alimiyan";
        e.age=21;
        e.phone=9744;
        e.add="abc";
        e.salary=1234;
        Manager m=new Manager();
        m.department="cse";
        m.diplay();
        Officer o=new Officer();
        o.specialization="principal";
        e.printSalary();
    }
}
