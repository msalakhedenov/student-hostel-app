package com.sm.studenthostel.controller.auth;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/auth")
public class AuthController {

  @GetMapping("/login")
  public String loginView() {
    return "auth/login";
  }

  @GetMapping("/reset/request")
  public String resetPasswordRequestView() {
    return "auth/reset-password-request";
  }

  @GetMapping("/reset")
  public String resetPasswordView() {
    return "auth/reset-password";
  }

}
