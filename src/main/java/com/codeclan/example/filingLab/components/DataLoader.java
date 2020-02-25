package com.codeclan.example.filingLab.components;

import com.codeclan.example.filingLab.Models.File;
import com.codeclan.example.filingLab.Models.Folder;
import com.codeclan.example.filingLab.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import com.codeclan.example.filingLab.repositories.FileRepository;
import com.codeclan.example.filingLab.repositories.FolderRepository;
import com.codeclan.example.filingLab.repositories.UserRepository;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {

        User user1 = new User("Jane");
        userRepository.save(user1);
        User user2 = new User("Jill");
        userRepository.save(user2);

        Folder folder1 = new Folder("Week_4", user1);
        folderRepository.save(folder1);
        Folder folder2 = new Folder("Week_5", user1);
        folderRepository.save(folder2);
        Folder folder3 = new Folder("Week_6", user2);

        File file1 = new File("employee_lab", "java", 500, folder1);
        fileRepository.save(file1);
        File file2 = new File("bear_river_fish", "java", 600, folder1);
        fileRepository.save(file2);
        File file3 = new File("spring", "java", 700, folder2);
        fileRepository.save(file3);
        File file4 = new File("rain_lab", "java", 800, folder2);

        folder1.addFile(file1);
        folder1.addFile(file2);
        folder2.addFile(file3);
        folder2.addFile(file4);

        user1.addFolder(folder1);
        user1.addFolder(folder2);
        user2.addFolder(folder3);

    }
}
