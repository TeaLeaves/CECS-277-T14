/**
 *  CECS 277 Project 5
 *  @authors: Matthew Chen, Ryan Ignasiak, Tina Vu
 *  Due Date: 11/09/20
 *  Professor Mimi Opkins
 *  Summary: a program that generates a To-Do List
 */
import java.util.*;
public class ToDoList {
    //values
    PriorityQueue<Task> list = new PriorityQueue(); //empty queue

    /**
     * default constructor = new Priority Queue
     */
    public ToDoList(){
        PriorityQueue<Task> list = new PriorityQueue();
    }

    /**
     * add tasks ('add' priority(1-9) description)
     */
    public void addTask(String task){
        try {
            //separate the string into a list
            String[] split = task.split(" ");
            //create priority integer
            int priority = Integer.parseInt(split[1]);
            //create the description string
            String description = "";
            for(int i = 2; i < split.length; i++){
                description = description + split[i] + " ";
            }

            //length not right
            if (split.length < 3) {
                System.out.println("Input Error. No Description Found");
            }
            //if add is not the first command
            else if (!split[0].toLowerCase().equals("add")) {
                System.out.println("The priority must be an integer between 1 and 9");
            //priority number is not btw 1-9
            } else if (priority < 1 || priority > 9) {
                System.out.println("The priority must be an integer between 1 and 9");
            }
            else{
                //create Task(priority, description)
                Task newTask = new Task(priority, description);

                //array of string diff or same
                ArrayList<String> answerList = new ArrayList<String>();
                //check if this task already exist in list
                for(Task loop: list){
                    //if description already exist
                    if(loop.getDescription().equals(description)){
                        //prints out the hashcode
                        System.out.println("Task Already Exists: ");
                        System.out.println("Your Input: " + newTask.hashCode());
                        System.out.println("Prior Input: " + loop.hashCode());
                        answerList.add("same description");
                    }
                    //if priority number is already used
                    else if(loop.compareTo(newTask) == 0){
                        answerList.add("same number");
                    }
                    //they are different
                    else {
                        answerList.add("diff");
                    }
                }

                //if it had the description already
                if(answerList.contains("same description")){
                    System.out.print("");
                }
                //if the number is already used
                else if(answerList.contains("same number")){
                    System.out.println("Priority Number Already Used");
                }
                else {
                    //add task to list
                    list.add(newTask);
                }
            }
        }
        //if 2nd command, priority number, is not a number or does not exist
        catch (NumberFormatException e){
            System.out.println("The priority must be an integer between 1 and 9");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Input Error. No Priority and Description Found");
        }
    }

    /**
     * removes and prints most urgent task
     */
    public void nextTask(){
        //if list is NOT empty
        if(list.size() > 0){
            System.out.println(list.poll().getDescription());
        }
        //else list is empty
        else{
            System.out.println("There are no tasks in the list.");
        }
    }

    /**
     * @Override the toString
     * @return a string of the Task List
     */
    public String toString() {
        String output = "";
        for(Task singleValue: list){
            output = output + singleValue.toString() + "\n";
        }
        return output;
    }
}
