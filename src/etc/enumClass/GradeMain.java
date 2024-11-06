package etc.enumClass;

public class GradeMain {
    public static void main(String[] args) {
        var result = Grade.Top.toGradeString(GradeType.Hangul);
        System.out.println(result);
        var result2 = Grade.Top.toGradeString(GradeType.Alphabet);
        System.out.println(result2);
    }
}
