package ch.heg.tb;


import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.Collection;
import okhttp3.OkHttpClient;
import okhttp3.OkHttpClient.Builder;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        OkHttpClient.Builder httpClient = new Builder();

        Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("http://transport.opendata.ch/v1/")
            .addConverterFactory(GsonConverterFactory.create())
            .client(httpClient.build())
            .build();

        IService service = retrofit.create(IService.class);

        // Calling '/api/users/2'
        Call<ApiResponse> callSyncTrain = service.getData("Biel/Bienne", "Reuchenette-Péry", 1, "train");
        Call<ApiResponse> callSyncBus = service.getData("Biel/Bienne", "Reuchenette-Péry", 1, "bus");

        try {
            //train
            Response<ApiResponse> responseTrain = callSyncTrain.execute();
            ApiResponse apiResponseTrain = responseTrain.body();
            System.out.println("Train : " + apiResponseTrain);
            //Bus
            Response<ApiResponse> responseBus = callSyncBus.execute();
            ApiResponse apiResponseBus = responseBus.body();
            System.out.println("Bus : " + apiResponseBus);
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
