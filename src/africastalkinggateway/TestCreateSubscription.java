//package africastalkinggateway;
//
//// Make sure the downloaded jar file is in the classpath
//
//import org.json.JSONObject;
//
//public class TestCreateSubscription {
//    public static void main(String[] args) 
//    {
//        
//    //Specify your credentials
//    String username = "menty44";
//    String apiKey   = "fc3dae438d44d06d328ac9a4fa1aa57600769527f449f1c5859de3e53c0acc10";
//        
//    // Specify the number that you want to subscribe
//    // Please ensure you include the country code (+254 for Kenya in this case)
//    String subscriptionPhoneNumber   = "+254720106420";
//    
//    //Specify your Africa's Talking short code and keyword
////    String shortCode = "menty44";
////    String keyword   = "fc3dae438d44d06d328ac9a4fa1aa57600769527f449f1c5859de3e53c0acc10";
//        
//    //Create an instance of our awesome gateway class and pass your credentials
//    AfricasTalkingGateway gateway = new AfricasTalkingGateway(username, apiKey);
//        
//        // Thats it, submit data and we'll take care of the rest. Any errors will
//  // be captured in the Exception class as shown below
//   
//   try {
//    JSONObject result = gateway.createSubscription(subscriptionPhoneNumber, shortCode, keyword);
//    
//    //Only status Success signifies the subscription was successfully
//    System.out.println(result.getString("status"));
//    System.out.println(result.getString("description"));
//   }
//   catch(Exception e){
//       System.out.println(e.getMessage());
//   }
// }
//}