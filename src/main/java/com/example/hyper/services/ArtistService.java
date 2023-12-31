package com.example.hyper.services;

import com.example.hyper.dtos.ArtistDTO;
import com.example.hyper.dtos.responses.ArtistPageResponseDTO;
import com.example.hyper.dtos.responses.ArtistResponseDTO;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ArtistService {

    public ArtistResponseDTO save(ArtistDTO artist);

    public ArtistPageResponseDTO find(List<String> names, Pageable pageable);

    public ArtistResponseDTO update(Long id, ArtistDTO artist);
    public void delete(Long id);
}
