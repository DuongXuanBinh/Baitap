package Lab9;

public class WaterMonster extends Monster {
    public WaterMonster(String name){
        super(name);
    }

    @Override
    public String attack() {
        return "Attack with fire!";
    }
}
