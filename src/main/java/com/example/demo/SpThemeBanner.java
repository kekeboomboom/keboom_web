package com.example.demo;

import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author keboom 2022/1/6
 */
@Data
@AllArgsConstructor
public class SpThemeBanner implements Serializable {

  private static final long serialVersionUID = 5596056220688866396L;


  /**
   * banner 配图
   */
  private List<String> images;

  /**
   * 背景色值
   */
  private String background;

  /**
   * 前景色值
   */
  private String foreground;
}
