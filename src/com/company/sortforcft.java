package com.company;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 * Created by d.lihodedov on 13.09.2016.
 */
public class sortforcft {
    public static void main(String[] args)  {
        try {
        String line = null;
        int count=0;
        String myJarPath = sortforcft.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        String dirPath = new File(myJarPath).getParent();
        Paths.get(dirPath).toAbsolutePath();

        //System.out.println(dirPath);
        ArrayList<String> dan = new ArrayList<String>();
       // if (!isDigit(str)) System.out.println("строка");
       // else System.out.println("число");
      try(BufferedReader br = new BufferedReader(new FileReader(dirPath+"//"+args[0]))) {
          //----- ЕСЛИ ЧИСЛО
          if (args[1].equals("-i")){
          while((line = br.readLine()) != null)
          {
              if (line.length()!=0)
              {
                 //System.out.println(line);
                 if (!isDigit(line))
                    {
                     System.out.println("Присутствует строка вместо числа. Программа остановлена");
                     break;
                    }
                  dan.add(line);
                  count++;
              }
          }}



//-----------------------------
              else if (args[1].equals("-s"))
                {
                    while((line = br.readLine()) != null)
                    {
                        if (line.length()!=0)
                        {
                            //System.out.println(line);
                            if ((isDigit(line))|(line.matches(".*\\d+.*")))//или добавить что есть цифра в строке
                            {
                                System.out.println("Присутствует число в строках или цифры. Программа остановлена");
                                break;
                            }
                            dan.add(line);
                            count++;
                        }
                    }
                }
//----------------------------------------------------------------------

          if (count>=100) {
              System.out.println("Too many elements at file");
              return;
          }

        } catch (FileNotFoundException e) {
            System.out.println("File not found  ");
        } catch (IOException e) {
          System.out.println("something wrong with file ");
        }
//--------------сортировка строк от a до я
       if (args[1].equals("-s")){
            int in,out;
            for (out=1;out<dan.size();out++)
            {
                String temp=dan.get(out);
                in=out;
                if (args[2].equals("-a")){
                while((in>0) && (dan.get(in-1).compareTo(temp))>0)
                {
                    dan.set(in,dan.get(in-1));
                    --in;
                }}
                else if (args[2].equals("-d")) {
                while((in>0) && (dan.get(in-1).compareTo(temp))<0)
                {
                    dan.set(in,dan.get(in-1));
                    --in;
                }}
                dan.set(in,temp);
            }
        }


 //-------------Сортировка чисел
            if (args[1].equals("-i")){
                int in,out;
                for (out=1;out<dan.size();out++)
                {
                    int temp=Integer.parseInt(dan.get(out));
                    in=out;
                    if (args[2].equals("-a")){
                        while((in>0) && (Integer.parseInt(dan.get(in-1))>temp))
                        {
                            dan.set(in,dan.get(in-1));
                            --in;
                        }}
                    else if (args[2].equals("-d")) {
                        while((in>0) && (Integer.parseInt(dan.get(in-1))<temp))
                        {
                            dan.set(in,dan.get(in-1));
                            --in;
                        }}
                    dan.set(in,Integer.toString(temp));
                }
            }
//---------------запись результата в файл
        Writer writer = null;
        //System.out.println(count);
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
//----------------------
    }
    catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Не хватает аргументов");
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
