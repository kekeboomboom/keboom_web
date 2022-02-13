package com.example.demo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@AllArgsConstructor
public class PersonVO implements Serializable{

  private static final long serialVersionUID = -5949950365881626316L;

  @JsonProperty(value = "myName")
  private String myName;

  private Integer myAge;

  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date birthday;
}
