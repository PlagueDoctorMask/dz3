public class Employee implements Comparable<Employee>{
    private static final int Current_Year = 2024;
    protected String name;
    protected String post;
    protected int birth;
    protected int number;
    protected int salary;

    Employee(String name, String post, int birth, int salary){
        this.name = name;
        this.post = post;
        this.birth = birth;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getPost() {
        return post;
    }

    public int getAge() {
        return Current_Year - birth;
    }

    public int getNumber() {
        return number;
    }

    public int getSalary() {
        return salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee e) {
        if (Current_Year - birth == e.getAge()) {
            return 0;
        }
        if (Current_Year - birth < e.getAge()) {
            return -1;
        }
        return 1;
    }
}
