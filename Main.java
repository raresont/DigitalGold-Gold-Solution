package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
           int[] X = {0, 4, 2, 0};
            int[] Y = {0, 0, 1, 4};
     //   int[] X = {2, 1};
     //   int[] Y = {0, 0};
          System.out.println(solution(5, 5, X, Y));
     //   System.out.println(solution(4, 1, X, Y));
    }

    private static int solution(final int N, final int M, int[] X, int[] Y) {
        final int mines = X.length;

        if (mines % 2 == 1) {
            return 0;
        }

        final int halfOfTheDeal = mines / 2;

        int divs = 0;

        Arrays.sort(X);
        Arrays.sort(Y);

        int xLeftCorner = X[halfOfTheDeal - 1];
        int xRightCorner = X[halfOfTheDeal];

        int yLeftCorner = Y[halfOfTheDeal - 1];
        int yRightCorner = Y[halfOfTheDeal];

        if (xLeftCorner != xRightCorner) {
            divs = xRightCorner - xLeftCorner;
        }

        if (yRightCorner != yLeftCorner) {
            divs += yRightCorner - yLeftCorner;
        }

        return divs;
    }
}
   /*8
    private static int solution(final int N, final int M, int[] X, int[] Y ) {
        int divs = 0;
        int i;
        final int mines = X.length;
        if(mines % 2 == 1) {
            return 0;
        }
        ArrayList<Integer> mappedX = new ArrayList<Integer>(Collections.nCopies(N+1, 0));
        ArrayList<Integer> mappedY = new ArrayList<Integer>(Collections.nCopies(M+1, 0));

        for(i = 0; i < mines; i++) {
            final int xIndex = X[i] + 1;
            final int yIndex = Y[i] + 1;
            mappedX.set(xIndex, mappedX.get(xIndex) + 1 );
            mappedY.set(yIndex, mappedY.get(yIndex) + 1 );
        }
        final int half = mines / 2;

        for ( i = 1; i <= N; i++) {
            mappedX.set(i, mappedX.get(i) + mappedX.get(i-1) );
            if(mappedX.get(i) == half) {
                divs++;
            }
        }

        for ( i = 1; i <= M; i++) {
            mappedY.set(i, mappedY.get(i) + mappedY.get(i-1) );
            if(mappedY.get(i) == half) {
                divs++;
            }
        }

        return divs;
    }
}
*/
        /*
        int divs = 0;
        int i;
        final int mines = X.length;
        if(mines % 2 == 1) {
            return 0;
        }
    //    System.out.println(X.length);
        ArrayList<Integer> mappedX = new ArrayList<Integer>(Collections.nCopies(N+1, 0));
        ArrayList<Integer> mappedY = new ArrayList<Integer>(Collections.nCopies(M+1, 0));

        for(i = 0; i < mines; i++) {
            int xIndex = X[i] + 1;
            int yIndex = Y[i] + 1;
         //   if(moveSafe1(mappedX, xIndex)) {
                mappedX.set(xIndex, mappedX.get(xIndex) + 1 );
         //   }else {
        //        mappedX.add(xIndex,  1 );
         //   }
         //   if(moveSafe1(mappedY, yIndex)) {
                mappedY.set(yIndex, mappedY.get(yIndex) + 1 );
         //   }else {
        //        mappedY.add(yIndex,  1 );
        //    }
        }
        final int half = mines / 2;
     //   System.out.println(mappedX);
   //     System.out.println(mappedY);
    //    mappedX.set(0, 0);
    //    mappedY.set(0, 0);
        for ( i = 1; i <= N; i++) {
        //    if(moveSafe1(mappedX, i)) {
                mappedX.set(i, mappedX.get(i) + mappedX.get(i-1) );
         //   }
      //      mappedX.set(i , mappedX.get(i) + mappedX.get(i-1));
            if(mappedX.get(i) == half) {
                divs++;
            }
        }

        for ( i = 1; i <= M; i++) {
           // if(moveSafe1(mappedY, i)) {
                mappedY.set(i, mappedY.get(i) + mappedY.get(i-1) );
         //   }
         //   mappedY.set(i , mappedY.get(i) + mappedY.get(i-1));
            if(mappedY.get(i) == half) {
                divs++;
            }
        }

        return divs;
    }
    private static boolean moveSafe1(ArrayList<Integer> M, int index) {
        if (index < M.size() ) { // && M.get(index) != null) {
            return true;
        }
        return false;
    }
    private static int moveSafe(ArrayList<Integer> M, int index) {
        if (index < M.size() && M.get(index) != null) {
            return M.get(index);
        }
        return 0;
    }

}
*/