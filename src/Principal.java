import br.com.watchbetter.calculator.TotalDurationCalculator;
import br.com.watchbetter.stream.Movie;
import br.com.watchbetter.stream.Serie;
import br.com.watchbetter.stream.Titulos;

public class Principal extends Titulos{
    public static void main(String[] args) throws Exception {
        final Movie interstellar  = new Movie();
        interstellar.setName( "Interstellar");
        interstellar.setAuthor("Christopher Nolan");
        interstellar.setGenre("Science Fiction");
        interstellar.setSynopsis("A team of explorers travels through a wormhole in space in an attempt to ensure humanity\'s survival.");
        interstellar.setReleaseYear(2014);
        interstellar.setDurationInMinutes(169);
        interstellar.setIncludedInPlan(true);
        
        interstellar.rating(3.4);
        interstellar.rating(10.0);
        interstellar.rating(10.0);

        interstellar.showMovieData();


        final Serie breakingBad = new Serie();
        breakingBad.setName("Breaking Bad");
        breakingBad.setAuthor("Vince Gilligan");
        breakingBad.setGenre("Crime, Drama, Thriller");
        breakingBad.setSynopsis("A high school chemistry teacher turned methamphetamine manufacturer partners with a former student to secure his family's future.");
        breakingBad.setReleaseYear(2008);
        breakingBad.setSeasons(5);
        breakingBad.setEpisodesPerSeason(13);
        breakingBad.setMinutesPerEpisode(47);
        breakingBad.setIncludedInPlan(true);
        breakingBad.getDurationInMinutes();
        breakingBad.rating(9.0);
        breakingBad.rating(7.0);
        breakingBad.rating(8.0);
        
        breakingBad.showMovieData();

        
        TotalDurationCalculator totalDuration = new TotalDurationCalculator();
        totalDuration.addDuration(interstellar);
        totalDuration.addDuration(breakingBad);
        totalDuration.showTotalDuration();
        

  

    }
}