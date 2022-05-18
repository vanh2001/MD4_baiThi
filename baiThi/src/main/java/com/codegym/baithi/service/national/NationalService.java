package com.codegym.baithi.service.national;

import com.codegym.baithi.model.City;
import com.codegym.baithi.model.National;
import com.codegym.baithi.repo.INationalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NationalService implements INationalService {
    @Autowired
    private INationalRepository nationalRepository;

    @Override
    public Iterable<National> findAll() {
        return nationalRepository.findAll();
    }

    @Override
    public Optional<National> findById(Long id) {
        return nationalRepository.findById(id);
    }

    @Override
    public National save(National national) {
        return nationalRepository.save(national);
    }

    @Override
    public void remove(Long id) {
        nationalRepository.deleteById(id);
    }
}
