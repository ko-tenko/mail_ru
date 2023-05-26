package utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Objects;

public final class FileManagerUtil {

    private static final Logger LOGGER = LogManager.getLogger();

    private FileManagerUtil(){}

    public static String getValue(String fileName, String key) {

        if (fileName == null) {
            LOGGER.error("File path is null.");
            throw new IllegalArgumentException();
        }
        try {
            LOGGER.info("Getting by key [{}] a value from [{}]", key, fileName);
            URL resourceUrl = FileManagerUtil.class.getClassLoader().getResource(fileName);
            Path resourcePath = Paths.get(Objects.requireNonNull(resourceUrl).toURI());
            String absolutePath = resourcePath.toAbsolutePath().toString();
            ObjectMapper mapper = new ObjectMapper();
            JsonNode rootNode = mapper.readTree(Files.readAllBytes(Paths.get(absolutePath)));
            JsonNode valueNode = rootNode.get(key);
            return valueNode.asText();
        } catch (IOException | URISyntaxException e) {
            LOGGER.error("Error while reading the file.");
            throw new RuntimeException(e);
        }
    }
}