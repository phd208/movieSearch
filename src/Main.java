import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;

import java.net.URLEncoder;



public class Main {


    public static void main(String[] args) throws Exception {


        String host = "https://movie-database-imdb-alternative.p.rapidapi.com/";
        String charset = "UTF-8";
        // Headers for a request
        String x_rapidapi_host = "movie-database-imdb-alternative.p.rapidapi.com";
        String x_rapidapi_key = "6b32e3a59dmsh259e3e816f239f6p13ea3djsn285b114e7b04";
        // Params
        String s = "Pulp";
        // Format query for preventing encoding problems
        String query = String.format("s=%s", URLEncoder.encode(s, charset));
//        HttpResponse <JsonNode> response = Unirest.get(host + "?" + query)
//                .header("x-rapidapi-host", x_rapidapi_host)
//                .header("x-rapidapi-key", x_rapidapi_key)
//                .asJson();
//        System.out.println(response.getStatus());
//        System.out.println(response.getHeaders().get("Content-Type"));


        // Host, charset and headers vars should be the same
        String i = "tt0110912";
        // Format query for preventing encoding problems
        query = String.format("i=%s", URLEncoder.encode(i, charset));
        // Json response
        HttpResponse <JsonNode> response = Unirest.get(host + "?" + query)
                .header("x-rapidapi-host", x_rapidapi_host)
                .header("x-rapidapi-key", x_rapidapi_key)
                .asJson();
        //Prettifying
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        JsonParser jp = new JsonParser();
        JsonElement je = jp.parse(response.getBody().toString());
        String prettyJsonString = gson.toJson(je);
        System.out.println(prettyJsonString);


//        HttpResponse<String> response = Unirest.get("https://movie-database-imdb-alternative.p.rapidapi.com/?page=1&r=json&s=raw")
//                .header("x-rapidapi-host", "movie-database-imdb-alternative.p.rapidapi.com")
//                .header("x-rapidapi-key", "6b32e3a59dmsh259e3e816f239f6p13ea3djsn285b114e7b04")
//                .asString();
//
//
//        HttpResponse<String> response2 = Unirest.get("https://movie-database-imdb-alternative.p.rapidapi.com/?page=1&r=json&s=inception")
//                .header("x-rapidapi-host", "movie-database-imdb-alternative.p.rapidapi.com")
//                .header("x-rapidapi-key", "6b32e3a59dmsh259e3e816f239f6p13ea3djsn285b114e7b04")
//                .asString();

//        HttpResponse response = Unirest.post(API_URL)
//                .header("X-RapidAPI-Key", API_KEY)
//                .queryString("parameter", "value")
//                .field("parameter", "value")
//                .asJson();


    }

 }
