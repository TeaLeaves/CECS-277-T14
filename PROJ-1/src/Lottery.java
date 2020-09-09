/**
 * CECS 277 Sec 07
 * Project 1 - Lottery ArrayList
 * Professor Mini Opkins
 * Team 14: Tina Vu, Matthew Chen, Ryan Ignasiak
 * 09/09/2020
 */
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;
import java.util.Collections;

/**
 * Simulate the generation of 'Quick Pick Lottery' that requires a
 * generation of 6 different numbers from int 1-49
 */
public class Lottery {

    //ask user how many lottery tickets they want then generate those tickets
    public static void main(String args[]){

        //open scanner
        Scanner in = new Scanner( System.in );

        //ask user for input
        System.out.println("How many Lottery Tickets: ");
        int numTickets = in.nextInt();

        //continue to ask for input if not valid
        while( numTickets <= 0 ){
            numTickets = in.nextInt();
        }

        int numArrays = 0;
        //generate that number of arraylists
        while( numTickets != numArrays){
            //generate arraylist
            ArrayList<Integer> ticket = new ArrayList<Integer>();

            //generate lottery number
            int lotteryNum = (int) (49 * Math.random()) + 1;

            //add lottery number into the array
            ticket.add(lotteryNum);

            //generate 5 more random lottery numbers into an arraylist
            for(int i = 0; i < 5; i++){
                //generate next lottery number
                int nextLotteryNum = (int) (49 * Math.random()) + 1;

                //make sure the number is unique in the arraylist
                for(int j = 0; j < ticket.size(); j++){
                    //if it is not unique then generate a new lottery number
                    if(ticket.get(i) == nextLotteryNum){
                        nextLotteryNum = (int) (49 * Math.random()) + 1;
                    }
                }

                //add the lottery number into the array
                ticket.add(nextLotteryNum);
            }

            //sort the lottery numbers in the ticket from least to greatest
            Collections.sort(ticket);

            //print the lottery ticket
            System.out.println("[ " + ticket.get(0) + ", " + ticket.get(1) + ", " +
                    ticket.get(2) + ", " + ticket.get(3) + ", " + ticket.get(4) + ", " +
                    ticket.get(5) + " ]");

            //finished with one lottery ticket so increase numArrays +1
            numArrays +=1;
        }
    }
}
