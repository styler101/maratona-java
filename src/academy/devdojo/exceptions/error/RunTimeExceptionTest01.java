package academy.devdojo.exceptions.error;

import java.io.File;
import java.io.IOException;

public class RunTimeExceptionTest01 {
    public static void main(String[]args) {
       createFile("file1");
       createFile("file2");
    }

    private static void createFile(String fileName)  {
      File file = new File("arquivo//" + fileName.concat(".txt"));
      try {
        file.createNewFile();
      }catch(IOException exception){
        System.out.println("Ocorreu um erro ao criar um arquivo");
        exception.printStackTrace();
      }
    }
}
