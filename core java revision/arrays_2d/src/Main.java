public class Main {
    public static void main(String[] args) {

      // 2d array = an array of arrays

        /*String [][]  cars = new String[3][3];

        cars[0][0] = " bmw ";
        cars[0][1] = " volvo ";
        cars[0][2] = " benz ";
        cars[1][0] = " maserati";
        cars[1][1] = "totyota ";
        cars[1][2] = " mclaren";
        cars[2][0] = " fiat ";
        cars[2][1] = " ratmobile ";
        cars[2][2] = " batmobile ";   */

// outer for loop
     /*   for(int i = 0; i < cars.length; i++){
            System.out.println();
            //inner for loop
            for (int j = 0; j <cars[i].length;j++ ){
                System.out.print(cars[i][j]+ " ");
            }
        }
*/

        // another way of writing without predefining amount of variables in array

        String [][]  cars ={
                           {"bmw","volvo","benz"}
                          ,{"maserati","totyota "," mclaren"}
                          ,{"fiat","ratmobile","batmobile"}
                          };

        for(int i = 0; i < cars.length; i++){
            System.out.println();
            //inner for loop
            for (int j = 0; j <cars[i].length;j++ ){
                System.out.print(cars[i][j]+ " ");
            }
        }


    }
}