/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Archive;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yendry VR
 */
public class ImageFile {
    private File file;

    public ImageFile() {
        file = new File("Movies.txt");
    }

    public ImageFile(String path, String fileName) {
        file = new File(path, fileName);
    }

    public void create() {
        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("The file already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }
    }

    public void deleteFile() {
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.out.println("An error occurred while deleting the file.");
        }
    }

    public void register(Movies movies) {
        try (BufferedWriter write = new BufferedWriter(new FileWriter(file, true))) {
            write.write(movies.toString());
            write.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Movies> query() {
        List<Movies> list = new ArrayList<>();
        try (BufferedReader read = new BufferedReader(new FileReader(file))) {
            String tempLine;
            while ((tempLine = read.readLine()) != null) {
                list.add(Movies.fromString(tempLine));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void delete(String title) {
        List<Movies> list = query();
        deleteFile();
        create();
        for (Movies movie : list) {
            if (!movie.getTitle().equals(title)) {
                register(movie);
            }
        }
    }

    public void modify(String title, Movies newData) {
        delete(title);
        register(newData);
    }
    
    public List<String> getImagePaths() {
        List<String> paths = new ArrayList<>();
        try (BufferedReader read = new BufferedReader(new FileReader(file))) {
            String tempLine;
            while ((tempLine = read.readLine()) != null) {
                paths.add(tempLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return paths;
    } 
}

