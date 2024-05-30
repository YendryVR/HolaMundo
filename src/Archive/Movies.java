/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archive;

/**
 *
 * @author Yendry VR
 */
public class Movies {
     private String title;
    private String director;
    private String genre;
    private String rating;
    private String[] mainActors;
    private String country;
    private int episodeDuration;
    private int numberOfSeasons;
    private int duration;
    private int year;

    public Movies(String title, String director, String genre, String rating, String[] mainActors,
            String country, int episodeDuration, int numberOfSeasons, int duration, int year) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.rating = rating;
        this.mainActors = mainActors;
        this.country = country;
        this.episodeDuration = episodeDuration;
        this.numberOfSeasons = numberOfSeasons;
        this.duration = duration;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String[] getMainActors() {
        return mainActors;
    }

    public void setMainActors(String[] mainActors) {
        this.mainActors = mainActors;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getEpisodeDuration() {
        return episodeDuration;
    }

    public void setEpisodeDuration(int episodeDuration) {
        this.episodeDuration = episodeDuration;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }

    public void setNumberOfSeasons(int numberOfSeasons) {
        this.numberOfSeasons = numberOfSeasons;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void getInfo() {
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Genre: " + genre);
        System.out.println("Rating: " + rating);
        System.out.println("Main Actors:");
        for (String actor : mainActors) {
            System.out.println("- " + actor);
        }
        System.out.println("Country: " + country);
        System.out.println("Episode Duration: " + episodeDuration + " minutes");
        System.out.println("Number of Seasons: " + numberOfSeasons);
        System.out.println("Total Duration: " + duration + " minutes");
        System.out.println("Year: " + year);
    }

    public void rate(String newRating) {
        rating = newRating;
        System.out.println("The rating of " + title + " has been updated to " + newRating);
    }

   
    public void addActor(String actor) {
        String[] newMainActors = new String[mainActors.length + 1];
        System.arraycopy(mainActors, 0, newMainActors, 0, mainActors.length);
        newMainActors[mainActors.length] = actor;
        mainActors = newMainActors;
        System.out.println("Actor " + actor + " has been added to " + title);
    }

    public void removeActor(String actor) {
        int indexToRemove = -1;
        for (int i = 0; i < mainActors.length; i++) {
            if (mainActors[i].equals(actor)) {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            String[] newMainActors = new String[mainActors.length - 1];
            for (int i = 0, j = 0; i < mainActors.length; i++) {
                if (i != indexToRemove) {
                    newMainActors[j++] = mainActors[i];
                }
            }
            mainActors = newMainActors;
            System.out.println("Actor " + actor + " has been removed from " + title);
        }
    }

    public void searchByDirector(String directorName) {
        if (director.equals(directorName)) {
            System.out.println(title + " was directed by " + director);
        } else {
            System.out.println(title + " was not directed by " + directorName);
        }
    }

    @Override
    public String toString() {
        return title + "," + director + "," + genre + "," + rating + ","
                + String.join(";", mainActors) + "," + country + "," + episodeDuration + ","
                + numberOfSeasons + "," + duration + "," + year;
    }

    public static Movies fromString(String str) {
        String[] data = str.split(",");
        String[] actors = data[4].split(";");
        return new Movies(
                data[0], data[1], data[2], data[3], actors, data[5],
                Integer.parseInt(data[6]), Integer.parseInt(data[7]),
                Integer.parseInt(data[8]), Integer.parseInt(data[9])
        );
    }
}

