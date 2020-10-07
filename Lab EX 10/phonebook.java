import java.io.*;
import java.util.Scanner;

public class phonebook {
    public static void main(String[] args) {

        try {
            Scanner obj = new Scanner(System.in);
            int flag = 0;
            String str1[] = { "Nandha-9715928749", "Kumar-6369807381", "Jothi-9876543210", "javidth-9123456780",
                    "Arnoldthambi-9999999999" };
            BufferedWriter bw = new BufferedWriter(new FileWriter("phonebook.txt"));
            BufferedReader br = new BufferedReader(new FileReader("phonebook.txt"));
            for (String str2 : str1) {
                bw.write(str2);
                bw.newLine();
            }
            bw.close();
            System.out.println("Enter a name to search in PhoneBook");
            String str3 = obj.next();
            String str4;
            while ((str4 = br.readLine()) != null) {

                if (str4.contains(str3)) {
                    String str5[] = str4.split("-");
                    System.out.println(str3 + "'s Contact: " + str5[1]);
                    break;
                } else
                    flag = -1;
            }
            if (flag == -1)
                System.out.println(str3 + "'s Contact is not available in PhoneBook");
            br.reset();
            br.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
