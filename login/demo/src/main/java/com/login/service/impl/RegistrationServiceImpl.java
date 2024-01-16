package com.login.service.impl;

import com.login.entity.Registration;
import com.login.repository.RegistrationRepository;
import com.login.service.RegistrationService;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    private RegistrationRepository registrationRepository;
    public RegistrationServiceImpl(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    @Override
    public Registration registerUser(Registration user) {
        return registrationRepository.save(user);
    }
}

