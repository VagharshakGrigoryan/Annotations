package com.company.annotationTest.test;

public class UniversityGroup {
    @TestAnnotation
    public static boolean isCorrectNumberOfGroups() {
        boolean res = groupsCalculator(1, 2, 3, 4) == 10;
        System.out.println("UniversityGroupNumber is = "+res);
        return res;
    }

    private static long groupsCalculator(long... numberGroups) {
        long res = 0;
        for (long tmp : numberGroups) {
            res += tmp;
        }
        return res;
    }
}
