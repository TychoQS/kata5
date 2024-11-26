package software.ulpgc.kata5;

import software.ulpgc.kata5.io.JokeLoader;
import software.ulpgc.kata5.io.RandomJokeAdapter;
import software.ulpgc.kata5.io.RandomJokeDeserializer;
import software.ulpgc.kata5.io.RandomJokeReader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        JokeLoader loader = getJokeLoader();
        for (int i = 1; i < 6; i++) {
            System.out.println("###### JOKE "+ i + " #######");
            System.out.println(loader.load().joke());
        }
    }

    private static JokeLoader getJokeLoader() {
        return new JokeLoader(new RandomJokeReader(), new RandomJokeDeserializer(), new RandomJokeAdapter());
    }
}
