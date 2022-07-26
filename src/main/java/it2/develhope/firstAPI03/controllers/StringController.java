package it2.develhope.firstAPI03.controllers;

import it2.develhope.firstAPI03.DTO.StringsDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import javax.validation.Valid;

@RestController
public class StringController {

    @GetMapping(value = "/strings")
    public String strings(@Valid @RequestBody StringsDTO stringsDTO){
        //return stringsDTO.toString();
        return stringsDTO.getStringMandatory() + " " + stringsDTO.getStringOptional();
    }
}
