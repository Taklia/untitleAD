package com.example.student2.untitle4;

/**
 * Created by student2 on 30.01.17.
 */
public class Situation {
    public int[] choices;
    public String subject;
    public String text;

    public Situation(String subject, String text, int variants[]) {
        this.subject = subject;
        this.text = text;

        choices = new int[variants.length];

        for (int i = 0; i < variants.length; i++) {
            if (variants[i] >= 0) {
                choices[i] = variants[i];
            }
        }
    }
}
