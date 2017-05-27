package com.chapter02.autoconfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jotaiwan on 27/05/2017.
 */
@Configuration
@ComponentScan(basePackages="com.chapter02.autoconfig")
@ComponentScan(basePackages={"com.chapter02.autoconfig"})       // can add multi packages
@ComponentScan(basePackageClasses={CDPlayer.class})         // can add multi classes
public class CDPlayerConfig {
}
