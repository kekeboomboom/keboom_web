package com.example.demo;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

@Component
public class ConponetTest implements InitializingBean {

  @Override
  public void afterPropertiesSet() throws Exception {
    System.out.println("hah ");
  }
}
