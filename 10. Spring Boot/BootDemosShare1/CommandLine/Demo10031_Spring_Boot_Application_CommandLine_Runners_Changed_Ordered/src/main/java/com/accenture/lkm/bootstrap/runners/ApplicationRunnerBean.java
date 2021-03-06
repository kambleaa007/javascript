package com.accenture.lkm.bootstrap.runners;
import java.util.Arrays;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Component
@Order(2)
public class ApplicationRunnerBean implements ApplicationRunner {
	private static final Logger logger = LoggerFactory.getLogger(ApplicationRunnerBean.class);	
	@Override
	public void run(ApplicationArguments arg0) throws Exception {
    	    String strArgs = Arrays.stream(arg0.getSourceArgs()).collect(Collectors.joining("|"));
    	    logger.info("********************Application Runner 1**************************");
    	    logger.info("Application started with arguments:" + strArgs);
    	    logger.info("**********************************************");
	}
} 

/*
 * The difference between CommandLineRunner and ApplicationRunner is that the 
 * run() method of CommandLineRunner accepts array of String as an argument 
 * and run() method of ApplicationRunner accepts spring ApplicationArguments as an argument.
 * */
 