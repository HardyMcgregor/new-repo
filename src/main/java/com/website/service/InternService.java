package com.website.service;

package com.website.service;

import org.springframework.stereotype.Service;

import com.website.model.Intern;
import com.website.model.InternRepository;

import java.util.List;

@Service
public class InternService {
    private final InternRepository internRepository;

    public InternService(InternRepository internRepository) {
        this.internRepository = internRepository;
    }

    public List<Intern> getAllInterns() {
        return internRepository.findAll();
    }

    public Intern getInternById(Long id) {
        return internRepository.findById(id).orElse(null);
    }

    public Intern saveIntern(Intern intern) {
        return internRepository.save(intern);
    }

    public void deleteInternById(Long id) {
        internRepository.deleteById(id);
    }
}

