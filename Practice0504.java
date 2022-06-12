public class Practice0504
{
    public static void main(String[] args)
    {
    int [][] arr = {
            { 5, 5, 5, 5, 5},
            { 10, 10, 10, 10, 10},
            { 20, 20, 20, 20, 20},
            { 30, 30, 30, 30, 30}
    };

    int total = 0;
    float average = 0;

       for(int i=0; i<arr.length; i++) {
           for(int j=0; j<arr[i].length; j++) {
               total += arr[i][j];
           }
       }
        average = (float)total / (arr.length * arr[0].length); // 16.25라는 평균값을 얻어야하므로 float형변환을 통해 실수타입으로 표현가능하도록 해줘야 함
    System.out.println("total="+total);
    System.out.println("average="+average);
    }
}
