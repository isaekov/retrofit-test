import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

import java.util.List;

public interface ApiService {
    @FormUrlEncoded
    @POST("company/50879/contracts")
    Call<List<Example>> example(@Field("login") String title,
                                @Field("password") String body);
}
