package Java.Lab8.Point;

public class Point {
    private float x = 0.0f;
    private float y = 0.0f;

    public Point(float x, float y){
        this.x=x;
        this.y=y;
    }
    public Point(){
        x=0.0f;
        y=0.0f;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x,float y){
        this.x = x;
        this.y=y;
    }
    public float[] getXY(){
        float[] results = new float[2];
        results[0]=this.x;
        results[1]=this.y;
        return results;
    }

    @Override
    public String toString() {
        return "(" + x +
                "," + y +
                ')';
    }
}
