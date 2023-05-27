package com.sm.studenthostel.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/announcements")
public class AnnouncementsController {

  @GetMapping
  public String announcementsView() {
    return "admin/announcements/announcements";
  }

}
