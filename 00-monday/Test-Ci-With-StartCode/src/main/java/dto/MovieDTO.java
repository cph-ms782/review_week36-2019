package dto;

import entities.Movie;

/**
 *
 * @author martin
 */
public class MovieDTO {
    
    Long id;
    String title;
    int year;

    public MovieDTO(Movie m) {
        this.id = m.getId();
        this.title = m.getTitle();
        this.year = m.getYear();
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
    
}
