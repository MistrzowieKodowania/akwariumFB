import greenfoot.*;


public class Haczyk extends Actor
{
         
    public void act() 
    {
        setLocation(getX(), getY()-5);
        if (isAtEdge()) {getWorld().removeObject(this);}
        
    }
}
