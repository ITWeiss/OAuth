package com.example.oauth.restController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Контроллер для проверки работы
 *
 * @author ITWeiss
 */
@RestController
@RequestMapping()
public class AuthController {

  @RequestMapping("/hello")
  public String hello() {
    return "hello from backend";
  }
}
