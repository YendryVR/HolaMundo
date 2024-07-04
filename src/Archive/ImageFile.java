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
 * This class handles operations on an image file, including creating, deleting,
 * and managing records of movies.
 *
 * Esta clase maneja operaciones en un archivo de imágenes, incluyendo la
 * creación, eliminación y gestión de registros de películas.
 *
 * @autor Yendry VR
 */
public class ImageFile {
    // File object representing the image file / Objeto File que representa el archivo de imagen

    private File file;

    /**
     * Constructor to create an ImageFile object with a default file name.
     * Constructor para crear un objeto ImageFile con un nombre de archivo
     * predeterminado.
     */
    public ImageFile() {
        file = new File("Movies.txt");
    }

    /**
     * Constructor to create an ImageFile object with a specified path and file
     * name. Constructor para crear un objeto ImageFile con una ruta y nombre de
     * archivo especificados.
     *
     * @param path the path to the file / la ruta al archivo
     * @param fileName the name of the file / el nombre del archivo
     */
    public ImageFile(String path, String fileName) {
        file = new File(path, fileName);
    }

    /**
     * Method to create the file. Método para crear el archivo.
     */
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

    /**
     * Method to delete the file. Método para eliminar el archivo.
     */
    public void deleteFile() {
        if (file.delete()) {
            System.out.println("File deleted: " + file.getName());
        } else {
            System.out.println("An error occurred while deleting the file.");
        }
    }

    /**
     * Method to register a movie record in the file. Método para registrar un
     * registro de película en el archivo.
     *
     * @param movies the movie object to be registered / el objeto de película a
     * registrar
     */
    public void register(Movies movies) {
        try (BufferedWriter write = new BufferedWriter(new FileWriter(file, true))) {
            write.write(movies.toString());
            write.newLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Method to query all movie records from the file. Método para consultar
     * todos los registros de películas del archivo.
     *
     * @return a list of movie objects / una lista de objetos de películas
     */
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

    /**
     * Method to delete a specific movie record by its title. Método para
     * eliminar un registro específico de película por su título.
     *
     * @param title the title of the movie to be deleted / el título de la
     * película a eliminar
     */
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

    /**
     * Method to modify an existing movie record. Método para modificar un
     * registro existente de película.
     *
     * @param title the title of the movie to be modified / el título de la
     * película a modificar
     * @param newData the new movie data / los nuevos datos de la película
     */
    public void modify(String title, Movies newData) {
        delete(title);
        register(newData);
    }

    /**
     * Method to get paths of images from the file. Método para obtener rutas de
     * imágenes del archivo.
     *
     * @return a list of image paths / una lista de rutas de imágenes
     */

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
