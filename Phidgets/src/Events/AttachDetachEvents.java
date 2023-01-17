package Events;

//Add Phidgets Library
import com.phidget22.*;

public class AttachDetachEvents
{

    public static void main(String[] args) throws Exception 
    {
       
    	
    	//Create | Create objects for your buttons and LEDs.
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();

        //Address | Address your four objects which lets your program know where to find them.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(2);
        redLED.setIsHubPortDevice(true);
        
    	
        //Attach Event | Attach Events run when a Phidget is connected to the Object
        redButton.addAttachListener(new AttachListener() 
        {
            public void onAttach(AttachEvent e)
            {
                System.out.println("Red Button Attach!");
            }
        });
        
        
      //Attach Event | Attach Events run when a Phidget is connected to the Object
        redButton.addDetachListener(new DetachListener() 
        {
            public void onDetach(DetachEvent e)
            {
                System.out.println("Red Button Detach!");
            }
        });
        
        
        //Attach Event | Attach Events run when a Phidget is connected to the Object
        redLED.addAttachListener(new AttachListener() 
        {
            public void onAttach(AttachEvent e)
            {
                System.out.println("Red LED Attach!");
            }
        });
        
        //Attach Event | Attach Events run when a Phidget is connected to the Object
        redLED.addDetachListener(new DetachListener() 
        {
            public void onDetach(DetachEvent e)
            {
                System.out.println("Red LED Detach!");
            }
        });
        
    	
    	
         //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Data Event | Event code runs when data from sensor changes. 
        temperatureSensor.addTemperatureChangeListener(new TemperatureSensorTemperatureChangeListener()
{
            public void onTemperatureChange(TemperatureSensorTemperatureChangeEvent e) 
            {
                //Print temperature
                System.out.println("Temperature: " + e.getTemperature() + "°C");
            }
        });

        //Attach Event | Attach Events run when a Phidget is connected to the Object
        temperatureSensor.addAttachListener(new AttachListener() 
        {
            public void onAttach(AttachEvent e)
            {
                System.out.println("Temperature Sensor Attach!");
            }
        });

        //Detach Event | Detach Events run when a Phidget is disconnected from the Object
        temperatureSensor.addDetachListener(new DetachListener() 
        {
            public void onDetach(DetachEvent e) 
            {
                System.out.println("Temperature Sensor Detach!");
            }
        });

        //Open
        temperatureSensor.open(1000);
        redButton.open(1000);
        redLED.open(1000);
        
        //Keep program running
        while (true) 
        {
            Thread.sleep(150);
        }
    }
}
 