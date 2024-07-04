/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archive;

/**
 * Class representing a Movie object.
 * This class provides methods to manage and manipulate information about movies, including title, director, genre, rating, main actors, country, episode duration, number of seasons, total duration, and year.
 * 
 * Clase que representa un objeto Película.
 * Esta clase proporciona métodos para gestionar y manipular información sobre películas, incluyendo título, director, género, calificación, actores principales, país, duración del episodio, número de temporadas, duración total y año.
 * 
 * @autor Yendry VR
 */
public class Movies {
   // Movie attributes / Atributos de la película
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

     /**
     * Constructor to initialize all attributes of a movie.
     * Constructor para inicializar todos los atributos de una película.
     * 
     * @param title            the title of the movie / el título de la película
     * @param director         the director of the movie / el director de la película
     * @param genre            the genre of the movie / el género de la película
     * @param rating           the rating of the movie / la calificación de la película
     * @param mainActors       an array of main actors in the movie / un arreglo de actores principales en la película
     * @param country          the country of origin of the movie / el país de origen de la película
     * @param episodeDuration  the duration of each episode in minutes / la duración de cada episodio en minutos
     * @param numberOfSeasons  the number of seasons of the movie / el número de temporadas de la película
     * @param duration         the total duration of the movie in minutes / la duración total de la película en minutos
     * @param year             the year the movie was released / el año en que se estrenó la película
     */
    
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
  // Getter and Setter methods for each attribute / Métodos Getter y Setter para cada atributo
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

     /**
     * Method to print all information about the movie.
     * Método para imprimir toda la información sobre la película.
     */
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
 /**
     * Method to update the rating of the movie.
     * Método para actualizar la calificación de la película.
     * 
     * @param newRating the new rating of the movie / la nueva calificación de la película
     */
    public void rate(String newRating) {
        rating = newRating;
        System.out.println("The rating of " + title + " has been updated to " + newRating);
    }

    /**
     * Method to add a new actor to the main actors list.
     * Método para agregar un nuevo actor a la lista de actores principales.
     * 
     * @param actor the new actor to add / el nuevo actor a agregar
     */
    public void addActor(String actor) {
        String[] newMainActors = new String[mainActors.length + 1];
        System.arraycopy(mainActors, 0, newMainActors, 0, mainActors.length);
        newMainActors[mainActors.length] = actor;
        mainActors = newMainActors;
        System.out.println("Actor " + actor + " has been added to " + title);
    }
 /**
     * Method to remove an actor from the main actors list.
     * Método para eliminar un actor de la lista de actores principales.
     * 
     * @param actor the actor to remove / el actor a eliminar
     */
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
 /**
     * Method to search for a movie by the director's name.
     * Método para buscar una película por el nombre del director.
     * 
     * @param directorName the name of the director to search for / el nombre del director a buscar
     */
    public void searchByDirector(String directorName) {
        if (director.equals(directorName)) {
            System.out.println(title + " was directed by " + director);
        } else {
            System.out.println(title + " was not directed by " + directorName);
        }
    }
/**
     * Overriding the toString() method to return a string representation of the movie.
     * Sobrescribir el método toString() para devolver una representación de la película en forma de cadena.
     * 
     * @return a string representation of the movie / una representación de la película en forma de cadena
     */
    @Override
    public String toString() {
        return title + "," + director + "," + genre + "," + rating + ","
                + String.join(";", mainActors) + "," + country + "," + episodeDuration + ","
                + numberOfSeasons + "," + duration + "," + year;
    }
 /**
     * Static method to create a Movies object from a string.
     * Método estático para crear un objeto Película a partir de una cadena.
     * 
     * @param str the string containing movie information / la cadena que contiene la información de la película
     * @return a Movies object / un objeto Película
     */
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

