package Exercises;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int climbersCount = Integer.parseInt(scanner.nextLine());

        int musala = 0;
        int montblanc = 0;
        int kilimanjaro = 0;
        int kTwo = 0;
        int everest = 0;
        int allPeople = 0;

        for (int i = 0; i < climbersCount; i++) {
            int personCount = Integer.parseInt(scanner.nextLine());
            allPeople +=personCount;
            if(personCount<=5)
            {
                musala+=personCount;
            }
            else if(personCount<=12)
            {
                montblanc+=personCount;
            }
            else if(personCount<=25){
                kilimanjaro+=personCount;
            }
            else if(personCount<=40){
                kTwo+=personCount;
            }
            else {
                everest+=personCount;
            }
        }

        double allMusala = 1.0*musala/allPeople*100;
        double allMont = 1.0*montblanc/allPeople*100;
        double allKili = 1.0*kilimanjaro/allPeople*100;
        double allKTwo = 1.0*kTwo/allPeople*100;
        double allEverest = 1.0*everest/allPeople*100;

        System.out.printf("%.2f%%\n",allMusala);
        System.out.printf("%.2f%%\n",allMont);
        System.out.printf("%.2f%%\n",allKili);
        System.out.printf("%.2f%%\n",allKTwo);
        System.out.printf("%.2f%%",allEverest);
    }
}
