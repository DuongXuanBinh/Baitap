package Java.Session10;

public class Vehicle {
    protected String vehicleNo;
    protected String vehicleName;
    protected int wheels;

    public void accelerate(int speed){
        System.out.println("Accelerating at: "+speed+" kmph");
    }

    public Vehicle(String vId, String vName, int numWheels){
        vehicleNo = vId;
        vehicleName=vName;
        wheels = numWheels;
    }

}

