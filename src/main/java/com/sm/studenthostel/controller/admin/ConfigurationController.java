package com.sm.studenthostel.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/configuration")
public class ConfigurationController {

  @GetMapping
  public String configurationView() {
    return "admin/configuration/configuration";
  }

  @GetMapping("/structure")
  public String structureView() {
    return "admin/configuration/structure/structure";
  }

}
