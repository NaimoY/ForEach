public class WhileLoop {

    public static void main(String[] args) {

        // data type, data type name, = data value

        // String name = "Ismail";
        // double bankAccountBalance = 500;
        //  int age = 27;


        int randomInt = (int) Math.floor(Math.random() * 51);
        System.out.println("Random Num is " + randomInt);
         //while 8 %3
        while (randomInt % 3 != 0   ) {
            System.out.println(randomInt);
            randomInt = (int) Math.floor(Math.random() * 51);
        }
        System.out.println("Divisible by 3 : " + randomInt);
    }

}

// a do while loop first runs the task, and then it contniues running the task as long as the condition in the while is true

// create a random integer from 0 to 50
// while the number is not divisble by 3
// print the number and change the value of the random number
//to a new randomly generated number