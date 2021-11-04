package ch.heg.tb;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface IService {

  //connections
  @GET("connections")
  public Call<ApiResponse> getData(@Query("from") String from, @Query("to") String to, @Query("limit") int limit, @Query("transportations[]") String transport);


  //locations
  /*
  @GET("locations")
  public Call<ApiResponse> getData(@Query("query") String from, @Query("type") String type);
   */
}
