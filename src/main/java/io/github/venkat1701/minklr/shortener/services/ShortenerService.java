package io.github.venkat1701.minklr.shortener.services;


import io.github.venkat1701.minklr.shortener.dto.ShortenRequestDTO;
import io.github.venkat1701.minklr.shortener.dto.ShortenResponseDTO;

import java.util.Optional;

public interface ShortenerService {

    boolean linkExistsByAlias(String alias);

    Optional<ShortenResponseDTO> generateShortenedLink(ShortenRequestDTO shortenRequestDTO);

    String redirectLink(String alias);

}
