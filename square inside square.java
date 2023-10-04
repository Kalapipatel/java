import java.util.*;

class rough2 {

    public static void print_(char x[][]) {
        int n = x.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(x[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char m[][] = new char[n][n];

        for (int z = 0; z < n; z++) {
            if (z % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    m[z][i] = '*';
                    m[i][z] = '*';
                    m[n - z - 1][i] = '*';
                    m[i][n - 1 - z] = '*';
                }
            } else {
                for (int i = 0; i < n; i++) {
                    m[z][i] = ' ';
                    m[i][z] = ' ';
                    m[n - z - 1][i] = ' ';
                    m[i][n - 1 - z] = ' ';
                }
            }
        }

        print_(m);
    }
}
