public class StarWars {
    public static void main(String[] args){
        String firstName = "Luke";
        String lastName = "SkyWalker";
        String birthDate = "19 bby";
        String homeWorld= "Tatooine";
        double feet = 1.72 * 3.28084;
        System.out.print("Converted Luke height from meters into feet = ");
        System.out.printf("%.2f", + feet);
        System.out.println('\n'+firstName);
        System.out.println(lastName);
        System.out.println(birthDate);
        System.out.println(homeWorld);

        int purse = 150;
        System.out.println(purse - 24.3);
        System.out.println(purse - 4.50 - 24.3);
        System.out.println(purse - 4.50 - 24.3  %2);

        boolean blackHandle = true;
        boolean purpleBlade = true;

        if (blackHandle == true && purpleBlade == true) {
             System.out.println("That one mines");
        } else {
            System.out.println("Pass!");
        }
        boolean melleniumFalcon = true;

        if (melleniumFalcon == true) {
            System.out.println("Let’s go!");
        } else {
            System.out.println("I better hide somewhere!");
        }

        if (5>1) {
            System.out.println("You are trying it, if it is 5 or less");
        } else if (1 > 0) {
            System.out.println("A drink is under 1 credit or bigger than 24oz, you will order it.");
       } else {
            System.out.println("To expensive, dont buy!");
        }

    }
}

