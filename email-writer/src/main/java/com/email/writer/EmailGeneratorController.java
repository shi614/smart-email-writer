package com.email.writer;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor


public class EmailGeneratorController {

    private final EmailGeneratorService emailGeneratorService;

    @PostMapping("/generate")
    public Mono<String> generateEmail(
            @RequestBody EmailRequest emailRequest) {

        return emailGeneratorService.generateEmailReply(emailRequest);
    }
}
