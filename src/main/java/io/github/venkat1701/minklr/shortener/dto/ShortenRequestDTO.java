package io.github.venkat1701.minklr.shortener.dto;

public class ShortenRequestDTO {

    private String longUrl;
    private String alias;

    public ShortenRequestDTO(String longUrl, String alias) {
        this.longUrl = longUrl;
        this.alias = alias;
    }

    public String getLongUrl() {
        return longUrl;
    }

    public void setLongUrl(String longUrl) {
        this.longUrl = longUrl;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
