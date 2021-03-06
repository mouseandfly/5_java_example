package com.jsoft.testjavabasics.test1;

import java.io.*;
import java.net.URISyntaxException;

public class CopyFile1 {
   public static void main(String args[]) throws IOException, URISyntaxException
   {
      FileReader in = null;
      FileWriter out = null;

      try {
         in = new FileReader(CopyFile1.class.getClassLoader().getResource("input.txt").toURI().getPath());
         out = new FileWriter(CopyFile1.class.getClassLoader().getResource("").toURI().getPath()+"output.txt");

         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}
