package Login;
/**
 * Class representing information about a movie.
 * Clase que representa la información de una película.
 */
public class Movies {

      // Attributes / Atributos
    private int idMovie; // Movie ID / ID de la película
    public String title; // Movie title / Título de la película
    public String timer; // Movie duration / Duración de la película
    public String Description; // Movie description / Descripción de la película
    public String Gender; // Movie genre / Género de la película
    public String AgeRestriction; // Age restriction for the movie / Restricción de edad para la película

    /**
     * Constructor to initialize movie information.
     * Constructor para inicializar la información de la película.
     *
     * @param idMovie       ID of the movie / ID de la película
     * @param title         Title of the movie / Título de la película
     * @param Gender        Genre of the movie / Género de la película
     * @param timer         Duration of the movie / Duración de la película
     * @param AgeRestriction Age restriction for the movie / Restricción de edad para la película
     * @param Description   Description of the movie / Descripción de la película
     */
    public Movies(int idMovie, String title, String Gender, String timer, String AgeRestriction, String Description) {

        this.idMovie = idMovie;
        this.timer = timer;
        this.Description = Description;
        this.title = title;
        this.Gender = Gender;
        this.AgeRestriction = AgeRestriction;

    }//end constructor
 // Getter and Setter methods / Métodos Getter y Setter
    public int getIdMovie() {
        return idMovie;
    }

    public void setIdMovie(int idMovie) {
        this.idMovie = idMovie;
    }

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescripcion(String Description) {
        this.Description = Description;
    }

    public String getTitle() {
        return title;
    }

    public void setTitulo(String title) {
        this.title = title;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public String getAgeRestriction() {
        return AgeRestriction;
    }

    public void setAgeRestriction(String AgeRestriction) {
        this.AgeRestriction = AgeRestriction;
    }
/**
     * String representation of the movie object.
     * Representación en cadena del objeto película.
     *
     * @return A string representation of the movie object / Una representación en cadena del objeto película
     */
    @Override
    public String toString() {
        return idMovie + "," + title + "," + Gender + "," + timer + "," + AgeRestriction + "," + Description;

    }

}
