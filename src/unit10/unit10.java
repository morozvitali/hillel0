package unit10;

import java.io.*;

public class unit10 {

    public static void main(String[] args) {
        try (InputStream in = new FileInputStream("test.txt")){
            int aByte = in.read();
            StringBuffer sb = new StringBuffer();

            while (aByte != -1) {
                aByte = in.read();
                sb.append((char) aByte);
            }
            System.out.print(sb);
        }
        catch (FileNotFoundException e){ }
        catch (IOException e){ }
            throw new RuntimeException ();
        }
    }