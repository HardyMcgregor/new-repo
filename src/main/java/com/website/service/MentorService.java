package com.website.service;


import org.springframework.stereotype.Service;

import com.website.model.Mentor;
import com.website.model.MentorRepository;

import java.util.List;

@Service
public class MentorService {
    private final MentorRepository mentorRepository;

    public MentorService(MentorRepository mentorRepository) {
        this.mentorRepository = mentorRepository;
    }

    public List<Mentor> getAllMentors() {
        return mentorRepository.findAll();
    }

    public Mentor getMentorById(Long id) {
        return mentorRepository.findById(id).orElse(null);
    }

    public Mentor saveMentor(Mentor mentor) {
        return mentorRepository.save(mentor);
    }

    public void deleteMentorById(Long id) {
        mentorRepository.deleteById(id);
    }
}
