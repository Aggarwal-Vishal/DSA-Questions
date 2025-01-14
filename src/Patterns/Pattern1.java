package Patterns;

public class Pattern1 {
    public static void main(String[] args) {
        pattern11(5);


    }

    static void pattern11(int n){
        int start = 1;
        for (int row = 1; row <= n ; row++) {
            if(row % 2 == 0){
                start = 0;
            }else{
                start = 1;
            }
            for (int col = 1; col <= row ; col++) {
                System.out.print(start);
                start = 1-start;

            }
            System.out.println();

        }
    }
    static int pattern25 ( int n ){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        return n;
    }
    static int pattern52 ( int n ){
        for (int row = 1; row <= n; row++) {
            for (int col = row; col <= n-1; col++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        return n;
    }




    static void ErectPyramid(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= 2 * row - 1; stars++) {
                System.out.print("*");
            }
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
        static void invertedPyramid(int n){
            for (int row = 1; row <= n; row++) {
                for (int space = 1; space <= row-1; space++) {
                    System.out.print(" ");
                }
                for (int stars = 1; stars <= 2 * n - (2*row - 1); stars++) {
                    System.out.print("*");
                }
                for (int space = 1; space <= row-1; space++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }




    static void pattern8(int n){
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= row-1; space++) {
                System.out.print(" ");
            }
            for (int stars = 1; stars <= 2 * n - (2*row - 1); stars++) {
                System.out.print("*");
            }
            for (int space = 1; space <= row-1; space++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    static void pattern7(int n) {
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
                for (int stars = 1; stars <= 2 * row - 1; stars++) {
                    System.out.print("*");
                }
                    for (int space = 1; space <= n - row; space++) {
                        System.out.print(" ");
                    }
            System.out.println();
                }



        }

        static int pattern ( int n){
            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= n; col++) {
                    System.out.print("*" + " ");

                }
                System.out.println();

            }
            return n;
        }

        static int pattern2 ( int n ){
            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= row; col++) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
            return n;
        }


        static int pattern3 ( int n ){
            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= row; col++) {
                    System.out.print(col + " ");
                }
                System.out.println();
            }
            return n;
        }

        static int pattern4 ( int n ){
            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= row; col++) {
                    System.out.print(row + " ");
                }
                System.out.println();
            }
            return n;
        }

        static int pattern5 ( int n ){
            for (int row = 1; row <= n; row++) {
                for (int col = row; col <= n; col++) {
                    System.out.print("*" + " ");
                }
                System.out.println();
            }
            return n;
        }

        static int pattern6 ( int n ){
            for (int row = 1; row <= n; row++) {
                for (int col = 1; col <= n - row + 1; col++) {
                    System.out.print(col + " ");
                }
                System.out.println();
            }
            return n;
        }


    }

