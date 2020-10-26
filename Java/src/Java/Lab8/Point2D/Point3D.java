package Java.Lab8.Point2D;

public class Point3D extends Point2D {
    private float z=0.0f;

    public Point3D(float x,float y,float z){
        super(x, y);
        this.z=z;
    }
    public Point3D(){
        super();
        z=0.0f;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        super.setX(x);
        super.setY(y);
        this.z=z;
    }
    public float[] getXYZ(){
        float[] results = new float[3];
        results[0]=super.getX();
        results[1]=super.getY();
        results[2]=this.z;
        return results;
    }

    @Override
    public String toString() {
        return super.toString()+
                "z=" + z +
                ')';
    }
}
