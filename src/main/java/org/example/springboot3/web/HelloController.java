package org.example.springboot3.web;

import org.example.springboot3.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * packageName    : org.example.springboot3.web
 * fileName       : HelloController
 * author         : Yeong-Huns
 * date           : 2024-06-09
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2024-06-09        Yeong-Huns       최초 생성
 */
@RestController  //JSON 반환 컨트롤러 (ResponseBody + Controller)
public class HelloController {
    @GetMapping("/hello")   //@RequestMapping(method=RequestMethod.GET)
    public String hello(){
        return "hello";
    }

    @GetMapping("/hello/dto")
    public HelloResponseDto helloResponseDto(@RequestParam String name, @RequestParam int amount){
        return new HelloResponseDto(name, amount);
    }

}
