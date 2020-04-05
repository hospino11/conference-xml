package com.pluralsight.service;

import com.pluralsight.model.Speaker;
import com.pluralsight.repository.HibernateSpeakerRepositoryImpl;
import com.pluralsight.repository.SpeakerRepository;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SpeakerServiceImpl implements SpeakerService {

    private final Logger logger = Logger.getLogger(SpeakerServiceImpl.class.getName());

    private SpeakerRepository speakerRepository;

    public SpeakerServiceImpl() {
        logger.log(Level.INFO, "SpeakerServiceImpl no args constructor");
    }

    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        logger.log(Level.INFO, "SpeakerServiceImpl repository constructor");
        this.speakerRepository = speakerRepository;
    }

    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll() {
        return speakerRepository.findAll();
    }
}
