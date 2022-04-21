package com.company.simple_anno.documentation;

import java.lang.annotation.Documented;

/**
 * @author Vagharshak Grigoryan
  */
public class Main {

    @Documented
    @interface ClassPreamble {
        String author();
        String date();
        int currentRevision() default  1;
        String lastModified() default  "N/A";
        String lastModifiedBy() default "N/A" ;
        String [] reviewers();

    }

    @ClassPreamble(
            author = "Vagharshak",
            date = "21/04/2022",
            currentRevision = 5,
            lastModified = "21/04/2020",
            lastModifiedBy = "Vagharshak Grigoryan",
            reviewers = {"Vagharshak","Poxos","Petros"}
    )

    public static void main(String[] args) {

    }
}
