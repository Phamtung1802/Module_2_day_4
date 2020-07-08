package BaiTapXayDungLopFan;

import java.lang.*;

public class Fan {
    final int Slow=1, Medium=2, Fast=3;
    private boolean on=false;
    private double radius=5.0;
    private String color="red";
    private int Speed=Slow;
    private String status;
    public Fan(){

    }
    public boolean getOn(){
        return this.on;
    }

    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }
    public int getSpeed(){
        return this.Speed;
    }

    public boolean setOn(boolean on){
        return (this.on=on);
    }

    public double setRadius(double radius){
        return (this.radius=radius);
    }
    public String setColor(String color){
        return (this.color=color);
    }
    public int setSpeed(int Speed){
        return (this.Speed=Speed);
    }
    public String getStatus(){
        if(this.on==true){
          return this.status="radius "+(Double.toString(this.radius))+" Speed "+ Integer.toString(this.Speed)+" Color "+this.color;
        }
        return this.status="Fan is Off";
    }
}
