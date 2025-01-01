package io.github.venkat1701.minklr.shortener.services.impl;

import io.github.venkat1701.minklr.shortener.dto.ShortenRequestDTO;
import io.github.venkat1701.minklr.shortener.dto.ShortenResponseDTO;
import io.github.venkat1701.minklr.shortener.entities.MinklrRedirect;
import io.github.venkat1701.minklr.shortener.repositories.MinklrRedirectRepository;
import io.github.venkat1701.minklr.shortener.services.ShortenerService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ShortenerServiceImpl implements ShortenerService {

    private final MinklrRedirectRepository redirectRepository;

    public ShortenerServiceImpl(MinklrRedirectRepository redirectRepository) {
        this.redirectRepository = redirectRepository;
    }

    @Override
    public boolean linkExistsByAlias(String alias) {
        return this.redirectRepository.existsByAlias(alias);
    }

    @Override
    public Optional<ShortenResponseDTO> generateShortenedLink(ShortenRequestDTO shortenRequestDTO) {
        if(linkExistsByAlias(shortenRequestDTO.getAlias())) {
            return Optional.empty();
        }

        MinklrRedirect redirect = new MinklrRedirect();
        redirect.setLongUrl(shortenRequestDTO.getLongUrl());
        redirect.setAlias(shortenRequestDTO.getAlias());
        var generatedRedirect = this.redirectRepository.save(redirect);

        ShortenResponseDTO responseDTO = new ShortenResponseDTO(generatedRedirect.getAlias());
        return Optional.of(responseDTO);
    }


    @Override
    public String redirectLink(String alias) {
        if(!this.redirectRepository.existsByAlias(alias)) {
            return "404";
        } else {
            Optional<MinklrRedirect> redirectOptional = this.redirectRepository.findByAlias(alias);
            if(redirectOptional.isPresent()) {
                MinklrRedirect redirect = redirectOptional.get();
                return redirect.getLongUrl();
            } else {
                return "404";
            }
        }
    }


}
