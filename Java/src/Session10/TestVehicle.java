package Session10;

public class TestVehicle {
    public static void main(String[] args) {
        FourWheeler obj = new FourWheeler("LA-09 CS-1406","Volkswagen",4,true);
        obj.showDetails();
        obj.accelerate(200);

        Vehicle obj2 = new FourWheeler("LA-09 CS-1406","Volkswagen",4,false);
        obj2.accelerate(200);

        Vehicle obj4 = new Vehicle("abc","abc",4);
        FourWheeler obj3 = (FourWheeler) obj4;

    }
}
