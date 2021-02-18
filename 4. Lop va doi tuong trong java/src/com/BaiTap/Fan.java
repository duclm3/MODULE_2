package com.BaiTap;

public class Fan {
    public final int SLOW = 1;
    public final int MEDIUM = 2;
    public final int FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5; //Bán kính quạt
    private String color = "blue";
    public Fan(){
    }

    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isOn() {
        return on;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speedd) {
        this.speed = speed;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        if(on){
            return "speed:"+speed +",color:"+color+",radius:"+radius+" fan is on.";
        }
        return "fan is off";
    }

    public static void main(String[] args) {
        Fan fan1 =  new Fan();
        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setOn(true);
        Fan fan2 = new Fan();
        fan2.setSpeed(fan1.getMEDIUM());
        fan2.setRadius(5);
        fan2.setColor("blue");
    }
}
