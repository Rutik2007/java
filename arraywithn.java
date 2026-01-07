import java.util.Arrays;

class arraywithn
{
    public static void main(String[] args)
    {
        int[][] jy = new int[2][];   
        jy[0] = new int[3];
        jy[0][0] = 10;
        jy[0][1] = 20;
        jy[0][2] = 30;

        jy[1] = new int[2];
        jy[1][0] = 40;
        jy[1][1] = 50;

        System.out.println(Arrays.deepToString(jy));
    }
}
