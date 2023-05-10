package com.practice.encoding;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;
import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

/**
 * @author vikash.yadav@piramal.com
 */
@Component
public class JsonToBase64 {

  @SneakyThrows
  public void jsonToBase64(final String filePath, final String outputPath) {
    byte[] fileContent = Files.readAllBytes(Paths.get(filePath));
    String base64Encoded = Base64.getEncoder().encodeToString(fileContent);
    Files.write(Paths.get(outputPath), base64Encoded.getBytes());
  }
}
