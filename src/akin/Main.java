package akin;

import java.io.Reader;
import java.io.StringReader;
import java.io.FileReader;

import akin.lang.Bootstrapper;

public class Main {
  public static void main(String[] args) throws Exception {
    Reader reader = null;
    boolean debug = false;
    
    for (int i = 0; i < args.length; i++) {
      if (args[i].equals("-e")) reader = new StringReader(args[++i]);
      else if (args[i].equals("-d")) debug = true;
      else reader = new FileReader(args[i]);
    }
    
    if (reader == null) {
      System.out.println("usage: akin [-d] < -e code | file.akin >");
      System.exit(1);
    }
    
    Bootstrapper.run().eval(reader);
  }
}