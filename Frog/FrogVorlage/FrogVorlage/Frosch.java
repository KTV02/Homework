import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

public class Frosch  extends Actor
{
    int kraft;
    int s=Greenfoot.getRandomNumber(4);
    public Frosch(String startbild)
    {
        setImage(startbild);
        kraft = 20;
    }

    public void act()
    {
        springen();
        essen();
        treffeStorch();
        if(kraft == 0){
            sterben();
        }   
    }

    public void springen()
    {
        int xaender = Greenfoot.getRandomNumber(3) -1;
        int yaender = Greenfoot.getRandomNumber(3) - 1;
        setLocation(getX()+xaender, getY()+ yaender);

        kraft--;
    }

    public void sterben(){
        getImage().setTransparency(80);
        Greenfoot.stop();
    }

    public void essen()
    {
        if(isTouching(Fliege.class)){
            kraft+=10;
            //World.removeObject();   
        }
    }

    public void treffeStorch()
    {
        if(isTouching(Storch.class)){
            sterben();
        }
    }

}