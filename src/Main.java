import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] test = new String[2];
        test[0] = "serdg";
        test[1] = "897z34wr";


        ArrayList<String> testList = new ArrayList<>();

        for (int i = 0; i < test.length; i++) {
            testList.add(test[i]);
        }

        for (String s : test) {
            testList.add(s);
        }
    }
}
