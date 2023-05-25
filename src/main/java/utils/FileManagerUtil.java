package utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FileManagerUtil {

    private FileManagerUtil(){}

    public static String getValue(String fileName, String key) {
        if (fileName == null) {
            throw new IllegalArgumentException();
        }
        try {
            URL resourceUrl = FileManagerUtil.class.getClassLoader().getResource(fileName);
            Path resourcePath = Paths.get(Objects.requireNonNull(resourceUrl).toURI());
            String absolutePath = resourcePath.toAbsolutePath().toString();
            ObjectMapper mapper = new ObjectMapper();
            JsonNode rootNode = mapper.readTree(Files.readAllBytes(Paths.get(absolutePath)));
            JsonNode valueNode = rootNode.get(key);
            return valueNode.asText();
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static List<String> getValueAsList(String fileName, String key) {
        if (fileName == null) {
            throw new IllegalArgumentException("File name cannot be null");
        }
        try {
            URL resourceUrl = FileManagerUtil.class.getClassLoader().getResource(fileName);
            Path resourcePath = Paths.get(Objects.requireNonNull(resourceUrl).toURI());
            String absolutePath = resourcePath.toAbsolutePath().toString();
            ObjectMapper mapper = new ObjectMapper();
            JsonNode rootNode = mapper.readTree(Files.readAllBytes(Paths.get(absolutePath)));
            JsonNode valueNode = rootNode.get(key);
            List<String> values = new ArrayList<>();
            for (JsonNode node : valueNode) {
                values.add(node.asText());
            }
            return values;
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
