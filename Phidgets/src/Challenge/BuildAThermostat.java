package Challenge;

//Add Phidgets Library 
import com.phidget22.*;

public class BuildAThermostat
{
	
	private static int setTemp;
	private static int checkRed;
	private static int checkGreen;

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
        
        // initializing the green button
        DigitalInput greenButton = new DigitalInput();
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenButton.open(1000);
        
        // initializing the red button
        DigitalInput redButton = new DigitalInput();
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redButton.open(1000);
        
        // default thermostat value (21 C)
        setTemp = 21;
        
        // when red button is pressed / released
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e)
            {	
            	checkRed += 1;
            	if (checkRed %2 == 0)
            	{
            		setTemp -= 1;
            	}
            }
        });
        
        // when green button is pressed / released
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e)
            {
            	checkGreen += 1;
            	if (checkGreen %2 == 0)
            	{
            		setTemp += 1;
            	}
            }
        });
        
        //Use your Phidgets 
        while(true)
        {        	
        	if(temperatureSensor.getTemperature() >= setTemp - 2 && temperatureSensor.getTemperature() <= setTemp + 2)
        	{
        		//turn green LED on
        		greenLED.setState(true);
        		redLED.setState(false);
        	}
        	else
        	{
        		//turn red LED on
        		greenLED.setState(false);
        		redLED.setState(true);
        	}
        	System.out.println("Temperature: " + temperatureSensor.getTemperature());
        	System.out.println(setTemp);
        	Thread.sleep(150);
        }
	}

}
