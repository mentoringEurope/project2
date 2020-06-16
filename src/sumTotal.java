public class sumTotal {

    /*
        Create String 2D array

        {{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

        if the String has $ multiply by 3.2

        if the String has € multiply by 4.2

        return the double

     */


    /*
        String 2D array oluştur

       {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

       String de $ varsa 3.2 ile çarp

       String de € varsa 4.2 ile çarp

       double return et

    */
    public static void main(String[] args) {

//        Koda burdan başlayın
        String[][] s1 = new String [][]{{"$12" , "$22" , "$5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}};
        double [][]d1= null;
        double sum=0.0;
        for( int i = 0 ; i < s1.length ; i++){
            for(int j =0 ; j< s1[i].length ; j++){

                if(s1[i][j].contains("$")){
                    s1[i][j]=s1[i][j].replace("$","");

                    d1 [i][j] = Double.parseDouble(s1[i][j]);

                    d1 [i][j]=d1 [i][j]*3.2;



                }
                if(s1[i][j].contains("€")){
                    s1[i][j]=s1[i][j].replace("$","");

                    d1 [i][j] = Double.parseDouble(s1[i][j]);
                    d1 [i][j]=d1 [i][j]*4.2;
                }

                sum=+d1 [i][j];
            }

        }
        System.out.println(sum);
    }
}



