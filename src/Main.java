import Model.MovieArray;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.io.UnsupportedEncodingException;

public class Main {

    public static void main(String[] args) throws UnsupportedEncodingException, UnirestException {

//        Movie movie = Search.searchForIMDBid("tt1206885");
//
//        System.out.println(movie.displaySummary());
//
//        System.out.println(movie.getPoster());

        MovieArray movieList = Search.searchForTitle("Wolverine");

        for (int i = 1; i <= movieList.getSearch().length; i++) {

            System.out.println(i + ". " + movieList.getSearch()[i - 1].displayResult());

        }
    }

}






