import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Sem7UnivRes {

    public static void main(String[] args) {
        Sem7UnivRes ja=new Sem7UnivRes();
        for(int j=10580;j<10660;j++)
            ja.sendPostRequest(j);
    }
      public void sendPostRequest(int sno) {
        
        //Build parameter string
        String data = "exam_id=2591&exam_year=2011&exam_month=DEC&seat_no="+sno;
        try {
            //http://results.mu.ac.in/choose_nob.php?exam_id=2591&exam_year=2011&exam_month=DEC
            // Send the request
            URL url = new URL("http://results.mu.ac.in/get_resultb.php");
            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);
            OutputStreamWriter writer = new OutputStreamWriter(conn.getOutputStream());
            
            //write parameters
            writer.write(data);
            writer.flush();
            
            // Get the response
            StringBuffer answer = new StringBuffer();
            BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = reader.readLine()) != null) {
                answer.append(line);
            }
            writer.close();
            reader.close();
            
            //Output the response
            String res=answer.toString();
            int si=res.indexOf("The result of seat number");
            res=res.substring(si+25,si+44);

            res=res.replace("<b>", "");
            System.out.println(res);
            
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    
      }
}
