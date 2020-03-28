import java.time.LocalDateTime;
import java.io.IOException;
import java.util.Scanner;

public class Goal {

    private String goalName;
    private Task[] tasks;
    private boolean statusOfTasks;
    private int numTasks;

    public Goal(String goalName) {
        this.goalName = goalName;
        numTasks = 0;
        tasks = new Task[10];
    }

    public String getGoalName() {
        return goalName;
    }
    public int getNumTasks() {
        return numTasks;
    }
    public Task[] getTasks() {
        return tasks;
    }

    public boolean getStatus() {
        for (int i = 0; i < numTasks; i++) {
            if (!tasks[i].getStatus()) {
                return false;
            }
        }
        return true;
    }

    public void addTask(String nameAdd, int priorityAdd, String dueDateAdd, boolean statusAdd) { //need something else
        for(int i = 0; i < numTasks; i++) {
            if(tasks[i] == null) {
                Task newTask = new Task(nameAdd, priorityAdd, dueDateAdd, statusAdd);
                tasks[i] = newTask;
          //      Object [][] finalArray;
          //      finalArray.setFinalArray(i,0,tasks[i]);
                return;
            }
        }
    }
}

// public void addCar(Car newCar) {
  //  for(int i = 0; i < models.length; i++) {
    //    if(models[i] == null) {
      //      models[i] = newCar;
        //    return;


// public String toString() {
//    String accum = name + "\n";
  //  for(Task task: tasks) {
    //  if(task != null) {
      //  accum += car.toString() + "\n";
    //}
    //return accum;
//}

//public String printOut() {
  //   String accum = name;
    // for(Task task : tasks) {
      //  if(task != null) {
        //    accum += ", " + car.printOut();
        //}
     //}
     //return accum
//}
