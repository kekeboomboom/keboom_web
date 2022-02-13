package com.example.demo;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author keboom
 * @date 2021/12/16
 */
@Data
@AllArgsConstructor
public class Blog implements Serializable {

  private Long id;

  @JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss",timezone = "GMT+8")
  private Date date;
}
