package com.example;

/**
 * Created by Fabricio on 08/09/2015.
 */
public class Author {

    private String citation;
    private String name;

    public Author(String citation, String name) {
        this.citation = citation;
        this.name = name;
    }

    public String getCitation() {
        return citation;
    }

    public void setCitation(String citation) {
        this.citation = citation;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
