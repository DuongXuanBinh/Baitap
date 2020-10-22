package Session10;

public class FourWheeler extends Vehicle {
    private boolean powerSteer;

    public FourWheeler(String vId, String vName, int numWheels, boolean pSteer){
        super(vId, vName, numWheels);
        powerSteer = pSteer;
    }
    public void showDetails(){
        System.out.println("Vehicle no: "+vehicleNo);
        System.out.println("Vehicle Name: "+vehicleName);
        System.out.println("Number of Wheels: "+wheels);

        if(powerSteer==true)
            System.out.println("Power Steering: Yes");
        else
            System.out.println("Power Steering: No");
    }

    @Override
    public void accelerate(int speed) {
        System.out.println("Maximum acceleration: "+speed+" kmph");
    }
}

