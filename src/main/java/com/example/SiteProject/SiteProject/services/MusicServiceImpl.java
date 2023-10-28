package com.example.SiteProject.SiteProject.services;

import com.example.SiteProject.SiteProject.dtos.MusicDTO;
import com.example.SiteProject.SiteProject.dtos.responses.MusicResponseDTO;
import com.example.SiteProject.SiteProject.entities.MusicEntity;
import com.example.SiteProject.SiteProject.repositories.MusicRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class MusicServiceImpl implements MusicService {

    private final MusicRepository musicRepository;

    @Autowired
    private final ModelMapper modelMapper;

    @Override
    public MusicResponseDTO save(MusicDTO music) {

        System.out.println("SERVICE - OK");
        System.out.println();
        try{
            MusicEntity musicEntity = modelMapper.map(music, MusicEntity.class);

            musicEntity = musicRepository.save(musicEntity);

            return modelMapper.map(musicEntity, MusicResponseDTO.class);
        }catch (Exception e){
            //Throw new Exception
        }
        return null;
    }

    @Override
    public void delete(Long id) {
    }

}
