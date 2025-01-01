package io.github.venkat1701.minklr.shortener.controllers;


import io.github.venkat1701.minklr.shortener.dto.ShortenRequestDTO;
import io.github.venkat1701.minklr.shortener.dto.ShortenResponseDTO;
import io.github.venkat1701.minklr.shortener.exceptions.MinklrRedirectCreationException;
import io.github.venkat1701.minklr.shortener.services.ShortenerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mink")
public class MinklrController {

    private final ShortenerService shortenerService;

    public MinklrController(ShortenerService shortenerService) {
        this.shortenerService = shortenerService;
    }

    @PostMapping("/shorten")
    public ResponseEntity<ShortenResponseDTO> generateShortUrl(@RequestBody ShortenRequestDTO requestDTO) throws MinklrRedirectCreationException {
        return ResponseEntity.ok().body(this.shortenerService.generateShortenedLink(requestDTO).orElseThrow(() -> new MinklrRedirectCreationException("Failed to create a Redirect")));
    }

}
