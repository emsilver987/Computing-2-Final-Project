package Models;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeMembers{
        public static void main(String[] args) {
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("member.ser"))) {
                Member member = (Member) in.readObject();
                System.out.println("Member Number: " + member.getMemberNumber());
                System.out.println("Name: " + member.getName());
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
