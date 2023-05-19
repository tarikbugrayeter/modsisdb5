package com.example.modsisdb4.Service;

import com.example.modsisdb4.Repository.OptionalRepository;
import com.example.modsisdb4.modsisdb4.Optional;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class OptionalService {
    private final OptionalRepository optionalRepository;

    public OptionalService(OptionalRepository optionalRepository) {
        this.optionalRepository = optionalRepository;
    }

    @Transactional
    public Optional addComfortPackageToOptional(Long optionalId, String comfortPackageName) {
        Optional optional = optionalRepository.findById(optionalId).orElseThrow();
        optional.getComfortPackages().add(comfortPackageName);
        return optionalRepository.save(optional);
    }
    @Transactional
    public Optional addTeknolojiPackageToOptional(Long optionalId, String teknolojiPackageName) {
        Optional optional = optionalRepository.findById(optionalId).orElseThrow();
        optional.getTeknolojiPackages().add(teknolojiPackageName);
        return optionalRepository.save(optional);
    }
    @Transactional
    public Optional addBeyazEsyaPackageToOptional(Long optionalId, String beyazEsyaPackageName) {
        Optional optional = optionalRepository.findById(optionalId).orElseThrow();
        optional.getBeyazEsyaPackages().add(beyazEsyaPackageName);
        return optionalRepository.save(optional);
    }
}
