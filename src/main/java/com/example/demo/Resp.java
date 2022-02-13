package com.example.demo;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author keboom
 * @date 2021/12/16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resp<T> implements Serializable {

  private static final long serialVersionUID = 4701050013127843427L;

  private int status;

  private boolean sucess;

  private T data;

  public static <T> Resp<T> ok(T data) {
    return new Resp<T>(1, true, data);
  }
}
