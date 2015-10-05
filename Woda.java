import greenfoot.*;

public class Woda extends World
{
    public static int liczbaZ = 0; 
    public static int liczbaR = 0; 
    public static int liczbaP = 0; 
    
    public Woda()
    {    
        super(800, 600, 1); 
        //Fejs ikonka = new Fejs();
        //addObject(ikonka, 750,50);
               
    }
    
    private void dodajRybke() {
        Ryba nowa;
        switch(Greenfoot.getRandomNumber(3)) {
           case 0:
           nowa = new Zlota();
           break;
           case 1:
           nowa = new Rekin();
           break;
           default: 
           nowa = new Pretnik();
           }
        addObject (nowa, 10, Greenfoot.getRandomNumber(400)+100);
    }
    
    public void act(){
        if (Greenfoot.mouseClicked(this)) dodajRybke();
        
        if(numberOfObjects() <= 3) dodajRybke();
        showText("Rekiny: " + liczbaR + ", Prętniki: "+ liczbaP + ", Złote: "+ liczbaZ , 400, 50);
        }
}
