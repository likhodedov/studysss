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
     /* try(BufferedReader br = new BufferedReader(new FileReader(dirPath+"//"+args[0]))) {
            while((line = br.readLine()) != null){
                System.out.println(line);
             if (args[1]=="-l")
                //isDigit(line);
                count++;
                dan.get(Integer.parseInt(line));
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found  " + e);
        } catch (IOException e) {

        }*/

        File file_output = new File("output.txt");
        try {
            if(!file_output.exists()){
                file_output.createNewFile();
            }}
            catch(IOException e)
            {
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
