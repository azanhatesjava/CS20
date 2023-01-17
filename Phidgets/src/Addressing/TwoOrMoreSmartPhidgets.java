package Addressing;

//Add Phidgets Library 
import com.phidget22.*;

public class TwoOrMoreSmartPhidgets
{	
    //Create 
    static TemperatureSensor temperatureSensor0;
    static TemperatureSensor temperatureSensor1;
    
    public static void main(String[] args) throws Exception
    {

        //Create | Create objects for your buttons and LEDs.
        DigitalInput redButton = new DigitalInput();
        DigitalInput greenButton = new DigitalInput();

        //Address | Address your four objects which lets your program know where to find them.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);

      //Event
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e)
            {	
            	
            	if(e.getState() == true) 
            	{
            		try 
            		{
						System.out.println("Temperature 0: " + temperatureSensor0.getTemperature() + " °C" );
					} catch (PhidgetException e1) 
            		{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            	}
            }
        });
        
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e)
            {
            	if(e.getState() == true) 
            	{
            		try 
            		{
                        System.out.println("Temperature 1: " + temperatureSensor1.getTemperature() + " °C" );
					} catch (PhidgetException e1) 
            		{
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
            	}
            }
        });
        
        temperatureSensor0 = new TemperatureSensor();
        temperatureSensor1 = new TemperatureSensor();
        
        		
        //Open | Connect your program to your physical devices.
        redButton.open(1000);
        greenButton.open(1000);
        

    	
    	


         //Address | Smart Phidgets must be addressed when you are using more than one of the same software objects in your program. Setting the HubPort allows you to keep track of which physical Phidget is paired with each software object. If you do not address the objects, your program will have unpredictable results.
         temperatureSensor0.setHubPort(3);
         temperatureSensor1.setHubPort(1);

        //Open 
        temperatureSensor0.open(1000);
        temperatureSensor1.open(1000);

        //Use your Phidgets 
        while (true)
        {
        	Thread.sleep(150);
        }
    }
}
 