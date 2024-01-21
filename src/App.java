import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        empdao dae=new empimp();
        System.out.println("WELCOME TO EMPLOYE MANAGEMENT APPLICATION");
        Scanner s = new Scanner(System.in);
        do {
            System.out.println("1.ADD EMPLOYEEE\n" + "2.SHOW ALL EMPLOYEE\n" + "3.SHOW EMPLOYEE BASED ON ID\n"
                    + "4.UPDATE THE EMPLOYEE\n" + "5.DELETE THE EMPLOYEE\n");
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                employee emp=new employee();
                System.out.println("id");
                int id=s.nextInt();
                System.out.println("name");
                String name=s.next();
                System.out.println("salary");
                int salary=s.nextInt();
                System.out.println("age");
                int age=s.nextInt();
                emp.setId(id);
                emp.setName(name);
                emp.setSalary(salary);
                emp.setAge(age);
                    dae.createemp(emp);
                    break;
                    case 2:
                    dae.showemp();
                    break;
                    case 3:
                    System.out.println("enter the emailId" );
                    int empid=s.nextInt();
                    dae.byid(empid);
                    break;
                    case 4:
                    System.out.println("ENTER ID TO UPDATE NAME");
                    int emid=s.nextInt();
                    System.out.println("enter the new name");
                    String name1=s.next();
                    dae.upemp(emid, name1);
                    break;
                    case 5:
                    System.out.print("enter the delete id");
                    int id1=s.nextInt();
                    dae.deleteemp(id1);
                    break;
                default:
                    System.out.println("enter the valid choice");
                    break;

            }
        } while (true);
    }
}
