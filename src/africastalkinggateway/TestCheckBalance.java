package africastalkinggateway;
// Make sure the downloaded jar file is in the classpath
import org.json.*;
public class TestCheckBalance 
{
    public static void main(String[] args) 
    {
        
        //Specify your credentials
        String username = "menty44";
        String apiKey = "fc3dae438d44d06d328ac9a4fa1aa57600769527f449f1c5859de3e53c0acc10";
        
        //Create an instance of our awesome gateway class and pass your credentials
        AfricasTalkingGateway gateway = new AfricasTalkingGateway(username, apiKey);
        
        // Thats it, hit send and we'll take care of the rest. Any errors will
   // be captured in the Exception class as shown below
   
   try {
       JSONObject result = gateway.getUserData();
       System.out.println("Your current balance is : \t");
       System.out.println(result.getString("balance"));
       //The result will have the format=> KES XXX
   }
   
   catch(Exception e){
       System.out.println(e.getMessage());
   }
    }
}