package com.example.reactivemongodb.repository;

import com.example.reactivemongodb.model.Album;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface AlbumRepository extends ReactiveMongoRepository<Album, String> {
}
