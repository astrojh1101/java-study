package chap05;

public class Practice0504
{
    public static void main(String[] args)
    {
    int [][] arr = {
            { 5, 5, 5, 5, 5}, // arr[0][0]~arr[0][4]
            { 10, 10, 10, 10, 10}, // arr[1][0]~arr[1][4]
            { 20, 20, 20, 20, 20}, // arr[2][0]~arr[2][4]
            { 30, 30, 30, 30, 30} // arr[3][0]~arr[3][4]
    };

    int total = 0;
    float average = 0;

       for(int i=0; i<arr.length; i++) { // 0~3
           for(int j=0; j<arr[i].length; j++) { // 0~4
               total += arr[i][j]; // 전체 합
           }
       }
        average = (float)total / (arr.length * arr[0].length); // 전체합/4*5 = 전체합/20, 결과로써 16.25라는 평균값을 얻어야하므로 float형변환을 통해 실수타입으로 표현가능하도록 해줘야 함
    System.out.println("total="+total);
    System.out.println("average="+average);
    }
}
