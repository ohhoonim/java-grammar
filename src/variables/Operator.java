package variables;

public class Operator {
    public static void main(String[] args) {

        // int, short, long
        // float, double
        // boolean
        // byte
        // char, String
        
        // 대입 연산자 
        // =, +=, -=
        int intX = 980;
        System.out.println(intX); // 980
        intX += 80;
        System.out.println(intX); // 1060
        intX -= 9;
        System.out.println(intX); // 1051

        // 산술 연산자 
        // 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지
        int valueA = 100;
        int valueB = 30;
        int plus = valueA + valueB;
        System.out.println(plus);

        int minus = valueA - valueB;
        System.out.println(minus);

        int times = valueA * valueB;
        System.out.println(times);

        int divide = valueA / valueB;
        System.out.println(divide);  // 자료형이 int라 소수점은 나오지 않음

        int remain = valueA % valueB;
        System.out.println(remain);

        // 증감 연산자
        // ++, --
        int increaseNumber = 0;
        increaseNumber++;
        System.out.println(increaseNumber);  // 1
        
        int increaseNumber2 = 5;
        System.out.println(increaseNumber2++);  // 5가 나옴. 
        System.out.println(increaseNumber2);  // 6이 나옴. 
        
        int increaseNumber3 = 7;
        System.out.println(++increaseNumber3);  // 8이 나옴. 
        System.out.println(increaseNumber3);  // 8이 나옴. 

        int decreaseNumber = 10;
        --decreaseNumber;
        System.out.println(decreaseNumber);  // 9

        // 비교 연산자
        // 결과는 boolean 자료형이다. 

        boolean isGreater = 5 < 6;
        System.out.println(isGreater); // true
        
        boolean isGreaterOrEqual = 51 <= 50;
        System.out.println(isGreaterOrEqual); // false

        boolean isEqual = 5 == 6; 
        System.out.println(isEqual); // false

        boolean isNotEqaul = 7 != 8;  // true
        System.out.println(isNotEqaul);
        
        
        // 논리 연산자
        boolean booleanAnd = true && true; // AND 연산 : 양쪽다 true이어야 한다.
        System.out.println(booleanAnd); // true

        boolean booleanOr = false || true; // OR 연산 : 하나만 true여도 true이다.
        System.out.println(booleanOr); // true

        boolean trueValue = true;
        boolean notValue = !trueValue;  // true는 false로 false는 true로 바뀐다.
        System.out.println(notValue);

        // 삼항 연산자
        int result = 5 == 6 ? 10 : 50;
        System.out.println(result); // 50

    }
}
