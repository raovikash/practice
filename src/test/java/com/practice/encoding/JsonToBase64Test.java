package com.practice.encoding;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author vikash.yadav@piramal.com
 */
@SpringBootTest
public class JsonToBase64Test {
  @Autowired
  private JsonToBase64 jsonToBase64;

  @Test
  void test_jsonToBase64() {
    String inputPath = "/Users/vikash.yadav/Documents/message-center/testapp.json";
    String outputPath = "/Users/vikash.yadav/Documents/message-center/testapp.txt";
    jsonToBase64.jsonToBase64(inputPath, outputPath);
  }
}

