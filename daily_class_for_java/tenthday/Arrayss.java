package daily_class_for_java.tenthday;

public class Arrayss {
    public static void main(String[] args) {
    int x =1000;
    String name = "Java";
    int[] arr = {1, 2, 3, 4, 5,5,6,7,8,9,10};
    int arr1[] = new int[10];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[3] = 3;
        arr1[4] = 6;
        arr1[6] = 0;
        for (int i = 0; i <arr1.length ; i++) {
            System.out.println(arr1[i]);
        }

        int[][] arr2 = new int[3][4];
        arr2[0][0] = 1;
        arr2[0][1] = 2;
        arr2[0][2] = 3;
        arr2[0][3] = 4;
        arr2[1][0] = 5;
        arr2[1][1] = 6;
        arr2[1][2] = 7;
        arr2[1][3] = 8;
        arr2[2][0] = 9;
        arr2[2][1] = 10;
        arr2[2][2] = 11;
        arr2[2][3] = 12;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

int[][][] arr3 = new int[2][3][4];
        arr3[0][0][0] = 1;
        arr3[0][0][1] = 2;
        arr3[0][0][2] = 3;
        arr3[0][0][3] = 4;
        arr3[0][1][0] = 5;
        arr3[0][1][1] = 6;
        arr3[0][1][2] = 7;
        arr3[0][1][3] = 8;
        arr3[0][2][0] = 9;
        arr3[0][2][1] = 10;
        arr3[0][2][2] = 11;
        arr3[0][2][3] = 12;
        arr3[1][2][3] =135455;

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                for (int k = 0; k < arr3[i][j].length; k++) {
                    System.out.print(arr3[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
