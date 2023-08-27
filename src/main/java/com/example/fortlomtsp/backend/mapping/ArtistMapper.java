package com.example.fortlomtsp.backend.mapping;
import com.example.fortlomtsp.backend.domain.model.entity.Artist;
import com.example.fortlomtsp.backend.resource.artist.ArtistResource;
import com.example.fortlomtsp.backend.resource.artist.CreateArtistResource;
import com.example.fortlomtsp.backend.resource.artist.UpdateArtistResource;
import com.example.fortlomtsp.shared.mapping.EnhancedModelMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import java.util.List;
import java.io.Serializable;

public class ArtistMapper implements Serializable {
    @Autowired
    EnhancedModelMapper mapper;


    public ArtistResource toResource(Artist model) {
        return mapper.map(model, ArtistResource.class);
    }

    public Page<ArtistResource> modelListToPage(List<Artist> modelList, Pageable pageable) {
        return new PageImpl<>(mapper.mapList(modelList, ArtistResource.class), pageable, modelList.size());
    }
    public Artist toModel(CreateArtistResource resource) {
        return mapper.map(resource, Artist.class);
    }

    public Artist toModel(UpdateArtistResource resource) {
        return mapper.map(resource, Artist.class);
    }
}
