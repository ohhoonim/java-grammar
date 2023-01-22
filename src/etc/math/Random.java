package etc.math;

public class Random {
    public static void main(String[] args) {
        double randNum1 = Math.random();
        System.out.println(randNum1);

        int num = (int) (randNum1 * 10) ;
        // 0 ~ 9 사이의  숫자를 가져온다.  
        System.out.println(num);
        // java.util.Random 클래스를 사용하면 더 간단하다. 
        int intNum = new java.util.Random().nextInt(10);
        System.out.println(intNum);

    }
}
