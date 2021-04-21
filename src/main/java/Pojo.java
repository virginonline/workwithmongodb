
public class Pojo {
    private int salary;
    private String name;
    private Jobs job;

    enum Jobs {
        PROGRAMMER,
        LAWYER,
        CHIEF,;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jobs getJob() {
        return job;
    }

    public void setJob(Jobs job) {
        this.job = job;
    }

    public Pojo(int salary, String name, Jobs job) {
        this.salary = salary;
        this.name = name;
        this.job = job;
    }
}
