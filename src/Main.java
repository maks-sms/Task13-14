public class Main {

    public static void main(String[] args) {

        //задание 1
        String str1 = "run";
        String str2 = "ran";

        try {
            exception1(str1, str2);
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

        //задание 2
        int [] nums = new int[100];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 100);
        }

        exception2(nums);

        //Задание 3
        try {
            exception3(nums[(int) (Math.random() * 100)],nums[(int) (Math.random() * 100)]);
        } catch (DivideByZeroException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void exception1 (String str1, String str2) throws IllegalArgumentException{
        String s1 = str1.substring(str1.length() - 1);
        String s2 = str2.substring(str1.length() - 1);

        if(s1.equals(s2)) {
            throw new IllegalArgumentException(s1);
        }
    }


    static void exception2 (int [] num){
        int res = 0;
        try {
            res = num[(int) (Math.random() * 100)] / num[(int) (Math.random() * 150)];
        } catch (ArithmeticException ex) {
            try {
                res = num[(int) (Math.random() * 100)] / num[(int) (Math.random() * 150)];
            } catch (ArithmeticException e){
                System.out.println(e.getMessage());
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println(res);

    }

    static void exception3 (int i1, int i2) throws DivideByZeroException {
        if (i2 == 0) {
            throw new DivideByZeroException("делитель равен 0");
        }

        System.out.println(i1 / i2);
    }

}
