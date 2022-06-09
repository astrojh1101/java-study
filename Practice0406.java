public class Practice0406 {
    public static void main(String[] args) {
        for (int x=1; x<=6; x++) { // 첫번째 주사위 범위 1~6
            for (int y=1; y<=6; y++) { // 두번째 주사위 범위 1~6
                if((x + y) == 6) {
                    System.out.println("(" + x + ", "  + y + ")");
    }
            }
        }
    }
}

