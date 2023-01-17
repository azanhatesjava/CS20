package Events;

//Add Phidgets Library
import com.phidget22.*;

public class ButtonEvents 
{
	private static int checkGreen;
	private static int checkRed;
	
    //Handle Exceptions
    public static void main(String[] args) throws Exception 
    {
       
        //Create
        DigitalInput redButton = new DigitalInput();

        //Address
        redButton.setIsHubPortDevice(true);
        redButton.setHubPort(0);

        // initializing the green button
        DigitalInput greenButton = new DigitalInput();
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenButton.open(1000);
        
        // green button state change
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e)
            {
            	checkGreen += 1;
            	if (checkGreen %2 == 0)
            	{
            		System.out.println("Green Not Pressed");
            	}
            	else
            	{
            		System.out.println("Green pressed");
            	}
            }
        });
       
        
        //Event | Event code runs when data input from the sensor changes. The following event is a state change event. The code will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e)
            {
            	checkRed += 1;
            	if (checkRed %2 == 0)
            	{
            		System.out.println("Red Pressed");
            	}
            	else
            	{
            		System.out.println("Red Not pressed");
            	}
            }
        });

        //Open
        redButton.open(1000);

        //Keep program running
        while (true) {
            Thread.sleep(5000);
        }
    }
}
  