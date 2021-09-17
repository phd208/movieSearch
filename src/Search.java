import Model.Movie;
import Model.MovieArray;
import com.google.gson.Gson;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class Search {

    //https://stackoverflow.com/questions/23630681/how-to-parse-json-results-from-unirest-call
    //retrieve the parsed JSONObject from the response
    public static String searchRapidAPI(String searchKey) throws UnsupportedEncodingException, UnirestException {
        String host = "https://movie-database-imdb-alternative.p.rapidapi.com/";
        String apiHost = "movie-database-imdb-alternative.p.rapidapi.com";
        String apiKey = "6b32e3a59dmsh259e3e816f239f6p13ea3djsn285b114e7b04";

        String query;

        if (searchKey.startsWith("tt")) {
            query = String.format("i=%s", URLEncoder.encode(searchKey, "UTF-8"));
        } else {
            query = String.format("s=%s", URLEncoder.encode(searchKey, "UTF-8"));
        }

        HttpResponse<JsonNode> response = Unirest.get(host + "?" + query)
                .header("x-rapidapi-host", apiHost)
                .header("x-rapidapi-key", apiKey)
                .asJson();

        JSONObject myObj = response.getBody().getObject();

        return formatJSON(myObj);
    }

    public static Movie searchForIMDBid(String id) throws UnirestException, UnsupportedEncodingException {
        String string = searchRapidAPI(id);
        Gson gson = new Gson();
        return gson.fromJson(string, Movie.class);
    }

    public static MovieArray searchForTitle(String title) throws UnirestException, UnsupportedEncodingException {
        String string = searchRapidAPI(title);
        Gson gson = new Gson();
        System.out.println(string);
        return gson.fromJson(string, MovieArray.class);
    }


    public static String formatJSON(JSONObject jsonObject) {

        String format = jsonObject.toString();

        format = format
                .replace("Title", "title")
                .replace("Plot", "plot")
                .replace("Director", "director")
                .replace("Year", "year")
                .replace("Genre", "genre")
                .replace("Actors", "actors")
                .replace("Poster", "poster")
                .replace("Type", "type")
                .replace("IMDBid", "imdbId");

//        jsonObject = new JSONObject(jsonObject.toString().replace("Title", "title"));
//        jsonObject = new JSONObject(jsonObject.toString().replace("Plot", "plot"));
//        jsonObject = new JSONObject(jsonObject.toString().replace("Director", "director"));
//        jsonObject = new JSONObject(jsonObject.toString().replace("Year", "year"));
//        jsonObject = new JSONObject(jsonObject.toString().replace("Genre", "genre"));
//        jsonObject = new JSONObject(jsonObject.toString().replace("Actors", "actors"));
//        jsonObject = new JSONObject(jsonObject.toString().replace("Poster", "poster"));
//        jsonObject = new JSONObject(jsonObject.toString().replace("Type", "type"));
//        jsonObject = new JSONObject(jsonObject.toString().replace("IMDBid", "imdbID"));

        //return jsonObject.toString();

        return format;
    }






}
