package Lab8.Point;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x,float y,float xSpeed,float ySpeed){
       super(x, y);
       this.xSpeed=xSpeed;
       this.ySpeed=ySpeed;
    }
    public MovablePoint(float xSpeed,float ySpeed){
        super();
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public MovablePoint(){
        super();
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public float[] getSpeed(){
        float[] result = new float[2];
        result[0]=this.xSpeed;
        result[1]=this.ySpeed;
        return result;
    }

    @Override
    public String toString() {
        return "("+getX()+","+getY()+"),speed=(" +
                xSpeed + "," + ySpeed +
                ")";
    }
    public MovablePoint move(){
        float a = getX();
        setX(a+xSpeed);
        float b =getY();
        setY(b+ySpeed);
        return this;
    }
}
