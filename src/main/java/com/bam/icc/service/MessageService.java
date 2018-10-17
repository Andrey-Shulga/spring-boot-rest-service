package com.bam.icc.service;

import com.bam.icc.model.Message;
import com.bam.icc.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    private MessageRepository messageRepository;

    @Autowired
    public MessageService(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    public List<Message> getAllMessage(){
        return messageRepository.findAll();
    }
}
