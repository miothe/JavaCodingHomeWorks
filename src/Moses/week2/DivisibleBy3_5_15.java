package Moses.week2;

public class DivisibleBy3_5_15 {

    public static void main(String[] args) {


        for(int i = 1; i <= 100; i++){
            if(i % 15 == 0){
                System.out.println(i+ " is divisible by 3,5 and 15");
            } else if (i % 3 == 0) {
                System.out.println(i + " is divisible by 3");
            }else if( i % 5 == 0){
                System.out.println(i + " is divisible by 5");
            }
        }


    }
}
