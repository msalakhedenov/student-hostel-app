package com.sm.studenthostel.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("admin/students")
public class StudentsController {

  @GetMapping
  public String studentsView() {
    return "admin/students/students";
  }

  @GetMapping("/table")
  public String studentsTableView() {
    return "admin/students/students-table";
  }

}
