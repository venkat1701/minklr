package io.github.venkat1701.minklr.shortener.dto;

import java.util.List;

public class BulkShortenRequestDTO {

    private List<ShortenRequestDTO> shortenRequests;

    public BulkShortenRequestDTO(List<ShortenRequestDTO> shortenRequests) {
        this.shortenRequests = shortenRequests;
    }

    public List<ShortenRequestDTO> getShortenRequests() {
        return shortenRequests;
    }

    public void setShortenRequests(List<ShortenRequestDTO> shortenRequests) {
        this.shortenRequests = shortenRequests;
    }
}
