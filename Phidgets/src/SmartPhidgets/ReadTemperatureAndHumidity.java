package SmartPhidgets;

//Add Phidgets Library 
import com.phidget22.*;

public class ReadTemperatureAndHumidity 
{

	public static void main(String[] args) throws Exception
	{
		 //Create 
        HumiditySensor humiditySensor = new HumiditySensor();
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open 
        humiditySensor.open(1000);
        temperatureSensor.open(1000);
        
        //Use your Phidgets 
        while(true)
        {
        	if(humiditySensor.getHumidity() > 30)
        	{
            System.out.println("Humidity: " + humiditySensor.getHumidity());
        	}
        	else
        	{
        		System.out.println("Humidity is low.");
        	}
        	
        	if(temperatureSensor.getTemperature() > 21)
        	{
        		System.out.println("Temperature: " + temperatureSensor.getTemperature());
        	}
        	else
        	{
        		System.out.println("Room is too cold.");
        	}
        	Thread.sleep(150);
        }
	}

}
