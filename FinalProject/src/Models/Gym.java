package Models;
import java.util.Scanner;

import Interfaces.Interface;

public class Gym implements Interface{

    private static final Scanner scanner = new Scanner(System.in);
    @Override
    public void welcome() {
        System.out.print("What would you like to do today?\n1 - Check-in\n2 - Make an appointment\n3 - Check Hours and Capacity");
        int welcomeChoice = scanner.nextInt();
        gymResponse userResponse = gymResponse.fromInt(welcomeChoice);
        if (userResponse != null) {
            if (userResponse == gymResponse.checkin){
                appointment();
            }
            if (userResponse == gymResponse.makeAppointment){
                checkin();
            }
            if (userResponse == gymResponse.check){
                capacity();
                hours();
            }
        } else {
            System.out.println("Invalid response");
        }
    }
    @Override
    public void listMembers() {
    
    }

    @Override
    public void capacity() {
        
    }

    @Override
    public void hours() {

    }

    @Override
    public void appointment() {
        
    }
    @Override
    public void checkin() {
    
    }
    public enum gymResponse {
        checkin(1),
        makeAppointment(2),
        check(3);

        private int value;

        gymResponse(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static gymResponse fromInt(int i) {
            for (gymResponse r : gymResponse.values()) {
                if (r.getValue() == i) {
                    return r;
                }
            }
            return null;
        }
    }
}
