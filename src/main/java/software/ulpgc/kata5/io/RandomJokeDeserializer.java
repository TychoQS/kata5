package software.ulpgc.kata5.io;

import com.google.gson.Gson;
import software.ulpgc.kata5.io.pojo.RandomJokeGetResponse;

public class RandomJokeDeserializer implements JokeDeserializer {
    @Override
    public Object deserialize(String read) {
        return new Gson().fromJson(read, RandomJokeGetResponse.class);
    }
}
