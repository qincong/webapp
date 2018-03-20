package org.qincong;


import org.apache.log4j.Logger;

import java.net.URLClassLoader;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("hi");
//        Logger logger=Logger.getLogger(MainApp.class);
//        logger.error("this is a error");
//        logger.info("this is a info");
//        logger.debug("this is a debug");
            URLClassLoader classLoader = (URLClassLoader)MainApp.class.getClassLoader();
            System.out.println(Arrays.toString(classLoader.getURLs()));
    }
}
