/**
 *  CECS 277 Project 5 Part 2
 *  @authors: Matthew Chen, Ryan Ignasiak, Tina Vu
 *  Due Date: 11/18/20
 *  Professor Mimi Opkins
 *  Summary: a tester so that the user can use the mini word processor
 */
import java.util.*;
public class Tester{
    public static void main(String[] args) {
        wordProcessor wProcessor = new wordProcessor("initial contents");
        Queue<String> commandqueue = new LinkedList<String>();

        commandqueue.add("insert J");
        commandqueue.add("insert K");
        commandqueue.add("insert L");
        commandqueue.add("move left");
        commandqueue.add("move right");
        commandqueue.add("move left");
        commandqueue.add("move left");
        commandqueue.add("search K");
        commandqueue.add("search");
        commandqueue.add("backspace");
        commandqueue.add("move start");
        commandqueue.add("move end");
        commandqueue.add("move left");
        commandqueue.add("delete");
        commandqueue.add("map Q");
        commandqueue.add("move");


        //go through the commands and run it
        for (int i = 0; i < commandqueue.size(); i++){
            if(!commandqueue.isEmpty()) {
                wProcessor.processCommand(commandqueue.poll());
                i--;
            }
        }
    }
}