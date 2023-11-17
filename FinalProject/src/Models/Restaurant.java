package Models;
import java.util.Scanner;

import Interfaces.Interface;

public class Restaurant implements Interface{

    private static final Scanner scanner = new Scanner(System.in);
    @Override
    public void welcome() {
        System.out.print("What would you like to do today?\n1 - Check-in\n2 - Make an appointment\n3 - Check Hours and Capacity");
        int welcomeChoice = scanner.nextInt();
        restaurantResponse userResponse = restaurantResponse.fromInt(welcomeChoice);
        if (userResponse != null) {
            if (userResponse == restaurantResponse.checkin){
                appointment();
            }
            if (userResponse == restaurantResponse.makeAppointment){
                checkin();
            }
            if (userResponse == restaurantResponse.check){
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
    public enum restaurantResponse {
        checkin(1),
        makeAppointment(2),
        check(3);

        private int value;

        restaurantResponse(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static restaurantResponse fromInt(int i) {
            for (restaurantResponse r : restaurantResponse.values()) {
                if (r.getValue() == i) {
                    return r;
                }
            }
            return null;
        }
    }
}
