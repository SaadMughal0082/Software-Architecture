

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;



public class filling{
  String path = null;
    public void readFile(String path)
    {
        List<String> ls;
        try
        {
          ls = Files.readAllLines(Paths.get(path));
            System.out.println("system requriment: ");
          for(String s: ls)
          {
              System.out.println(s);         
          }
        }
        
        catch(IOException io)
        {
            System.out.println(io.toString());
        }
    }
  }