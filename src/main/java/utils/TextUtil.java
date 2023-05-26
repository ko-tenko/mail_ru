package utils;

import com.github.javafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class TextUtil {

    private static final Logger LOGGER = LogManager.getLogger();

    private TextUtil() {}

    public static String generateText(int wordCount) {
        if (wordCount <= 0) {
            throw new IllegalArgumentException("Word count must be a positive integer.");
        }
        LOGGER.info("Generating {} words.", wordCount);
        Faker faker = new Faker();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < wordCount; i++) {
            sb.append(faker.lorem().word()).append(" ");
        }
        return sb.toString().trim();
    }
}
