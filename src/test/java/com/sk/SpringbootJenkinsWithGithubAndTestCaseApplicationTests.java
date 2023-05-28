package com.sk;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootJenkinsWithGithubAndTestCaseApplicationTests {
	public static Logger logger = LoggerFactory.getLogger(SpringbootJenkinsWithGithubAndTestCaseApplicationTests.class);

	@Test
	public contextLoads() {
		logger.info(" Test case executing here");
		logger.info(" Test case executing here");

		assertEquals(true, true);
	}

}
