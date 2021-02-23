package com.BaiTap;

public class MoveablePoint extends  Point{
   private float xSpeed = 0.0f;
   private float ySpeed = 0.0f;
   public MoveablePoint(float x,float y,float xSpeed,float ySpeed){
       super(x,y);
       this.xSpeed = xSpeed;
       this.ySpeed = ySpeed;
   }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
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
    public float[] getSpeed(){
       return new float[]{xSpeed,ySpeed};
    }
    public void setSpeed(float xSpeed,float ySpeed){
       this.xSpeed = xSpeed;
       this.ySpeed = ySpeed;
    }
    public String toString(){
       return  super.toString() +
               ",speed=("+getxSpeed()+","+getySpeed()+")";
    }
    public MoveablePoint move(){
       setX(getY()+xSpeed);
       setY(getY()+ySpeed);
       return this;
    }
}
