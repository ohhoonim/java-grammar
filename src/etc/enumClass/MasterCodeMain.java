package etc.enumClass;

import java.util.List;

public class MasterCodeMain {
    public static void main(String[] args) {
        var masterCode = LectureMethod.OFF_LINE;

        System.out.println(masterCode.name());
        System.out.println(masterCode.masterCode());
        System.out.println(masterCode.langCode());
        System.out.println(masterCode.groupCode());
       
        System.out.println(List.of(LectureMethod.values()));

        var result = List.of(LectureMethod.values()).stream()
            .filter(constants -> masterCode.masterCode().equals(constants.masterCode()))
            .findFirst().orElse(null);

        System.out.println("---" + result.masterCode());

        var enumConstants = MasterCode.enumCode(LectureMethod.class, "LME003");
        System.out.println("===" + enumConstants);

    }
}
