package bigdata;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;
public class test6 {
 public static void main(String[] args) throws IOException {
  int a=10;
  double b = 10.6;
  char c = 'a';
  String s="asdasdasda";
  FileOutputStream fos = new FileOutputStream("F://������//test6.csv");  
  OutputStreamWriter osw = new OutputStreamWriter(fos);
  PrintWriter pw = new PrintWriter(osw);
  pw.println(a);
  pw.println(b);
  pw.println(c);
  pw.println(s);
  pw.close();
 }
}
