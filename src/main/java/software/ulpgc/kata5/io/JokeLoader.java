package software.ulpgc.kata5.io;

import software.ulpgc.kata5.model.Joke;

import java.io.IOException;

public class JokeLoader {
    private final JokeReader reader;
    private final JokeDeserializer deserializer;
    private final JokeAdapter adapter;

    public JokeLoader(JokeReader reader, JokeDeserializer deserializer, JokeAdapter adapter) {
        this.reader = reader;
        this.deserializer = deserializer;
        this.adapter = adapter;
    }

    public Joke load() throws IOException {
        return adapter.adapt(deserializer.deserialize(reader.read()));
    }
}
