package com.example.demo.controller;

import com.example.demo.dto.TodoDTO;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class TodoControllerImpl implements TodoController {

    private final RestTemplate restTemplate;

    public TodoControllerImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public TodoDTO getTitle(String todoId){

        if(!StringUtils.isEmpty(todoId) && todoId.equalsIgnoreCase("100")){
            return new TodoDTO("shopping", "buy ...");
        }
        return new TodoDTO();
    }
}
