import java.util.Scanner;b

public class Main {
    public static void main(String[] args) {

        // Övning 1
        Scanner sc = new Scanner(System.in);
        int famn;
        int fot;
        int tum;
        int aln;

        System.out.println("Hur många famnar vill du omvandla?");
        famn = sc.nextInt();
        double famnToCm = famn * 178;
        System.out.println(famn + " famnar är " + famnToCm + " cm");
        System.out.println("Hur många alnar vill du omvandla?");
        aln = sc.nextInt();
        double alnToCm = aln * 59.3777777778;
        System.out.println(aln + " aln är " + alnToCm + " cm");
        System.out.println("Hur många tum vill du omvandla?");
        tum = sc.nextInt();
        double tumToCm = tum * 2.54;
        System.out.println(tum + " tum är " + tumToCm + " cm");
        System.out.println("Hur många fot vill du omvandla?");
        fot = sc.nextInt();
        double fotToCm = fot * 30.48;
        System.out.println(fot + " fot är " + fotToCm + " cm");


        // övning 2
        Scanner sc = new Scanner(System.in);
        int kronor;
        System.out.println("Hur stort belopp i SEK?");
        kronor = sc.nextInt();
        sc.nextLine();
        double sekToUSD = kronor * 0.090;
        double sekToEuro = kronor * 0.084;
        System.out.println(kronor + " kronor är " + sekToEuro + " euro eller " + sekToUSD + " dollar");


        // Övning 3
        int year = 2024;   // testa ett annat år
        int leapYear = year % 4;
        if (leapYear == 0) {
            System.out.println(year + " är ett skottår");
        } else {
            System.out.println("Det är inte ett skottår");
        }


        // Övning 4
        for (int i = 1; i <= 100; i++) {
            int result = i % 3;
            int result2 = i % 5;
            if (result == 0 && result2 == 0) {
                System.out.println("FizzBuzz");
            } else if (result == 0) {
                System.out.println("Fizz");
            } else if (result2 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }


        // Övning 5   V1
        Scanner sc = new Scanner(System.in);
        System.out.println("Välj svårighetsgrad? (lätt, mellan, svår");
        String level = sc.nextLine();
        int lower = 1;


        if (level.equals("lätt")) {
            int upperEasy = 10;
            int tries = 1;
            int randomEasy = (int) Math.floor(Math.random() * (upperEasy - lower + 1) + lower);
            System.out.println("Gissa på ett tal mellan 1-10");
            int guess = sc.nextInt();
            while (guess != randomEasy) {

                if (guess < randomEasy) {
                    System.out.println("Det är för lågt, gissa igen");
                    tries += 1;
                    guess = sc.nextInt();
                } else {
                    System.out.println("Det är för högt, gissa igen");
                    tries += 1;
                    guess = sc.nextInt();
                }
            }
            if (guess == randomEasy) {
                System.out.println("Du gissade rätt på " + tries + " försök");
            }
        } else if (level.equals("mellan")) {
            int upperMellan = 100;
            int tries = 1;
            int randomMellan = (int) Math.floor(Math.random() * (upperMellan - lower + 1) + lower);
            System.out.println("Gissa på ett tal mellan 1-100");
            int guess = sc.nextInt();
            while (guess != randomMellan) {

                if (guess < randomMellan) {
                    System.out.println("Det är för lågt, gissa igen");
                    tries += 1;
                    guess = sc.nextInt();
                } else {
                    System.out.println("Det är för högt, gissa igen");
                    tries += 1;
                    guess = sc.nextInt();
                }
            }
            if (guess == randomMellan) {
                System.out.println("Du gissade rätt på " + tries + " försök");
            }
        } else if (level.equals("svår")) {
            int upperSvår = 1000;
            int tries = 1;
            int randomSvår = (int) Math.floor(Math.random() * (upperSvår - lower + 1) + lower);
            System.out.println("Gissa på ett tal mellan 1-100");
            int guess = sc.nextInt();
            while (guess != randomSvår) {

                if (guess < randomSvår) {
                    System.out.println("Det är för lågt, gissa igen");
                    tries += 1;
                    guess = sc.nextInt();
                } else {
                    System.out.println("Det är för högt, gissa igen");
                    tries += 1;
                    guess = sc.nextInt();
                }
            }
            if (guess == randomSvår) {
                System.out.println("Du gissade rätt på " + tries + " försök");
            }
        }


        // Övning 6
        Scanner sc = new Scanner(System.in);
        String strpNumber;
        int total = 0;
        System.out.println("Ange ditt personnummer"); //antar 10 siffror eller 12 siffror med eller utan bindesträck
        strpNumber = sc.nextLine();
        if (strpNumber.contains("-")) {
            strpNumber = strpNumber.replace("-", "");    // spara resultatet
        }
        if (strpNumber.length() == 12) {
            strpNumber = strpNumber.substring(1);
            strpNumber = strpNumber.substring(1);
        }
        //int pNumber = Integer.parseInt(strpNumber);
        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {

                int n = strpNumber.charAt(i) * 2;
                if (n > 9) {
                    int first = Integer.parseInt(Integer.toString(n).substring(0, 1));
                    int last = Integer.parseInt(Integer.toString(n).substring(1, 2));
                    int add = first + last;
                    total = total + add;
                } else {
                    total = total + n;
                }

            } else {
                total = total + strpNumber.charAt(i);
            }
        }
        int control = total % 10;

        String control2 = Integer.toString(control);
        String strpNumber2 = String.valueOf(strpNumber.charAt(9));

        System.out.println(strpNumber2);

        if (control2.equals(strpNumber2)) {
            System.out.println("yayy");
        }


        // Övning 5   V2
        Scanner sc = new Scanner(System.in);
        System.out.println("Välj svårighetsgrad? (lätt, mellan, svår");
        String level = sc.nextLine();
        int lower = 1;
        guessGame(level);
    }

