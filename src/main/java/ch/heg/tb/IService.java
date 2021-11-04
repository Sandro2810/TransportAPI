package ch.heg.tb;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

//traitement de la requette
public interface IService {

  //connections
  @GET("connections")
  //définition des paramètres de la requette
  public Call<ApiResponse> getData(@Query("from") String from, @Query("to") String to, @Query("limit") int limit, @Query("transportations[]") String transport);


}
