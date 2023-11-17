package Models;
import java.util.Scanner;

import Interfaces.Interface;

public class Pool implements Interface{

    private static final Scanner scanner = new Scanner(System.in);
    @Override
    public void welcome() {
        System.out.print("What would you like to do today?\n1 - Check-in\n2 - Make an appointment\n3 - Check Hours and Capacity");
        int welcomeChoice = scanner.nextInt();
        poolResponse userResponse = poolResponse.fromInt(welcomeChoice);
        if (userResponse != null) {
            if (userResponse == poolResponse.checkin){
                appointment();
            }
            if (userResponse == poolResponse.makeAppointment){
                checkin();
            }
            if (userResponse == poolResponse.check){
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
    public enum poolResponse {
        checkin(1),
        makeAppointment(2),
        check(3);

        private int value;

        poolResponse(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static poolResponse fromInt(int i) {
            for (poolResponse r : poolResponse.values()) {
                if (r.getValue() == i) {
                    return r;
                }
            }
            return null;
        }
    }
}
