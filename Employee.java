public class Employee {
    int id;
    String name;
    public Employee(int a, String name) {
        this.id = a;
        this.name = name;
    }
    public static void main(String[] args){
        Employee myObj = new Employee(4706,"bristi");
        System.out.println("My id is" +" "+ myObj.id);
        System.out.println("My name is"+" " +myObj.name);


    }

}
