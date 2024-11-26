package software.ulpgc.kata5.io.pojo;

public record RandomJokeGetResponse(boolean error, String category, String type, String joke, Flags flags, int id, boolean safe, String lang) {
    public record Flags(
            boolean nsfw,
            boolean religious,
            boolean political,
            boolean racist,
            boolean sexist,
            boolean explicit
    ){}
}
