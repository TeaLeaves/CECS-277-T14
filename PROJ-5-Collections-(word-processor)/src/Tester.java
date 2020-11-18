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
        wordProcessor commandqueue = new wordProcessor();

        commandqueue.processCommand("insert J");
        commandqueue.processCommand("insert K");
        commandqueue.processCommand("insert L");
        commandqueue.processCommand("move left");
        commandqueue.processCommand("move right");
        commandqueue.processCommand("move left");
        commandqueue.processCommand("move left");
        commandqueue.processCommand("search K");
    }
}