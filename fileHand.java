import java.io.*;
import java.util.Scanner;

public class fileHand {
    public static void main(String[] args) {
        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("outagain.txt"));
            Scanner userInput = new Scanner(System.in);

            String input;
            while (!(input = userInput.nextLine()).isEmpty()) {
                out.write(input);
                out.newLine();
                input = null;
            }
            userInput.close();
            out.close();
        } catch (IOException e) {
            System.out.println(e);
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("outagain.txt"));

            String st;

            while ((st = br.readLine()) != null) {
                String[] str = st.split(" ");

                for (int i = 0; i < str.length; i++) {
                    System.out.println(str[i] + "\\\\");
                }

            }
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }

    }

}
