package Events;

//Add Phidgets Library | You added a file called phidget22 when configuring your project. Import gives you access to the Phidgets library code inside that file. 
import com.phidget22.*;

public class ButtonAndLEDEvents
{
	private static int totPresses;
	private static int redPresses;
	private static int checkRed;
	private static int greenPresses;
	private static int checkGreen;
	
    //Handle Exceptions | Exceptions will happen in your code from time to time. These are caused by unexpected things happening. Make sure you’ve added "throws Exception" to your main method.
    public static void main(String[] args) throws Exception
    {	
        //Create | Create objects for your buttons and LEDs.
        DigitalInput redButton = new DigitalInput();
        DigitalOutput redLED = new DigitalOutput();
        DigitalInput greenButton = new DigitalInput();
        DigitalOutput greenLED = new DigitalOutput();

        //Address | Address your four objects which lets your program know where to find them.
        redButton.setHubPort(0);
        redButton.setIsHubPortDevice(true);
        redLED.setHubPort(2);
        redLED.setIsHubPortDevice(true);
        greenButton.setHubPort(5);
        greenButton.setIsHubPortDevice(true);
        greenLED.setHubPort(4);
        greenLED.setIsHubPortDevice(true);

      //Event
        redButton.addStateChangeListener(new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e)
            {	
            	checkRed += 1;
            	if (checkRed %2 == 0)
            	{
            		redPresses += 1;
            		System.out.println("Number of button presses = " + (totPresses += 1));
            	}
            }
        });
        
        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() 
        {
            public void onStateChange(DigitalInputStateChangeEvent e)
            {
            	checkGreen += 1;
            	if (checkGreen %2 == 0)
            	{
            		greenPresses += 1;
            		System.out.println("Number of button presses = " + (totPresses += 1));
            	}
            }
        });
        
        //Open | Connect your program to your physical devices.
        redButton.open(1000);
        redLED.open(1000);
        greenButton.open(1000);
        greenLED.open(1000);

        
        
        while(true)
        {

        	while(greenPresses < 10 && redPresses < 10)
        	{
        		if(redButton.getState())
                {
                    redLED.setState(true);
                } 
                else 
                {
                	redLED.setState(false);
                }

                if(greenButton.getState())
                {
                    greenLED.setState(true);
                } 
                else 
                {
                    greenLED.setState(false);
                }	
        	}
        	redButton.close();
        	greenButton.close();
        	if(redPresses >= 10)
        	{
        		redLED.setState(false);
        		greenLED.setState(false);
        		Thread.sleep(500);
        		redLED.setState(true);
        		greenLED.setState(true);
        		Thread.sleep(1000);
        		redLED.setState(false);
        		greenLED.setState(false);
        		Thread.sleep(500);
        		redLED.setState(true);
        		Thread.sleep(500);
        		redLED.setState(false);
        		Thread.sleep(500);
        		redLED.setState(true);
        		Thread.sleep(500);
        		redLED.setState(false);
        		Thread.sleep(500);
        		redLED.setState(true);
        		Thread.sleep(500);
        		redLED.setState(false);
        		Thread.sleep(500);
        		redLED.setState(true);
        		Thread.sleep(500);
        		redLED.setState(false);
        		Thread.sleep(500);
        		redLED.setState(true);
        		Thread.sleep(500);
        		redLED.setState(false);
        		break;
        	}
        	else if(greenPresses >= 10)
        	{
        		redLED.setState(false);
        		greenLED.setState(false);
        		Thread.sleep(500);
        		redLED.setState(true);
        		greenLED.setState(true);
        		Thread.sleep(1000);
        		redLED.setState(false);
        		greenLED.setState(false);
        		Thread.sleep(500);
        		greenLED.setState(true);
        		Thread.sleep(500);
        		greenLED.setState(false);
        		Thread.sleep(500);
        		greenLED.setState(true);
        		Thread.sleep(500);
        		greenLED.setState(false);
        		Thread.sleep(500);
        		greenLED.setState(true);
        		Thread.sleep(500);
        		greenLED.setState(false);
        		Thread.sleep(500);
        		greenLED.setState(true);
        		Thread.sleep(500);
        		greenLED.setState(false);
        		Thread.sleep(500);
        		greenLED.setState(true);
        		Thread.sleep(500);
        		greenLED.setState(false);
        		break;
        	}
            
        	
        }
    }
}
  