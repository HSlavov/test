import java.io.*;

class mained
{
    public static void main(String args[])
    {
        try
        {
            FileInputStream file = new FileInputStream("myfile.txt");
       
            DataInputStream in = new DataInputStream(file);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
         
            while ((strLine = br.readLine()) != null)
            {
              
                System.out.println(strLine);
            }
            
            in.close();
        }
        catch (Exception e)
        {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
