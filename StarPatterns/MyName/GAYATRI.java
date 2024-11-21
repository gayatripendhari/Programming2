package MyName;

public class GAYATRI {
    public static void main(String[] args) {
       int n=5;

       //--------------- G --------------------
       for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==1 || i==n || j==1  || (j>=n-2 && i>=n-2) && !(i==n-1 && j==n-1)){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();

    }

    //---------------------------- A ---------------------------------------
    int m=5;
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            if (i == 1 || j == n || j == 1 || i == n/2+1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

    }

    //-------------------------------- Y --------------------------------------
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            if ((i == 1&& j==1) ||(i==1 && j == n) || (i == n/2 &&j==n/2) || (i ==n/2 && j==n-1) ||(j==n/2+1 && i>=n-2))
            {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

    }

    //-------------------------------- A -----------------------------------------
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            if (i == 1 || j == n || j == 1 || i == n/2+1) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

    }

    //-------------------------------- T --------------------------------------------
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==1 || j==n/2+1){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
        System.out.println();

    }

    //-------------------------------- R ------------------------------------------------
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= n; j++) {
            if (i == 1 ||j == 1 || (j == n && i<=n-2) ||(i ==n/2+1&&j==n/2+1) ||(i==n-1&&j==n-1)||(i==n&&j==n)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();

    }

    //-------------------------------- I ----------------------------------------------------

            for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == n/2+1 || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }


    }
    
}
