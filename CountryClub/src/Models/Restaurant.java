package Models;

import java.util.Scanner;

import BaseClasses.CapacityCheckinBase;

public class Restaurant extends CapacityCheckinBase {

    private static final Scanner scanner = new Scanner(System.in);

    public static void welcome(int number){
        System.out.print("What would you like to do today?\n1 - See who's in this facility\n2 - Check hours\n3- Make an Appointment");
        CapacityCheckinBase checkin = new CapacityCheckinBase(10);
        checkin.Checkin(null);
        int choice = scanner.nextInt();
        if (choice ==1){
            listMembers();
        }
        else if (choice == 2){
            hours();
        }
        else if (choice == 3){
            checkin.Checkin(null);
        }
        else {
            welcome(number);
        }

    }
    public static void listMembers(){

    }
    public static void hours(){
        
    }
    public Restaurant(int capacity)
    {
        super(capacity);
    }

}
