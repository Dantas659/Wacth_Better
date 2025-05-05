package br.com.watchbetter.stream;

public class Titulos {
    private String name;
    private String author;
    private String genre;
    private String synopsis;
    private int releaseYear;
    private int totalRatings;
    private int durationInMinutes;
    private double rating;
    private boolean includedInPlan;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    public String getGenre() {
        return genre;

    }
    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    public String getSynopsis() {
        return synopsis;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
  
    public void setIncludedInPlan(boolean includedInPlan) {
        this.includedInPlan = includedInPlan;
    }
    public boolean getIncludedInPlan() {
        return includedInPlan;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public void showMovieData() {
        System.out.println("Name: " + name + "\nRelease year: " + releaseYear + "\nAuthor: " + author + "\nGenre: " + genre + "\nSynopsis: " + synopsis + "\nRating: " + averageRating() + "\nDuration: " + durationInMinutes + "\nIncluded in plan: " + includedInPlan);
        
    }

   public void rating(double userReating) {
        rating += userReating;
        totalRatings++;
    }
    
   public double averageRating() {
        return rating / totalRatings;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;

    }



}

