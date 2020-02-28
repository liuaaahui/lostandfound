package com.example.controller;

import com.example.entity.Message;
import com.example.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/message")
public class MessageController {

    @Autowired
    private MessageService service;

    @ResponseBody
    @RequestMapping(value = "/addMessage", method = RequestMethod.POST)
    public int addMessage(@RequestBody Message message){
        return service.addMessage(message);
    }

    @RequestMapping(value = "/allMessage", method = RequestMethod.POST)
    public List<Map<String, Object>> allMessage(){
        return service.getAllMessage();
    }
}
