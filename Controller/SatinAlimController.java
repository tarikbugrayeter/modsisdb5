package com.example.modsisdb4.Controller;

import com.example.modsisdb4.Repository.MusteriRepository;
import com.example.modsisdb4.Repository.KaravanRepository;
import com.example.modsisdb4.Repository.OptionalRepository;
import com.example.modsisdb4.Repository.SatinAlimRepository;
import com.example.modsisdb4.modsisdb4.Karavan;
import com.example.modsisdb4.modsisdb4.Musteri;
import com.example.modsisdb4.modsisdb4.SatinAlim;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
@RequiredArgsConstructor
public class SatinAlimController {

    private final SatinAlimRepository satinAlimRepository;
    private final KaravanRepository karavanRepository;
    private final MusteriRepository musteriRepository;

    @GetMapping("/satinalim")
    public List<SatinAlim> getAllSatinAlim() {
        return satinAlimRepository.findAll();
    }

    @PostMapping("/satinalim")
    public SatinAlim createSatinAlim(@RequestBody SatinAlim satinAlim) {
        Karavan karavan = karavanRepository.findById(satinAlim.getKaravan().getId()).orElseThrow();
        Musteri musteri = musteriRepository.findById(satinAlim.getMusteri().getId()).orElseThrow();
        satinAlim.setKaravan(karavan);
        satinAlim.setMusteri(musteri);
        return satinAlimRepository.save(satinAlim);
    }

    @GetMapping("/karavan")
    public List<Karavan> getAllKaravan() {
        return karavanRepository.findAll();
    }

    @GetMapping("/musteri")
    public List<Musteri> getAllMusteri() {
        return musteriRepository.findAll();
    }
}


