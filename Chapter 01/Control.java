public class Control {
    public static void main(String[] args) {
        
        // example if-else statement
        int age = 16;
        if (age >= 18) {
            System.out.println("You are old enough for this ride.");
        } else {
            System.out.println("You are not old enough for this ride.");
        }
        
        // example switch statement
        int jersey = 8;
        switch (jersey) {
            case 8:
                System.out.println("Kobe's original jersey.");
                break;
            case 24:
                System.out.println("Kobie's newest jersey.");
                break;
            case 32:
                System.out.println("Magic's jersey.");
                break;
            default:
                System.out.println("Jersey not found.");
                break;
        }

        // example for loop
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        // example while loop
        int j = 0;
        while (j < 3) {
            System.out.println(j);
            j++;
        }

        // example do-while loop
        int k = 0;
        do {
            System.out.println(k);
            k++;
        } while (k < 3);


    }
}
