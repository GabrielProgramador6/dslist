package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import org.springframework.beans.BeanUtils;
import org.springframework.context.annotation.Bean;

public class GameDTO {

    private Long id;
    private String title;
    private Double score;
    private Integer year;
    private String genre;
    private String platforms;
    private String imgUrl;
    private String shortDescription;
    private String longDescription;

    public GameDTO() {}

    public GameDTO(Long id, String title, Double score, Integer year, String genre, String platforms, String imgUrl, String shortDescription, String longDescription) {
        this.id = id;
        this.title = title;
        this.score = score;
        this.year = year;
        this.genre = genre;
        this.platforms = platforms;
        this.imgUrl = imgUrl;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
    }

    public GameDTO(Game entity) {
        BeanUtils.copyProperties(entity, this);
//        this.id = entity.getId();
//        this.title = entity.getTitle();
//        this.score = entity.getScore();
//        this.year = entity.getYear();
//        this.genre = entity.getGenre();
//        this.platforms = entity.getPlatforms();
//        this.imgUrl = entity.getImgUrl();
//        this.shortDescription = entity.getShortDescription();
//        this.longDescription = entity.getLongDescription();
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Double getScore() {
        return score;
    }

    public Integer getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public String getPlatforms() {
        return platforms;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getLongDescription() {
        return longDescription;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

}