package com.company;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by d.lihodedov on 13.09.2016.
 */
public class sortforcft {
    public static void main(String[] args) {
      /*  for (int i=0; i<args.length; i++){
            System.out.print(args[i]+"\n");
        }*/
        boolean SORT_ub_voz; //false=убывание, true=возрастание
        boolean SORT_type; // false=числа, true=строки;
        String line = null;
        int count=0;
        String myJarPath = sortforcft.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        String dirPath = new File(myJarPath).getParent();
        Paths.get(dirPath).toAbsolutePath();
        System.out.println(dirPath);
        String str="123";
        ArrayList<String> dan = new ArrayList<String>();
       // if (!isDigit(str)) System.out.println("строка");
       // else System.out.println("число");
      try(BufferedReader br = new BufferedReader(new FileReader(dirPath+"//"+args[0]))) {
            while((line = br.readLine()) != null){
                System.out.println(line);
             //нужна проверка элементов из файла
                dan.add(line);
                count++;
                            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found  " + e);
        } catch (IOException e) {

        }

        Writer writer = null;
        System.out.println(count);
        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(dirPath+"\\output.txt"), "utf-8"));
            for (int i=0;i<dan.size();i++) {
                writer.write(dan.get(i)+System.lineSeparator());

               // Integer.toString(count)
            }
        } catch (IOException ex) {

        } finally {
            try {writer.close();} catch (Exception ex) {/*ignore*/}
        }

    }
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {

            return false;
        }
    }
}
