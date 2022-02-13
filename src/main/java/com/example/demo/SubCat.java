package com.example.demo;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author keboom
 * @date 2021/12/17
 */
@Data
public class SubCat implements Serializable {

  private static final long serialVersionUID = -7446677133459039758L;
  private String group;

  private String datasourceName;

  private String name;

  private String src;
}
