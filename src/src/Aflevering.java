public class Aflevering {
    public static void main(String[] args) {


        // Opgave 1
        /*
        double item1 = 25.50;
        double item2 = 15.00;
        double item3 = 30.00;
        double subtotal = item1 + item2 + item3;

        double taxRate = 25.00;
        double withTax = subtotal + (subtotal * taxRate / 100.0);

        System.out.println(subtotal);
        System.out.println(withTax);
         */


        // Opgave 2
        /*
        double food = 450;
        double drink = 120;
        double tips = 50.0;
        int persons = 4;

        double total = food + drink + tips;
        double split = total / persons;
        System.out.println(split);
         */

        // Opgave 3
        /*
        double originalPrice = 300.0;
        double discountPercent = 20.0;
        double discounted = originalPrice - (originalPrice * discountPercent / 100.0);
        double taxPercent = 25.0;
        double finalPrice = discounted + (discounted * taxPercent / 100.0);

        System.out.println(originalPrice);
        System.out.println(discounted);
        System.out.println(finalPrice);
         */


        // Opgave 4
        /*
        int guests = 15;
        int cupcakes = 40;
        int cupcakesEach = cupcakes / guests;
        int leftOver = cupcakes % guests;

        System.out.println("Each guets gets " + cupcakesEach + " cupcakes");
        System.out.println(leftOver + " cupcakes left over");
         */


        // Opgave 5
        /*
        StringBuilder sb = new StringBuilder();
        String name = "Anna";
        int age = 25;
        sb.append("Hello, ");
        sb.append(name);
        sb.append("! ");
        sb.append("You are ");
        sb.append(age);
        sb.append(" years old.");
        System.out.println(sb.toString());
         */


        // Opgave 6
        /*
        int score = 100;
        System.out.println(score);
        score += 50;
        System.out.println(score);
        score += 25;
        System.out.println(score);
         */


        // Opgave 7
        /*
        int score = 100;
        score -= 15;
        System.out.println(score);
        score -= 20;
        System.out.println(score);
         */


        // Opgave 8
        /*
        double price = 50.0;
        System.out.println(price);
        price *= 2;
        System.out.println(price);
         */


        // Opgave 9
        /*
        int counter = 10;
        System.out.println(counter);
        counter++;
        System.out.println(counter);
        counter--;
        System.out.println(counter);
         */


        // Opgave 10
        /*
        int number = 10;
        number += 5;
        System.out.println(number);
        number -= 3;
        System.out.println(number);
        number++;
        System.out.println(number);
        number--;
        System.out.println(number);
         */


        // Opgave 11
        /*
        String productName = "Laptop";
        double productPrice = 7999.99;
        boolean inStock = true;
        int stockQuantity = 15;
        double discountPercent = 10.0;
        String category = "Electronics";
         */


        // Opgave 12
        /*
        String name = "Anna";
        int testScore = 85;
        int homeworkScore = 92;
        double finalGrade = 88.5;
        boolean passedCourse = true;
         */


        // Opgave 13
        /*
        String guestName = "Peter Hansen";
        int roomNumber = 204;
        int numberOfNights = 3;
        double pricePerNight = 899.00;
        boolean hasBreakfast = true;
        double totalPrice = 2697.00;
         */


        // Opgave 14
        /*
        int stepsToday = 8547;
        int stepsGoal = 10000;
        double kmDistance = 6.2;
        int caloriesBurnt = 420;
        boolean reachedGoal = false;
         */


        // Opgave 15
        /*
        String bookTitle = "A Game of Thrones";
        String author = "George R. R. Martin";
        String isbn = "9780553573404";
        int pages = 835;
        boolean isAvailable = true;
        String currentBorrower = "";
        String dueDate = "2026-09-10";
        double fineAmount = 0.0;
        boolean isBestseller = true;
        double rating = 4.45;
         */

        /* Refleksionsspørgsmål:
        Efter du har løst opgaverne, tænk over:
        Hvad er forskellen mellem int division og double division?
        - int smider decimalerne væk, hvor double bevarer dem.

        Hvornår skal du bruge parenteser i calculations?
        - Bruges til at styre regnerækkefølgen, så de calculations inde i parenteserne udføres før resten.

        Hvad giver modulo (%) operator dig?
       - Giver resten ved en division

        Hvordan kombinerer du strings og numbers?
        -

        Hvad sker der hvis du skriver "5" + 3 vs 5 + 3?
        - der bliver printet 53 og 8

        Hvorfor er += mere praktisk end = ... + ?
        - Det er kortere og mere simpelt.

        Hvordan tvinger du decimal division med int variables?
        - Man kan konventere mindst en af variablerne til en double før divisionen.
        fx:
        int a = 10;
        int b = 3;
        System.out.println((double) a/b);
        */

    }
}
