package Models;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeMembers{
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            Member member = Member.getMemberByNumber(i);
            if (member != null) {
                try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("member_" + i + ".ser"))) {
                    out.writeObject(member);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}