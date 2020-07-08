package BaiTapXayDungLopFan;

public class runFan {
    public static void main(String[] args) {
        Fan quat=new Fan();
        Fan quat2=new Fan();
        quat.setOn(true);
        quat.setSpeed(quat.Fast);
        quat.setColor("Yellow");
        quat.setRadius(10.0);
        System.out.println(quat.getStatus());
        quat2.setOn(true);
        quat2.setSpeed(quat2.Slow);
        quat2.setColor("Blue");
        quat2.setRadius(5);
        System.out.println(quat2.getStatus());
    }
}
