package com.codeclan.example.filingLab.projections;

import com.codeclan.example.filingLab.Models.File;
import com.codeclan.example.filingLab.Models.Folder;
import com.codeclan.example.filingLab.Models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedUser", types= Folder.class)
public interface EmbedUser {
    String getName();
    List<File> getFiles();
    User getUser();
}
