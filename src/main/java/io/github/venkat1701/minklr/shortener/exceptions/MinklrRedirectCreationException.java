package io.github.venkat1701.minklr.shortener.exceptions;

public class MinklrRedirectCreationException extends Throwable{

    private String description;

    public MinklrRedirectCreationException(String description) {
        super(description);
        this.description = description;
    }
}
