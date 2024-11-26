package software.ulpgc.kata5.io;

import org.jsoup.Connection;
import org.jsoup.Jsoup;

import java.io.IOException;

public class RandomJokeReader implements JokeReader {
    @Override
    public String read() throws IOException {
        return read(JokeApi.GET_RANDOM_JOKE);
    }

    private String read(String url) throws IOException {
        Connection.Response response = Jsoup.connect(url)
                .ignoreContentType(true)
                .header("accept", "text/*")
                .method(Connection.Method.GET)
                .execute();
        if (response.statusCode() != 200) throw new RuntimeException();
        return response.body();
    }
}
