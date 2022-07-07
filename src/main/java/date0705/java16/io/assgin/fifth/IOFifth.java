package date0705.java16.io.assgin.fifth;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IOFifth {
    public static void main(String[] args) throws IOException {
//        \\s 代表多个空格
        File file = new File("dir\\score.txt");
        File fileHigh = new File("dir\\score_highscore.txt");
        File fileMiddle = new File("dir\\score_middlescore.txt");
        File fileLow = new File("dir\\score_lowsocore.txt");

        Reader reader = new FileReader(file);
        BufferedReader fbr = new BufferedReader(reader);

        Writer writerHigh = new FileWriter(fileHigh);
        BufferedWriter fhbw = new BufferedWriter(writerHigh);

        Writer writerMiddle = new FileWriter(fileMiddle);
        BufferedWriter fmbw = new BufferedWriter(writerMiddle);

        Writer writerLow = new FileWriter(fileLow);
        BufferedWriter flbw = new BufferedWriter(writerLow);

        String str = fbr.readLine();
        fbr.close();
        String[] strFile = null;
        if (str != null) {
            strFile = str.split("\\s");
        }
        String[] strings = new String[strFile.length];
        for (int i = 0;i < strFile.length;i++){
            int index = strFile[i].lastIndexOf("-");
            strings[i] = strFile[i].substring(index + 1);
        }

        for (int i = 0; i < strings.length; i++) {
            int score = Integer.parseInt(strings[i]);
            if (score > 90) {
                fhbw.write(strFile[i] + " ");
                fhbw.flush();
            } else if (score > 75) {
                fmbw.write(strFile[i] + " ");
                fmbw.flush();
            } else {
                flbw.write(strFile[i] + " ");
                flbw.flush();
            }
        }
        fhbw.close();
        fmbw.close();
        flbw.close();




    }
}
