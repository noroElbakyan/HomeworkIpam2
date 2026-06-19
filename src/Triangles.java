public class Triangles {
     void growingTriangles(){

        for (int i=1;i<=5;i++){

            for (int j=1;j<=i;j++){
                System.out.print('*');

            }
            System.out.println();

        }

    };

     void decreasingTriangles(){
        for (int i=1;i<=5;i++) {
            for (int j=5;j>= i;j--){
                System.out.print('*');
            }
            System.out.println();
        }
    }

    void pyramidTriangles(){
        int rows =5;
        for(int i =1;i<=rows;i++){
            for (int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for (int k=1;k<=2*i-1;k++){
                System.out.print("*");

            }
            System.out.println();
        }
    }


}
