package lv.homework2;

public class RandomNumbersServiceTest {
    public static void main(String[] args) {


       int randomNumberOne = (int) (Math.random()*6);
       int randomNumberTwo =  (int) (Math.random()* (5+1) + 5);  // 5 + 1 + 5 ir tas pats kas 11
       int randomNumberThree =  (int) (Math.random()* (10+1) -10 ); //raktam 21

       System.out.println( "Your random number is " + randomNumberOne);
       System.out.println(randomNumberTwo);
       System.out.println(randomNumberThree);

       //"ctrl + alt + l" koda formatēšana
      int sumOfRandomNumbers = randomNumberOne+ randomNumberTwo + randomNumberThree;
      System.out.println("Sum of random numbers " + sumOfRandomNumbers);

        //System.out.println(randomNumberOne + randomNumberTwo + randomNumberThree); //šo vajag dzēst ārā
    }
}
