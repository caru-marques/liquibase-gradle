package br.com.carucorp.testgradle.TestGradle.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.carucorp.testgradle.TestGradle.ModelViews.Home;

@RestController
public class HomeController {
  @GetMapping("/")
  public Home index(){
    return new Home();
  }
}