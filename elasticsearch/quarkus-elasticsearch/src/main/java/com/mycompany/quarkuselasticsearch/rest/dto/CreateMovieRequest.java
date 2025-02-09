package com.mycompany.quarkuselasticsearch.rest.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class CreateMovieRequest {

    @NotBlank
    private String imdb;

    @NotBlank
    private String title;
}
