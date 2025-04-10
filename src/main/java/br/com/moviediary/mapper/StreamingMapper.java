package br.com.moviediary.mapper;


import br.com.moviediary.controller.request.StreamingRequest;
import br.com.moviediary.controller.response.StreamingResponse;
import br.com.moviediary.entity.Streaming;
import lombok.experimental.UtilityClass;

@UtilityClass
public class StreamingMapper {
    public static Streaming toStreaming(StreamingRequest request) {
        return Streaming
                .builder()
                .name(request.name())
                .build();
    }

    public static StreamingResponse toStreamingResponse(Streaming streaming) {
        return StreamingResponse
                .builder()
                .id(streaming.getId())
                .name(streaming.getName())
                .build();

    }
}
