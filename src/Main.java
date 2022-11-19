public class Main {
    public static int[] dny = {0,31,28,31,30,31,30,31,31,30,31,30,31};
    public static  boolean prestup = false;
    public static void main(String[] args) {

        int[] date = zaTyden(30,12,2023);
        for (int i : date
             ) {
            System.out.println(i);
        }

        if(prestup){
            dny[2] = 28;
        }

    }
    public static boolean prestup(int rok){
        return(rok%4==0 && rok%100 != 0)||(rok%400 == 0);
    }

    public static int[] zaTyden(int d, int m, int r){
        if (prestup(r)){
            dny[2] = 29;
            prestup = true;
        }
        if (d <= dny[m] - 7){
            return new int[]{d + 7, m, r};
        }
        else if (m < 12) {
            return new int[]{d + 7 - dny[m], m + 1, r};
        }
        else {return new int[]{d + 7 - dny[m], 1, r + 1};}
    }
}