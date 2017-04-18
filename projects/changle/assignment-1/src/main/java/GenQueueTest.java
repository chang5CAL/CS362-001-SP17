//Code from Tutorials Point
//http://www.tutorialspoint.com/javaexamples/data_queue.htm

public class GenQueueTest {
    public static void main(String[] args) {
        GenQueue<Employee> empList;
        empList = new GenQueue<Employee>();
        GenQueue<HourlyEmployee> hList;

        hList = new GenQueue<HourlyEmployee>();
        hList.enqueue(new HourlyEmployee("T", "D"));
        hList.enqueue(new HourlyEmployee("G", "B"));
        hList.enqueue(new HourlyEmployee("F", "S"));
        empList.addItems(hList);
        System.out.println("The employees' names are:");

        while (empList.hasItems()) {
            Employee emp = empList.dequeue();
            System.out.println(emp.firstName + " " + emp.lastName);
        }
    }
}

class Employee {
    public String lastName;
    public String firstName;
    public Employee() {
    }
    public Employee(String last, String first) {
        this.lastName = last;
        this.firstName = first;
    }
    public String toString() {
        return lastName + " " + firstName;
    } //Reversed order of names
}

class HourlyEmployee extends Employee {
    public double hourlyRate;
    public HourlyEmployee(String last, String first) {
        super(last, first);
    }
}