import okhttp3.*;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.GsonConverterFactory;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService service = retrofit.create(ApiService.class);

        final Call<List<Example>> example = service.example("123", "123");

        example.enqueue(new Callback<List<Example>>() {
            public void onResponse(Call<List<Example>> call, Response<List<Example>> response) {
                List<Example> s =  response.body();
int i = 0;
//                for (Example d : s) {
//                    i++;
                    System.out.println(s.get(0).getStatuses().get(0).getSumm());

//                }

            }

            public void onFailure(Call<List<Example>> call, Throwable throwable) {

            }
        });



//        String serverAnswer = null;
//        OkHttpClient client = new OkHttpClient();
//        RequestBody body = new FormBody.Builder().add("login", "deltatest")
//                .add("password", "827ccb0eea8a706c4c34a16891f84e7b")
//                .build();
//        Request request = new Request.Builder()
//                .url("https://service.deltasecurity.ru/api/company/50879/contracts")
//                .post(body).build();


//        System.out.println(serverAnswer);





    }
}
