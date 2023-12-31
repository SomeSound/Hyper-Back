package com.example.hyper.dtos.requests;

import com.example.hyper.dtos.requests.TrackRequestDTO;
import lombok.Data;

import javax.validation.constraints.NotEmpty;
import java.util.List;

@Data
public class PlaylistRequestDTO {

    @NotEmpty(message = "Invalid name, can not be empty")
    private String name;

//    private List<TrackRequestDTO> tracks;
}
