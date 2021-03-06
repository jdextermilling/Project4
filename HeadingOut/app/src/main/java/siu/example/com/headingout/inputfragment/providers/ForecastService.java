package siu.example.com.headingout.inputfragment.providers;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import siu.example.com.headingout.model.forecast.Weather;

/**
 * Created by samsiu on 5/6/16.
 */
public interface ForecastService {

    @GET("{api_key}/{latlng}")
    Call<Weather> getWeather(@Path("api_key") String key,
                       @Path("latlng") String term
    );


}
