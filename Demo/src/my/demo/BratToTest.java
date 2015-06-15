package my.demo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class BratToTest {
    //static BufferedWriter bw;

    public void makeTestFile(){
        Scanner sc2 = null;

        try {
            sc2 = new Scanner(new File(Variables.bratPath + Variables.fileName + ".ann"));
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try {

            File file = new File(Variables.bratPath + "disease.test");

			//file.createNewFile();
            FileWriter fw = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bw = new BufferedWriter(fw);

            int count = 0;
            boolean newLine = true;
            String temp = "";
            while (sc2.hasNextLine()) {
                Scanner s2 = new Scanner(sc2.nextLine());
                count = 0;
                while (s2.hasNext()) {
                    String s = s2.next();
                    if (s.equals("relatedTo")) {
                        System.out.println(s);
                        newLine = false;
                        break;
                    }

                    if (count == 1 || count >= 4) {
                        if (count == 1) {
                            bw.write("-" + "\t");
                        }
                        if (count >= 4) {
                            bw.write(s + " ");
                        }

                        count++;
                    } else {
                        count++;
                    }
                    // count++;

                }
                if (newLine) {
                    bw.write("\n");
                } else {
                    newLine = true;
                }
            }

            bw.close();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
