public class EvenNumbers {
    public static void main(String[] args) {


        int number = 100;
        {
            System.out.println("The Even Numbers Between 1 and 100 are:");
            for (int i = 1; i <= number; i++) {

                if(i%2 ==0)
                    System.out.println(i);
            }


        }
    }
}
