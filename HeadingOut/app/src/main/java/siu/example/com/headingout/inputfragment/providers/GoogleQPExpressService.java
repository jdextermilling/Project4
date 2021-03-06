package siu.example.com.headingout.inputfragment.providers;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Query;
import siu.example.com.headingout.model.flights.Flights;
import siu.example.com.headingout.model.flights.postrequest.RequestJson;

/**
 * Created by samsiu on 5/7/16.
 */
public interface GoogleQPExpressService {

    @POST("search?")
    Call<Flights> getFlights(@Query("key")String key,
                             @Body RequestJson requestJson
    );

}
