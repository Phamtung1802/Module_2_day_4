package BaiTapXayDungLopStopWatch;

import java.util.Arrays;

public class StopWatchRun {
    public static void main(String[] args) {
        int[] MangMotTramNghinSo= new int[100000];
        taoMang(MangMotTramNghinSo);
        StopWatch CompileTime= new StopWatch();
        CompileTime.start();
        Arrays.sort(MangMotTramNghinSo);
        CompileTime.stop();
        System.out.println(CompileTime.getElapsedTime()+"ms");
    }
    public static void taoMang(int[] array){
        for(int i=0; i<array.length; i++){
            array[i]=(int)(Math.random()*100);
        }
    }
}
