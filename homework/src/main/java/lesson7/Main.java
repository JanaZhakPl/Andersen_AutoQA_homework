package lesson7;


import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        AppData appData = new AppData();
        appData.save("text.csv");
        appData.load("text.csv");

        System.out.println(Arrays.toString(appData.getHeader()));
        System.out.println(Arrays.deepToString(appData.getData()));
    }
}





