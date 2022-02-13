package com.example.demo;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author keboom 2022/1/7
 */
@Data
public class SpTheme implements Serializable {

  private static final long serialVersionUID = -5889761101458247622L;

  private String name;

  private SpThemeBanner banner;
}
