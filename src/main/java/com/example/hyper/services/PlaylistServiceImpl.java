package com.example.hyper.services;

import com.example.hyper.constants.ErrorCodes;
import com.example.hyper.dtos.responses.TrackResponseDTO;
import com.example.hyper.dtos.responses.pages.PlaylistPageReponseDTO;
import com.example.hyper.dtos.responses.PlaylistResponseDTO;
import com.example.hyper.entities.TrackEntity;
import com.example.hyper.exceptions.PlaylistNotFoundException;
import com.example.hyper.exceptions.TrackNotFoundException;
import com.example.hyper.dtos.requests.PlaylistRequestDTO;
import com.example.hyper.entities.PlaylistEntity;
import com.example.hyper.repositories.PlaylistRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class PlaylistServiceImpl implements PlaylistService {

    @Autowired
    private PlaylistRepository playlistRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public PlaylistResponseDTO save(PlaylistRequestDTO playlist) {

        PlaylistEntity playlistEntity;
        try{
            playlistEntity = modelMapper.map(playlist, PlaylistEntity.class);

            playlistEntity = playlistRepository.save(playlistEntity);

            return modelMapper.map(playlistEntity, PlaylistResponseDTO.class);

        }catch (DataIntegrityViolationException e){
            return null; // Implementar erro
        }
    }

    @Override
    public PlaylistPageReponseDTO find(String name, Pageable pageable) {

        Page<PlaylistEntity> playlistEntities;

        if(name != null){
            playlistEntities = playlistRepository.findByName(name, pageable);
        } else {
            playlistEntities = playlistRepository.findAll(pageable);
        }

        return modelMapper.map(playlistEntities, PlaylistPageReponseDTO.class);
    }

    @Override
    public PlaylistResponseDTO update(Long id, PlaylistRequestDTO playlist) {
        PlaylistEntity playlistCurrent = findByIdOrThrowPlaylistDataNotFoundException(id);

        playlistCurrent.setName(playlist.getName());

        playlistRepository.save(playlistCurrent);

        return modelMapper.map(playlistCurrent, PlaylistResponseDTO.class);
    }

    @Override
    public void delete(Long id) {
        PlaylistEntity playlistCurrent = findByIdOrThrowPlaylistDataNotFoundException(id);

        playlistRepository.delete(playlistCurrent);
    }

    private PlaylistEntity findByIdOrThrowPlaylistDataNotFoundException(Long id) {
        return playlistRepository.findById(id).orElseThrow(
                () -> new PlaylistNotFoundException(ErrorCodes.DATA_NOT_FOUND, ErrorCodes.DATA_NOT_FOUND.getMessage()));
    }
}
