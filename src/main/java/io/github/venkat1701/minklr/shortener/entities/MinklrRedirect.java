package io.github.venkat1701.minklr.shortener.entities;

import jakarta.persistence.*;

@Table(name="redirects")
@Entity
public class MinklrRedirect{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long shortenedId;

    @Column(name="long_url")
    private String longUrl;

    @Column(name="alias")
    private String alias;

    public MinklrRedirect(Long shortenedId, String longUrl, String alias) {
        this.shortenedId = shortenedId;
        this.longUrl = longUrl;
        this.alias = alias;
    }

    public MinklrRedirect() {}

    public Long getShortenedId() {
        return shortenedId;
    }

    public void setShortenedId(Long shortenedId) {
        this.shortenedId = shortenedId;
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
