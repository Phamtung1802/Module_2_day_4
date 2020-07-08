package BaiTapXayDungLopStopWatch;

import java.time.LocalDateTime;

public class StopWatch {
    long StartTime,StopTime;
    public StopWatch(){

    }
    public long start(){
        return this.StartTime=System.currentTimeMillis();
    }
    public long  stop(){
        return this.StopTime=System.currentTimeMillis();
    }
    public long getElapsedTime(){
     return (this.StopTime-this.StartTime);
    }
}
