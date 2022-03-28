package dev.bong.publisher.service;

import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PublisherController {
    private static final Logger logger = LoggerFactory.getLogger(PublisherController.class);

    private final PublisherService publisherService;

    @GetMapping("/")
    public void sendMessage() {
        publisherService.publishMessage();
    }
}
