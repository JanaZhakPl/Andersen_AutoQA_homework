package lesson7;

import java.io.*;

public class AppData {

    private String[] header = {"Value 1", "Value 2", "Value 3"};
    private int[][] data = {{100, 200, 123}, {200, 300, 500}};


    public AppData() {
    }

    public String[] getHeader() {
        return header;
    }

    public int[][] getData() {
        return data;
    }

    public void save(String fileName) {
        try (PrintWriter in = new PrintWriter(fileName)) {
            for (int i = 0; i < getHeader().length; i++) {
                if (i < getHeader().length - 1) {
                    in.write(getHeader()[i] + "; ");
                } else {
                    in.write(getHeader()[i]);
                }
            }
            in.append('\n');
            for (int i = 0; i < getData().length; i++) {
                for (int j = 0; j < getData()[i].length - 1; j++) {
                    in.print(getData()[i][j] + "; ");
                }
                in.println(getData()[i][getData()[i].length - 1]);
            }
            in.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void load(String fileName) {
        try (BufferedReader out = new BufferedReader(new FileReader(fileName))) {
            String str;
            while ((str = out.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}