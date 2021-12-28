public class Functions {
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        myMethod();
        HelloWorld();
        greeting("John!");

        float sum = add(6, 6);
        System.out.println(sum);

        String color = "green";
        faveColorFinder(color);

        int number = 1;
        thatsOdd(number) ;

        bigOrSmall(25);
    }

    public static void HelloWorld() {
        System.out.println("Hello world!");
    }

    public static void greeting(String name) {
        System.out.println("Hello " + name);
    }

    public static float add(float num1, float num2) {
    return num1 + num2;
    }

    public static void faveColorFinder(String color) {
        if (color == "red") {
            System.out.println("red is a great color");
        } else if (color == "green") {
        System.out.println("green is a solid favorite color");
        } else if (color == "black") {
         System.out.println("trendy");
        } else {
     System.out.println(" you need to evaluate your favorite color choice");
    }
    }

    public static void thatsOdd(int number) {
        if (number % 2 == 0) {
            System.out.println("That’s not odd!");
        } else {
            System.out.println("That is odd indeed!");
        }
    }
        public static void bigOrSmall(int arr){
        int answers = arr[i];
        for(int i = 0; i < answers; i++){

                if (arr[i] >= 100) {
                    System.out.println("big");
                } else {
                    System.out.println("small");
                }


        }
        }
    }


