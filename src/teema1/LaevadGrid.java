package teema2;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ksikkar on 30.10.15.
 */
public class LaevadGrid {
    static int[][] laud;
    static int lauaLaius = 4;
    static int lauaKorgus = 3;
    static Scanner sc = new Scanner(System.in);




    public static void main(String[] args) {
        genereeriLaud();
        paigutaLaevad();
        int[] xy = kysiKasutajalt();
        System.out.println(Arrays.toString(xy));
        kontrolliTabamust(xy);
        //kasOnLaevuAlles();
        //gameover();
    }

    private static void kontrolliTabamust(int[] xy) {
        int tabamus = laud[xy[0]][xy[1]];
        if ( tabamus == 0) {
            System.out.println("Läks mööda!");
        } else if (tabamus == 1){
            System.out.println("Pihtas");
            laud[xy[0]][xy[1]] = 2;
        }

    }

    private static int[] kysiKasutajalt() {
        System.out.println("Sisesta x ja y koordinaadid (tühik vahel)");
        String sisestus = sc.nextLine(); // 5 6
        int x = Integer.parseInt(sisestus.substring(0, 1));
        int y = Integer.parseInt(sisestus.substring(2));
        System.out.println("Kasutaja sisestas: x = " + x + " y = " + y);
        int[] xy = new int[]{x,y};
        return xy;

    }

    private static void paigutaLaevad() {
        for (int i = 0; i < lauaKorgus; i++) {
            for (int j = 0; j < lauaLaius; j++) {
                laud[i][j] = (int)(Math.random()*2);
            }
            System.out.println(Arrays.toString(laud[i]));
        }

    }

    private static void genereeriLaud() {
        laud = new int[lauaKorgus][lauaLaius];


    }


}
