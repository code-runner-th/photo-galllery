/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.coderunnerth.photogallery;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jitta
 */
@RestController
public class HelloWorldRestful {

    @GetMapping
    public String getMessage() {
        return "Hello World";
    }
}
