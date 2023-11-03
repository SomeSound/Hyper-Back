package com.example.SiteProject.SiteProject.services;

import com.example.SiteProject.SiteProject.dtos.ArtistDTO;
import com.example.SiteProject.SiteProject.dtos.responses.ArtistResponseDTO;
import com.example.SiteProject.SiteProject.entities.ArtistEntity;
import com.example.SiteProject.SiteProject.repositories.ArtistRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ArtistServiceImpl implements ArtistService {

    private final ArtistRepository artistRepository;

    @Autowired
    private final ModelMapper modelMapper;

    @Override
    public ArtistResponseDTO save(ArtistDTO artist) {
        try {
            ArtistEntity artistEntity = modelMapper.map(artist, ArtistEntity.class);

            artistEntity = artistRepository.save(artistEntity);

            return modelMapper.map(artistEntity, ArtistResponseDTO.class);
        } catch (Exception e) {
            //Throw new Exception
        }
        return null;
    }

    @Override
    public void delete(long id) {

    }
}

