package SmartPhidgets;

//Add Phidgets Library 
import com.phidget22.*;

public class HotOrCold
{

	public static void main(String[] args) throws Exception
	{
		// Create 
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        // Open 
        humiditySensor.open(1000);
        temperatureSensor.open(1000);
        
        // initializing the green LED
        DigitalOutput greenLED = new DigitalOutput();
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);
        greenLED.open(1000);
        
        // initializing the red LED
        DigitalOutput redLED = new DigitalOutput();
        redLED.setHubPort(2);
        redLED.setIsHubPortDevice(true);
        redLED.open(1000);
        
        //Use your Phidgets 
        while(true)
        {        	
        	if(temperatureSensor.getTemperature() >= 20 && temperatureSensor.getTemperature() <= 24)
        	{
        		greenLED.setState(true);
        		redLED.setState(false);
        	}
        	else
        	{
        		greenLED.setState(false);
        		redLED.setState(true);
        	}
        	System.out.println("Temperature: " + temperatureSensor.getTemperature());
        	Thread.sleep(150);
        }
	}

}
