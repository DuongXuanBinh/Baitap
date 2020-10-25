package Lab10.ex4;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1,int y1,int x2,int y2,int xSpeed,int ySpeed){
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight=new MovablePoint(x2,y2,xSpeed,ySpeed);
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    @Override
    public void moveUp() {
        topLeft.y+= topLeft.ySpeed;
        bottomRight.y+= bottomRight.ySpeed;
    }

    @Override
    public void moveDown() {
        topLeft.y-= topLeft.ySpeed;
        bottomRight.y-= bottomRight.ySpeed;
    }

    @Override
    public void moveLeft() {
        bottomRight.x-= bottomRight.xSpeed;
        topLeft.x-= topLeft.xSpeed;
    }

    @Override
    public void moveRight() {
        bottomRight.x+= bottomRight.xSpeed;
        topLeft.x+= topLeft.xSpeed;
    }
}
