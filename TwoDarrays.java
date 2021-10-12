public class TwoDarrays {
    public static void main(String[] args) throws Exception {
               // 2D Array = an array of arrays 
       // String[][] cars = new String[3][3];

      //  cars[0][0] = "Mustang";
      //  cars[0][1] = "Camaro";
      //  cars[0][2] = "BMW";
      //  cars[1][0] = "Mercedes";
      //  cars[1][1] = "Lambo";
      //  cars[1][2] = "Ferrari";
      //  cars[2][0] = "Tesla";
      //  cars[2][1] = "Ford";
      //  cars[2][2] = "Cadillac";

      //  for(int i=0;i<cars.length;i++){
      //      System.out.println();
      //      for(int j=0;j<cars[i].length;j++){
      //          System.out.print(cars[i][j]+" ");

    //    }


        String[][] cars = {
                       {"Mustang","Camaro","BMW"},
                       {"Mercedes","Lambo","Ferrari"},
                       {"Tesla","Ford","Cadillac"}
                       };

        for(int i=0;i<cars.length;i++){
            System.out.println();
            for(int j=0;j<cars[i].length;j++){
                System.out.print(cars[i][j]+" ");
            }

        }

        }


    }
