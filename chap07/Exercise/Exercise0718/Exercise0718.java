package chap07.Exercise.Exercise0718;

public class Exercise0718 {

    public static void action(Robot r){
        if(r instanceof DanceRobot) {
            ((DanceRobot) r).dance(); // DanceRobot -> dance() 호출
        } else if(r instanceof SingRobot) {
            ((SingRobot) r).sing(); // SingRobot -> sing() 호출
        } else if(r instanceof DrawRobot) {
            ((DrawRobot) r).draw(); // DrawRobot -> draw() 호출
        }
    }


    public static void main(String[] args) {
        Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
        for(int i=0; i<arr.length; i++)
        action(arr[i]);
    } // main
}
