package io.github.venkat1701.minklr.shortener.dto;

public class ShortenResponseDTO {
    public ShortenResponseDTO(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    public String getShortUrl() {
        return shortUrl;
    }

    public void setShortUrl(String shortUrl) {
        this.shortUrl = shortUrl;
    }

    private String shortUrl;
}
