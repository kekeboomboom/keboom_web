package com.example.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class DemoController {

  @GetMapping("")
  public String demo2() {
    return "hehe";
  }
/*
  @GetMapping("demo")
  public PersonVO demo(@RequestParam(required = false) String name) throws ParseException {
    PersonVO personVO = new PersonVO();
    personVO.setMyAge(1);
    personVO.setMyName(name);
    String str = "2020-11-11 00:00:00";
//    Date date = new Date();
//    TemporalAccessor parse = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").parse(str);
//    LocalDateTime.from(parse);

    Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(str);
    personVO.setBirthday(date);

    return personVO;
  }

 */

  /*

  @PostMapping("post/")
  public void post(
      @RequestParam String id,
      @RequestParam(required = false) Integer fixed_index,
      @RequestParam(required = false) String picture,
      @RequestParam String ad_ids,
      @RequestParam(required = false) String inventory_ids,
      @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date disable_at,
      @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss") Date enable_at,
      @RequestParam(required = false) Boolean has_video
  ) {
    System.out.println(id);

  }

  // 对于form表单 ，而不是json
  @PostMapping("post2/")
  public void post2(PersonVO personVO) {
    System.out.println(personVO.toString());
  }


  @PostMapping("post3/")
  public String post3(@RequestParam(required = false) String name) {
    if (StringUtils.isEmpty(name)) {
      return "name is null";
    }
    return "my name is " + name;
  }


  @PostMapping("/post4")
  public PersonVO post4(){
    PersonVO personVO = new PersonVO();
    personVO.setMyName("keke");
    personVO.setMyAge(3);
    return personVO;
  }

   */

  @GetMapping("pager")
  public Resp<Pager<PersonVO>> pager() {
    return new Resp<>(1, true, new Pager<PersonVO>(0, Collections.singletonList(new PersonVO("ke", 2, new Date()))));

  }

  @GetMapping("/date")
  public Resp<Blog> date() {
    return Resp.ok(new Blog(1L, new Date()));
  }

  @PostMapping("/postform/")
  public Resp<String> postform(@Valid CategoryCatForm form) {
    System.out.println(form);
    return Resp.ok(form.toString());
  }

  @PutMapping("/sptheme/")
  public Resp<SpTheme> spThemeResp(@RequestBody SpTheme form) {
    System.out.println(form.toString());
    return Resp.ok(form);
  }
}
