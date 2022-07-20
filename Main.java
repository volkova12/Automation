import java.util.Arrays;

public class Main {
        public static void main(String[] args) {
            System.out.println("Hello NEW world!");

            System.out.println ("10. Datatypes");
            byte b = 1;
            System.out.println (b);
            short s = 2;
            System.out.println (s);
            int i = 30;
            System.out.println (i);
            long l = 19922;
            System.out.println (l);
            float f = 2.25f;
            System.out.println (f);
            double d = 23556.56655;
            System.out.println (d);
            boolean t = true;
            System.out.println (t);
            char ch = 'a';
            System.out.println (ch);


            System.out.println ("11. If & Else");
            String weather = "sunny";
            if (weather == "sunny") {
                System.out.println ("I will go outside");
            } else {
                System.out.println ("I will stay at home");
            }


            System.out.println ("12. If, Else If & Else");
            int x = 1;
            if (x < 0) {
                System.out.println ("Negative number");
            } else if (x > 0) {
                System.out.println ("Positive number");
            } else {
                System.out.println ("Zero");
            }


            System.out.println ("13. OR & AND");
            Boolean drivingLicense = true;
            int age = 25;
            if (drivingLicense = true & age <= 18) {
                System.out.println ("You can drive a car");
            } else
                System.out.println ("You are forbidden to drive a car");


            System.out.println ("14. Switch");
            String grade = "B";
            switch (grade) {
                case "A":
                    System.out.println ("Excellent");
                    break;
                case "B":
                    System.out.println ("Good");
                    break;
                case "C":
                    System.out.println ("Not good");
                    break;
                case "D":
                    System.out.println ("Poor");
                    break;
                case "E":
                    System.out.println ("Failed");
                    break;
            }


            System.out.println ("15. Arrays");
            int [] myArray = new int[3];
            myArray[0] = 12;
            myArray[1] = 21;
            myArray[2] = 221;
            System.out.println (Arrays.toString(myArray));

            System.out.println ("16. FOR Loop");
            for (int lo=1; lo<=10; lo++) {
                System.out.println ("Looping");
            }

            System.out.println ("17. WHILE Loop");
           int w = 5;
            while (w >= 1) {
                System.out.println ("Number is: " + w);
                w--;
            }

            System.out.println ("18. Arrays Looping 1");
            String[] studentNames;
            studentNames = new String[] {"Anna", "Mariia", "Michael", "David", "Victor"};
            int[] studentAge = new int[] {18, 19, 20, 21, 22};
            System.out.println (studentNames[0]);
            System.out.println (studentNames[3]);
            System.out.println (studentAge[2]);
            System.out.println (studentAge[4]);


            System.out.println ("19. Arrays Looping 2");
            double[] numList = {21.5, 13.5, 17.2, 220.2};
            for (int m=0; m < numList.length; m++) {
                System.out.println (numList[m] + " ");
            }
            double sum = 0;
            for (int m=0; m < numList.length; m++) {
                sum += numList[m];
            }
            System.out.println ("sum is " + sum);

            double max = numList[0];
            for (int m=1; m < numList.length; m++) {
                if (numList[m] > max) max = numList[m];
            }
            System.out.println ("max is " + max);


            System.out.println ("20. String Interpolation");
            String personName = "Anna";
            int personAge = 25;
            String personCountry = "USA";
            String personState = "California";
            String personCity = "Los Angeles";
            System.out.println ("Person Details: name:"+ personName +", age:"
                    + personAge +", " + "Country:" + personCountry +", State:"
                    + personState +", City:" + personCity);

         }
}




