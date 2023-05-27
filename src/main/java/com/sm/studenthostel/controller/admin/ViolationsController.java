package com.sm.studenthostel.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/violations")
public class ViolationsController {

  @GetMapping
  public String violationsView() {
    return "admin/violations/violations";
  }

}
