/**
 * CECS 277 Project 5
 * @authors: Matthew Chen, Ryan Ignasiak, Tina Vu
 * Due Date: 11/09/20
 * Professor Mimi Opkins
 * Summary: Uncompleted ToDoListTester that is given,
 * now completed with the equals and hashcode methods
 */
public class ToDoListTester {
    public static void main(String[] args)
    {
        ToDoList list = new ToDoList();
        System.out.println("Adding the following 6 items to the list.");
        System.out.println("\"add 1 Complete Programming Exercise 15.11\"");
        System.out.println("\"add 8 Read for tomorrow's class\"");
        System.out.println("\"add 3 Soccer practice\"");
        System.out.println("\"add 6 Call parents\"");
        System.out.println("\"add 5 Have dinner with friends\"");
        System.out.println("\"add 9 Sleep well\"");
        System.out.println("------------------------------------------------------------");
        list.addTask("add 1 Complete Programming Exercise 15.11");
        list.addTask("add 8 Read for tomorrow's class");
        list.addTask("add 3 Soccer practice");
        list.addTask("add 6 Call parents");
        list.addTask("add 5 Have dinner with friends");
        list.addTask("add 9 Sleep well");
        System.out.println();
        System.out.println("Enter Repeated Command");
        System.out.println("add 2 Call parents");
        list.addTask("add 2 Call parents");
        System.out.println("Expected: 'Task Already Exists: inputted task, prior task'");
        System.out.println();
        System.out.println("Entering 'add bad command'");
        list.addTask("add bad command");
        System.out.println("Expected: The priority must be an integer between 1 and 9.");
        System.out.println();
        System.out.println("Entering 'add 12 command'");
        list.addTask("add 12 command");
        System.out.println("Expected: The priority must be an integer between 1 and 9.");
        System.out.println();
        System.out.println("add -12 command");
        list.addTask("add -12 command");
        System.out.println("Expected: The priority must be an integer between 1 and 9.");
        System.out.println();
        System.out.println("add 9 command");
        list.addTask("add 9 command");
        System.out.println("Expected: Priority Number Already Used");
        System.out.println();
        System.out.println("Entering 'add 4'");
        list.addTask("add 4");
        System.out.println("Expected: Input Error. No Description Found");
        System.out.println();
        System.out.println("Entering 'add'");
        list.addTask("add");
        System.out.println("Expected: Input Error. No Priority and Description Found");
        System.out.println();
        System.out.println("------------------------------------------------------------");
        System.out.println("Pulling most urgent items out.");
        System.out.println();
        list.nextTask();
        System.out.println("Expected: Complete Programming Exercise 15.11");
        System.out.println();
        list.nextTask();
        System.out.println("Expected: Soccer practice");
        System.out.println();
        list.nextTask();
        System.out.println("Expected: Have dinner with friends");
        System.out.println();
        list.nextTask();
        System.out.println("Expected: Call parents");
        System.out.println();
        list.nextTask();
        System.out.println("Expected: Read for tomorrow's class");
        System.out.println();
        list.nextTask();
        System.out.println("Expected: Sleep well");
        System.out.println();
        list.nextTask();
        System.out.println("Expected: There are no tasks in the list.");
    }
}
