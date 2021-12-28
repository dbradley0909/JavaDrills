//public class FizzBuzz {
//    /* declares a member's access as public which is visible to all classes */
//    public static void main(String[] args) {
//        /* the program starts its execution or simply the entry point of Java programs is the main() method */
//        fizzBuzz100();
//        /* calls the main() method */
//    }
//
//    private static void fizzBuzz100() {
//        /* does the same thing as line 3 */
//        for (int i = 1; i <= 100; i++) {
//            /* looping through an array starting at 1 and stops at 100 */
//            if ((i % 3) == 0)
//                /* if i is divisible by 3 with a remainder of zero print fizz */
//                System.out.println("fizz");
//            else if ((i % 5) == 0)
//                /* if i is divisible by 5 with a remainder of zero print buzz */
//                System.out.println("buzz");
//            else if (((i % 5) == 0) && ((i % 3) == 0))
//                /* if i is divisible by 5 and 3 with a remainder of zero print it should print out fizzbuzz also get rid of the && sign so it can stop throwing erorrs in the code stating its a boolean */
//                System.out.println("fizzbuzz");
//            else
//                System.out.println(i);
//            /* the error is that the function is mixed up line 19 belongs on line line 13 and vice versa the only way to fix this is to make a switch */
//        }
//    }
//}

public class FizzBuzz {

    public static void main(String[] args) {

     fizzBuzz100();

     }

private static void fizzBuzz100() {

    for (int i = 0; i <= 100; i++) {
        System.out.print(i + ": ");
        switch(i % 15){
            case 0:
                System.out.print("fizzbuzz");
                break;
            case 3, 6, 9, 12:
                System.out.print("fizz");
                break;
            case 5,10:
                System.out.print("buzz");
                break;
            default:
        }

        System.out.println();
    }
}
}