    while(!level.equals("lätt")&&!level.equals("mellan")&&!level.equals("svår")

    {
        System.out.println("Felaktig inmatning. Välj svårighetsgrad? (lätt, mellan, svår)");
        // System.exit(0);.    avsluta programmet
        static void guessGame (String level){
        int upper;
        if (level.equals("lätt")) {
            upper = 10;
        } else if (level.equals("mellan")) {
            upper = 100;
        } else if (level.equals("svår")) {
            upper = 100;
        } else {

        }
    }
        if (level.equals("lätt")) {
            int tries = 1;
            int randomEasy = (int) Math.floor(Math.random() * (upper - lower + 1) + lower);
            System.out.println("Gissa på ett tal mellan 1-10");
            int guess = sc.nextInt();
            while (guess != randomEasy) {

                if (guess < randomEasy) {
                    System.out.println("Det är för lågt, gissa igen");
                    tries += 1;
                    guess = sc.nextInt();
                } else {
                    System.out.println("Det är för högt, gissa igen");
                    tries += 1;
                    guess = sc.nextInt();
                }
            }
            if (guess == randomEasy) {
                System.out.println("Du gissade rätt på " + tries + " försök");
            }
        }


        // Övning 5 V3
        Scanner sc = new Scanner(System.in);
        System.out.println("Välj svårighetsgrad? (lätt, mellan, svår");
        String level = sc.nextLine();
        int lower = 1;
        int upper;
        switch (level) {
            case "lätt":
                upper = 10;
                break;
            case "mellan":
                upper = 100;
                break;
            case "svår":
                upper = 1000;
                break;
            default:
                upper = 10;
                break;
        }

        int tries = 1;
        int randomNumber = (int) Math.floor(Math.random() * (upper - lower + 1) + lower);
        System.out.println("Gissa på ett tal mellan 1-" + upper);
        int guess = sc.nextInt();
        while (guess != randomNumber) {

            if (guess < randomNumber) {
                System.out.println("Det är för lågt, gissa igen");
                tries += 1;
                guess = sc.nextInt();
            } else {
                System.out.println("Det är för högt, gissa igen");
                tries += 1;
                guess = sc.nextInt();
            }
        }
        if (guess == randomNumber) {
            System.out.println("Du gissade rätt på " + tries + " försök");
        }


        // Övning 5 V4
        Scanner sc = new Scanner(System.in);
        int lower = 1;
        int upper = 0;
        boolean validInput = false;
        boolean playAgain = true;
        boolean changeDifficulty = false;
        while (playAgain) {
            if(changeDifficulty){
                upper = 0;
                changeDifficulty = false;
                validInput = false;
            }
            while (!validInput) {
                System.out.println("Välj svårighetsgrad? (lätt, mellan, svår)");
                String level = sc.nextLine();
                switch (level) {
                    case "lätt":
                        upper = 10;
                        validInput = true;
                        break;
                    case "mellan":
                        upper = 100;
                        validInput = true;
                        break;
                    case "svår":
                        upper = 1000;
                        validInput = true;
                        break;
                    default:
                        upper = 0;
                        System.out.println("Ogiltig inmatning. Försök igen.");
                        break;
                }
            }
            int score = 100;
            long startTime = System.currentTimeMillis();
            int tries = 1;
            int randomNumber = (int) Math.floor(Math.random() * (upper - lower + 1) + lower);
            System.out.println("Gissa på ett tal mellan " + lower + "-" + upper);
            int guess = 0;
            validInput = false;
            while (!validInput) {
                if (sc.hasNextInt()) {
                    guess = sc.nextInt();
                    sc.nextLine();
                    validInput = true;
                } else {
                    System.out.println("Ogiltig inmatning. Försök igen.");
                    sc.next();
                }
            }

            while (guess != randomNumber) {
                if (guess < randomNumber) {
                    System.out.println("Det är för lågt, gissa igen");
                } else {
                    System.out.println("Det är för högt, gissa igen");
                }
                tries += 1;
                validInput = false;
                while (!validInput) {
                    if (sc.hasNextInt()) {
                        guess = sc.nextInt();
                        sc.nextLine();
                        validInput = true;
                    } else {
                        System.out.println("Ogiltig inmatning. Försök igen.");
                        sc.next();
                    }
                }
            }
            if (guess == randomNumber) {
                long endTime = System.currentTimeMillis();
                long timeTaken = endTime - startTime;
                System.out.println("Du gissade rätt på " + tries + " försök");
                System.out.println("Det tog dig " + timeTaken/1000 + " sekunder att gissa rätt nummer!");
                validInput = false;
                while (!validInput) {
                    System.out.println("Vill du spela igen? (ja/nej");
                    String answerAgain = sc.nextLine();
                    if (answerAgain.equals("ja")) {
                        playAgain = true;
                        System.out.println("Vill du byta svårighetsgrad? (ja/nej)");
                        validInput = false;
                        while (!validInput) {
                            String answerDifficulty = sc.nextLine();
                            if (answerDifficulty.equals("ja")) {
                                changeDifficulty = true;
                                validInput = true;
                                if (changeDifficulty) {
                                }
                            } else if
                            (answerDifficulty.equals("nej")) {
                                changeDifficulty = false;
                                validInput = true;
                            } else {
                                validInput = false;
                                System.out.println("Ogiltig inmatning. (ja/nej).");
                            }
                        }
                    } else if (answerAgain.equals("nej")) {
                        playAgain = false;
                        validInput = true;
                        System.out.println("Tack för att du spelat!");
                        break;

                    } else  {
                        System.out.println("Ogiltig inmatning. Svara ja eller nej");
                    }
                }

            }
        }



    }
}
