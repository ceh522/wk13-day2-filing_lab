package com.codeclan.example.filingLab.projections;

import com.codeclan.example.filingLab.Models.File;
import com.codeclan.example.filingLab.Models.Folder;
import org.springframework.data.rest.core.config.Projection;

@Projection(name= "embedFolder", types= File.class)
public interface EmbedFolder {
    String getName();
    String getExtension();
    int getSize();
    Folder getFolder();
}
