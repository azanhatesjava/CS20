package ErrorHandling;

//Add Phidgets Library
import com.phidget22.*;

public class Errors {
    public static void main(String[] args){

        try{
        //Create
        TemperatureSensor temperatureSensor = new TemperatureSensor();

        //Open
        temperatureSensor.open(1000);

        //Use your Phidgets
        System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
        
        } catch(PhidgetException ex){
            //Catch any errors that may occur 
            System.out.println("Failure: " + ex);
        }
    }
}
  