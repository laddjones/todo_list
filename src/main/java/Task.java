import java.time.LocalDateTime;

public class Task {
    private String name;
    private int priority;
    private String dueDate;
    private boolean status;

    public Task(String name, int priority, String dueDate, boolean status) {
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    public String getDueDate() {
        return dueDate;
    }
    public boolean getStatus() {

        return status;
    }
    public void toString2() {
        System.out.println("Task name: " + name + "priority: " + priority + "Due Date: " + dueDate + "Status: " + status);
    }

}

//public String printOut() { //sdfdsfsdfsdfsdf
  // return String.format(" %s | %f | %d ", name, enginevolume, price) ;
