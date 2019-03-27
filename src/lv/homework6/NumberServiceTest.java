package lv.homework6;

public class NumberServiceTest {

    public static void main(String[] args) {

      NumberService exapple1 = new NumberService(6,10);
      exapple1.sumInRange();
      exapple1.getEvenNumberCount();
      NumberService exammple2 =new NumberService(9,1);
       // So : "Ja pirmais skaitlis ir vairāk nekā otrais - aprēķiniet visu skaitļus no otrā līdz pirmajam skaitlim, ieskaitot"
        // es sapratu ta ka ir "sout" zemak
        System.out.println("Returns numbers from smallest to biggest");
      exammple2.sumInRange();
      exammple2.getEvenNumberCount();
    }
}
