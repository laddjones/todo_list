import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.io.*;
import java.time.LocalDateTime;


public class ToDoList {

    private Goal[] yourGoals;
    private Task[] yourTasks;
    private int counter;
    public static String username;
    public static Object[][] finalArray;


    public static void main(String[] args) throws IOException {
        System.out.println("Type in your username ");
        Scanner input = new Scanner(System.in);
        username = input.nextLine();
        if (isInFile()) {  // !(username.exists())
           System.out.println("What is the name of your goal: ");
           Scanner inputGoal = new Scanner(System.in);
           String thereGoal = input.nextLine();

           System.out.println("would you like to add a task: ");
           Scanner inputResponse = new Scanner(System.in);
           String thereResponse = input.nextLine();


           System.out.println("What is the name of your task: ");
           Scanner inputTask = new Scanner(System.in);
           String thereTask = input.nextLine();
          // thereTask;
          System.out.println("What is the priority of your task: ");
          Scanner inputPriority = new Scanner(System.in);
          int therePriority = input.nextInt();

          System.out.println("What is the due date of your task: ");
          Scanner inputDueDate = new Scanner(System.in);
          String thereDueDate = input.nextLine();


          System.out.println("What is the status of your task: ");
          Scanner inputStatus = new Scanner(System.in);
          boolean thereStatus = input.nextBoolean();

          Goal accessory = new Goal(thereGoal);
          addGoals(thereGoal);
          accessory.addTask(thereTask, therePriority, thereDueDate, thereStatus);



           // print out that you have nothing in you to do list if its empty
           //ask the user what they want to do now (enter stuff etc)(they enter stuff in the same method)
           // (they can print out there to do list again now if they want)
        }
        else {
           ToDoList newList = new ToDoList();
          //  newList.makeToDoList();
        }


    }

    public static boolean isInFile() {  //scanner users.csv for name of the person
        Scanner scan = new Scanner(username + ".csv");
        while (scan.hasNextLine()) {
            if (scan.nextLine().equals(username)) {
                return true;
            }
        }
        System.out.print("You are not allowed in the system ");
        return false;
      }



//
//     public void makeToDoList() {
//         yourGoals = new Goal[10];
//         counter = 0;
//         File file = new File("Desktop/cs1331/hw-todo-list-master/src/main/java/" + username + ".csv");
//         Scanner newScanner = new Scanner(new File(file));
//         if(file.exists()) {
//
//             Goal [] thereGoals = new Goal[10];
//             Task [] thereTasks = new Task[10];
//
//             while (newScanner.hasNextLine()) {
//                 int i = 0;
//                 String line = scan.nextLine(); // each line is a goal
//                 String [] firstLineSplit = line.split(",");
//                 thereGoals[i] = firstLineSplit[0];
//                 for (int j = 1;  j <= firstLineSplit.length; j++) {
//                     String [] taskSplit = firstLineSplit[j].split("\\|");
//
//                     System.out.println(Arrays.toString(taskSplit));
//                     System.exit(1);
//                 }
//                 thereTasks[j] = Task(taskSplit[0], taskSplit[1], taskSplit[2], taskSplit[3]);
//
//                 }
//                 i++;
//             }
//               //convert to goals and tasks, dont print here just fill it up, splice and shit
//         else {
//           System.out.println(thereGoal);
//           System.out.println(thereGoal);
//
//         }
//       }
//
//
//
//
    // public static void addGoals(String thereGoal) {
    //    if(counter < 10) {
    //        yourGoals[counter] = Goal(goalName);
    //        finalArray[counter][0] = yourGoals[counter];
    //        counter++;
    //
    //    }
    // }
    public static void addGoals(String thereGoal) {
      System.out.print("just do it ");
    }
//
//     public  Object[][] setFinalArray(int rowPosition, int colPosition, String input) {
//         finalArray[rowPosition][colPosition] = input;
//     }
//     public Object[][] getFinalArray() {
//         return finalArray;
//     }
//
// }
}
