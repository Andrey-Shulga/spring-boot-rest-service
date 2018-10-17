package com.bam.icc.controller;

import com.bam.icc.model.Message;
import com.bam.icc.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MessageController {

    private MessageService messageService;

    @Autowired
    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/messages")

    public List<Message> getAll(){
        return messageService.getAllMessage();
    }
}
