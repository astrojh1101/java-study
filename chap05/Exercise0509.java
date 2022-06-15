package chap05;

public class Exercise0509 {
    public static void main(String[] args) {
        char[][] star = {
                {'*','*',' ',' ',' '},
                {'*','*',' ',' ',' '},
                {'*','*','*','*','*'},
                {'*','*','*','*','*'}
        };

        char[][] result = new char[star[0].length] [star.length];

        for(int i=0; i<star.length; i++) {
            for(int j=0; j<star[i].length; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        for(int i=0; i<star.length; i++) { // 4
            for(int j=0; j<star[i].length; j++) {
                int a = j; // 90도 회전 전과 후를 두고 좌표 비교하였을 때, a=j
                int b = star.length-1-i; // 90도 회전 전과 후를 두고 좌표 비교하였을 때, b+i=3
                // 이항하면 b=3-i, star.length-1=3이므로 3 대신에 이를 대입하면 b=star.length-1-i로 표현할 수 있다.
                result[a][b]=star[i][j];

            }
        }

        for(int i=0; i<result.length; i++) {
            for(int j=0; j<result[i].length; j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    } // end of main
} // end of class
