package Login;

public class Movies {

    //declarate variables
    private int idMovie;
    public String title;
    public String timer;
    public String Description;
    public String Gender;
    public String AgeRestriction;

    public Movies(int idMovie, String title, String Gender, String timer, String AgeRestriction, String Description) {

        this.idMovie = idMovie;
        this.timer = timer;
        this.Description = Description;
        this.title = title;
        this.Gender = Gender;
        this.AgeRestriction = AgeRestriction;

    }//end constructor

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

    @Override
    public String toString() {
        return idMovie + "," + title + "," + Gender + "," + timer + "," + AgeRestriction + "," + Description;

    }

}
