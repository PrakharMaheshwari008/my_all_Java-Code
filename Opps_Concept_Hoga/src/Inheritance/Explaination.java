package Inheritance;

public class Explaination {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3,100,25);
        System.out.println(mb.toString());
        Bicycle mb1 = new MountainBike(3,1000,42);
        System.out.println(mb1.toString());
    }
}
class Bicycle{
//    thr bicycle class has two fields
    public int gear;
    public int speed;

//    the Bicycle class has onr constructor
    public Bicycle(int gear,int speed)
    {
        this.gear = gear;
        this.speed = +speed;
    }
    public void applyBrake(int decrement)
    {
        speed -= decrement;
    }
    public void speedUp(int increment)
    {
        speed += increment;
    }

//    toString() method to print info of Bicycle
    public String toString(){
        return ("No of gears are"+ gear + "\n"+"speed of bicycle is "+ speed);
    }
}
class MountainBike extends Bicycle{
public int seatHeight;
    public MountainBike(int gear, int speed,int startHeight) {
        super(gear, speed);
        seatHeight = startHeight;
    }
    public void setSeatHeight(int newValue)
    {
        seatHeight = newValue;
    }
//    overriding toString() method
//    of bicycle to print more info
   @Override public String toString()
    {
        return (super.toString()+"\n seat height is " + seatHeight);
    }
}
