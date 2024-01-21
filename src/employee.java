public class employee {
    private int id;
    private String name;
    private int salary;
    private int age;
    private int memory;
    public employee(){
        
    }
    
    public employee(int id, String name, int salary, int age, int memory) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.memory = memory;
    }
    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
}
