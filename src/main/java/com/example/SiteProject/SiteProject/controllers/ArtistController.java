package com.example.SiteProject.SiteProject.controllers;

import com.example.SiteProject.SiteProject.dtos.ArtistDTO;
import com.example.SiteProject.SiteProject.dtos.MusicDTO;
import com.example.SiteProject.SiteProject.dtos.responses.ArtistResponseDTO;
import com.example.SiteProject.SiteProject.dtos.responses.MusicResponseDTO;
import com.example.SiteProject.SiteProject.services.ArtistService;
import com.example.SiteProject.SiteProject.services.MusicService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@Slf4j
@RequiredArgsConstructor
public class ArtistController {

<<<<<<< HEAD
    @PostMapping("/artist")
    public ResponseEntity<ArtistDTO> crateArtist(@RequestBody ArtistDTO artist) {

        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
=======
    @Autowired
    private final ArtistService artistService;

    @PostMapping(value = "/artist")
    public ResponseEntity<ArtistResponseDTO> save(
            @RequestBody @Valid ArtistDTO artist) {

        System.out.println("CONTROLLER - OK");
        System.out.println(artist);

        ArtistResponseDTO response = artistService.save(artist);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}





>>>>>>> master
