package io.github.venkat1701.minklr.shortener.dto;

import java.util.List;

public class BulkShortenResponseDTO {

    private List<ShortenResponseDTO> shortenResponses;

    public BulkShortenResponseDTO(List<ShortenResponseDTO> shortenResponses) {
        this.shortenResponses = shortenResponses;
    }

    public List<ShortenResponseDTO> getShortenResponses() {
        return shortenResponses;
    }

    public void setShortenResponses(List<ShortenResponseDTO> shortenResponses) {
        this.shortenResponses = shortenResponses;
    }
}
