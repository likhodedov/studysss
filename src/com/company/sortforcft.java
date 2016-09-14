package com.company;

import java.io.*;
import java.nio.file.Paths;
import java.util.ArrayList;

public class sortforcft {
    public static void main(String[] args)  {
        try {
        String line = null;
        int count=0;
        String myJarPath = sortforcft.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        String dirPath = new File(myJarPath).getParent();
        Paths.get(dirPath).toAbsolutePath();
        ArrayList<String> dan = new ArrayList<String>();
            if (((!args[1].equals("-s"))&&(!args[1].equals("-i")))|((!args[2].equals("-a"))&&(!args[2].equals("-d"))))//||(args[1].equals("-i")))||!((args[2]=="-a")||(args[2]=="-d")))
            {
                System.out.println("Invalid arguments");
                return;
            }
            if ((args.length>3))
            {
                System.out.println("Too much arguments");
                return;
            }
            try(BufferedReader br = new BufferedReader(new FileReader(dirPath+"//"+args[0]))) {
          //-----считывание, если числа
          if (args[1].equals("-i"))
          {
          while((line = br.readLine()) != null)
            {
              if (line.length()!=0)
              {
                 if (!isDigit(line))
                    {
                     System.out.println("Input value is a string instead of a number. Program has stopped");
                     break;
                    }
                  dan.add(line);
                  count++;
              }
            }
          }
//-----------если строки
              else if (args[1].equals("-s"))
                {
                    while((line = br.readLine()) != null)
                    {line=line.replaceAll("\\s","");
                        if (line.length()!=0)
                        {
                            if ((isDigit(line))|(line.matches(".*\\d+.*")))
                            {
                                System.out.println("Input value is a number instead of a string or string contains numeral. Program has stopped");
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
          System.out.println("Something wrong with input file ");}
//--------------сортировка строк
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
         try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(dirPath+"\\output.txt"), "utf-8"));
            for (int i=0;i<dan.size();i++) {
                writer.write(dan.get(i)+System.lineSeparator());
            }
        } catch (IOException ex) {
        } finally {
            try {writer.close();} catch (Exception e) {System.out.println("Something wrong with output file"); return;}
        }
//----------------------
    }
    catch (ArrayIndexOutOfBoundsException e){
        System.out.println("Not enough arguments");    }
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
