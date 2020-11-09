/**
 *  CECS 277 Project 5
 *  @authors: Matthew Chen, Ryan Ignasiak, Tina Vu
 *  Due Date: 11/09/20
 *  Professor Mimi Opkins
 *  Summary: a program that generates a Task
 */
import java.util.*;
public class Task implements Comparable<Task>{
    //values
    int priority; //num from 1-9
    String description; //task have to do

    /**
     * default constructor
     */
    public Task(){
        priority = 0;
        description = "";
    }

    //argument constructor
    public Task(int num, String notes){
        setPriority(num);
        setDescription(notes);
    }

    //mutator
    /**
     * set the priority with the given param
     * @param priority the given param, integer from 1-9
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }

    /**
     * set the description with the given param
     * @param description the task we have to do
     */
    public void setDescription(String description) {
        this.description = description;
    }

    //accessors

    /**
     * get the priority number of the task
     * @return the priority number (1-9)
     */
    public int getPriority() {
        return priority;
    }

    /**
     * get the description of the task
     * @return the task description
     */
    public String getDescription() {
        return description;
    }

    /**
     * Override the hashcode to ONLY return description
     * @return the description of the task
     */
    @Override
    public int hashCode() {
        return description.hashCode();
    }

    /**
     * COMPARE THE DESCRIPTION
     * @param o the other description we are comparing with
     * @return true if the description are the same
     */
    @Override
    public boolean equals(Object o) {
        Task other = (Task) o;
        //if equals
        if(other.getDescription().toLowerCase().equals(description.toLowerCase())){
            return true;
        }
        return false;
    }

    /**
     * COMPARE THE PRIORITY NUMBERS
     * @param o the other task we are comparing with
     * @return number that represent which is greater
     */
    @Override
    public int compareTo(Task o) {
        //compare the priority number of this task and the other task
        //if this priority is greater than the other priority number
        if(priority > o.getPriority()){
            return 1;
        }
        //if this priority is equal to the other priority number
        else if(priority == o.getPriority()){
            return 0;
        }
        //if this priority is less than the other priority number
        else{
            return -1;
        }
    }

    @Override
    public String toString() {
        return priority + ") " + description;
    }
}
