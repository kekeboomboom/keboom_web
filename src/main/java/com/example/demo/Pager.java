package com.example.demo;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author keboom
 * @date 2021/12/16
 */
@Data
@AllArgsConstructor
public class Pager<T> {

  private int start;
  private List<T> objects;
}
