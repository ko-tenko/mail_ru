package utils;

import com.github.javafaker.Faker;

public class TextUtil {

    private TextUtil() {
    }

    public static String generateText(int wordCount) {
        if (wordCount <= 0) {
            throw new IllegalArgumentException("Word count must be a positive integer.");
        }
        Faker faker = new Faker();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordCount; i++) {
            sb.append(faker.lorem().word()).append(" ");
        }
        return sb.toString().trim();
    }
}
