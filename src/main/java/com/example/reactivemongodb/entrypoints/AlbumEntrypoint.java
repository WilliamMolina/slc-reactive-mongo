package com.example.reactivemongodb.entrypoints;


import com.example.reactivemongodb.model.Album;
import com.example.reactivemongodb.repository.AlbumRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("albums")
public class AlbumEntrypoint {

    @Autowired
    AlbumRepository albumRepository;

    @PostMapping
    public @ResponseBody
    Mono<Album> save(@RequestBody Album album){
        return albumRepository.save(album);
    }

    @GetMapping
    public @ResponseBody
    Flux<Album> getAll(){
        return albumRepository.findAll();
    }

    @GetMapping("/{id}")
    public @ResponseBody
    Mono<Album> getById(@PathVariable("id") final String id){
        return albumRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public @ResponseBody
    Mono<Void> delete(@PathVariable("id") final String id){
        return albumRepository.deleteById(id);
    }
}
