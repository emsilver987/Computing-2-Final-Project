import java.util.Scanner;
import Models.Gym;
import Models.Member;


public class App {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Member member = obtainMemberDetails();
        if (member != null) {
            FacilityChoice(member);
        } else {
            System.out.println("Member not found.");
        }
    }

    public static Member obtainMemberDetails() {
        System.out.print("Welcome to Silverthorne Country Club\nIt's great to see you\nPlease enter your Member Number: ");
        int memberNumber = scanner.nextInt();
        return Member.getMemberByNumber(memberNumber);
    }

    public static void FacilityChoice(Member member) {
        System.out.print("What Facility Would you like to visit today?\nGym = 1\nPool = 2\nRestaurant = 3\n");
        int facilityChoice = scanner.nextInt();
        Response userResponse = Response.fromInt(facilityChoice);
        if (userResponse != null) {
            System.out.println("Hello " + member.getName() + " (Member " + member.getMemberNumber() + "), Welcome to the " + userResponse);
            if (userResponse == Response.Gym){
                Gym gym = new Gym();
                gym.welcome();
                
            }
            if (userResponse == Response.Pool){

            }
            if (userResponse == Response.Restaurant){

            }
        } else {
            System.out.println("Invalid response");
        }

    }
    
    public enum Response {
        Gym(1),
        Pool(2),
        Restaurant(3);

        private int value;

        Response(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public static Response fromInt(int i) {
            for (Response r : Response.values()) {
                if (r.getValue() == i) {
                    return r;
                }
            }
            return null;
        }
    }
}