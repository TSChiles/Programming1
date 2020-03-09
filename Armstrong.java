public class Armstrong {
    public static void main(String[] args) {

        for (int num = 1; num <= 500; num ++){
            //int n = 153;
            int temp = num;
            int sum = 0;

            while (temp != 0){
                //1st step:
                int lastDigit = temp % 10;


                //2nd step:
                temp = temp / 10;


                //3rd step:
                sum = sum + lastDigit * lastDigit * lastDigit;

            }

            if (sum == num) {
                System.out.println(num + " This is simplied armstrong number");
        }

        }
    }
}
