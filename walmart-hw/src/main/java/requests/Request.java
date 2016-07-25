package requests;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Request {

	final private String query;
	
	public Request(String query) {
		this.query = query;
	}
	
	public String getResponse(){
		
		String results = "";
		
		try {
			
			results = doHttpUrlConnectionAction(query);
			
		} catch (Exception e) {
			
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	    //System.out.println(results);
	    return results;
	}
	
	private String doHttpUrlConnectionAction(String desiredUrl)
	  throws Exception
	  {
	    URL url = null;
	    BufferedReader reader = null;
	    StringBuilder stringBuilder;
	
	    try
	    {
	      // create the HttpURLConnection
	      url = new URL(desiredUrl);
	      HttpURLConnection connection = (HttpURLConnection) url.openConnection();
	      
	      // just want to do an HTTP GET here
	      connection.setRequestMethod("GET");
	      
	      // give it 15 seconds to respond
	      connection.setReadTimeout(15*1000);
	      connection.connect();
	
	      // read the output from the server
	      reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
	      stringBuilder = new StringBuilder();
	
	      String line = null;
	      while ((line = reader.readLine()) != null)
	      {
	        stringBuilder.append(line + "\n");
	      }
	      return stringBuilder.toString();
	    }
	    catch (Exception e)
	    {
	      e.printStackTrace();
	      throw e;
	    }
	    finally
	    {
	      // close the reader
	      if (reader != null)
	      {
	        try
	        {
	          reader.close();
	        }
	        catch (IOException ioe)
	        {
	          ioe.printStackTrace();
	        }
	      }
	    }
	  }
	}
