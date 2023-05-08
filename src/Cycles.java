public class Cycles {

    public void forOddNums(){
        for(int i = 1; i <= 99; i++) {
            if (i % 2 != 0) {
                System.out.println(i++);
            }
        }
    }

    public void forFactorial(int n, int a){

        for (int i = 1; i <= n; i++) {
            a *= i;
        }
        System.out.println(n + "! = " + a);
    }

    public void sequenceOfNumbers(){
        int num = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(num);
            num -= 5;
        }
    }

    public void forMultiplication(int x){
        for(int i = 1; i <= 9; i++) {
            System.out.println(x * i);
        }

    }

    public void forOddArray(){
        int[] oddNumbers = new int[10];
        int count = 0;
        for (int i = 1; i <= 19; i++) {
            if(i % 2 != 0){
            oddNumbers[count] = i;
            count++;
            }
        }

        for (int i = 0; i < oddNumbers.length; i++) {
            System.out.print(oddNumbers[i]);
            if (i < oddNumbers.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public void forMinFromArray(){
        int[] array = {4, 3, 12, 42, 64, 5, 1};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    public void forMaxFromArray(){

        int[] array = {4, 3, 12, 42, 64, 5, 1};
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    public void replaceMinMax() {
        int[] array = {4, 3, 12, 42, 64, 5, 1};

        int min = array[0];
        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > max) {
                max = array[i];
                maxIndex = i;
            }
        }

        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        // Вывод массива на экран
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
    public void whileOddNums(){
        int i = 1;
        while(i <= 99){
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public void whileFactorial(int n, int a) {

        int i = 1;
        while (i <= n) {
            a *= i;
            i++;
        }
        System.out.println(n + "! = " + a);
    }


    public void doWhileOddNums(){
        int i = 1;
        do{
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }while (i <= 99);
    }


    public void doWhileFactorial(int n, int a){

    int i = 1;
        do {
        a *= i;
        i++;
    } while (i <= n);

        System.out.println(n + "! = " + a);
}



}
