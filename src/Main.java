//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        checkDivisibility();

    }
            public static void checkDivisibility(){
                for(int i= 0; i < 16; i++){

                    if ( i % 3 ==0){
                        System.out.println( i +  " is divisible by 3");
                    }
                    else{
                        System.out.println( i + " is not divisible by 3");
                    }
                }
           }
    }