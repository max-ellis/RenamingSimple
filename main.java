

public class main {

    public static void main(String args[]){
        foo();
    }

    private static void foo(){
        int x = getIntX();
        int y = getIntY();
        graph(x, y);
    }

    private static int getIntX(){
        return 5;
    }

    private static int getIntY(){
        return 4;
    }

    private static void graph(int a, int b){
        System.out.println(a*b);
    }
}
