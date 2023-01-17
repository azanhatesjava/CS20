package Methods;

//Add Phidgets Library 
import com.phidget22.*;

public class LEDBrightness {
    //Handle Exceptions 
    public static void main(String[] args) throws Exception{

        //Create 
        DigitalOutput redLED = new DigitalOutput();

        //Address 
        redLED.setHubPort(2);
        redLED.setIsHubPortDevice(true);

        //Open 
        redLED.open(1000);

        //Use your Phidgets with Duty Cycle | Duty Cycle controls the power to your Phidget (Digital Output object). Duty Cycle values range from 0.0 - 1.0.
        
        
        for(double i = 0; i <= 1; i += 0.1)
        {
        	redLED.setDutyCycle(i);
        	Thread.sleep(200);
        }
        
        for(double i = 1; i >= 0; i -= 0.1)
        {
        	redLED.setDutyCycle(i);
        	Thread.sleep(200);
        }
        
        
    }
}
  