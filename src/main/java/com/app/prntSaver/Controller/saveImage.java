package com.app.prntSaver.Controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RestController
public class saveImage {

    @Value("${sv.resource.location}")
    private String resourceLocation;

    @PostMapping(value = "/saveimage")
    public ResponseEntity<?> saveImage(MultipartFile image) throws IOException {

        String imageName = image.getOriginalFilename();
        byte[] imageContent = image.getBytes();

        Path imagePath = Paths.get(resourceLocation).resolve(imageName);

        Files.write(imagePath, imageContent);

        return ResponseEntity.ok().body("Imagem salva.");

    }

}
