package com.example.demo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

/**
 *
 * @author keboom
 * @date 2021/12/17
 */
@Data
public class CategoryCatForm implements Serializable {

  private static final long serialVersionUID = 5339072732896314267L;
  @NotNull
  private String id;

  private List<String> subcats;

  @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date today;

}
