package C_Xti_010_Files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Arquivo1 
{
    public static void main(String[] args) throws IOException 
    {
        // Java 7
        //Path path = Paths.get("c:/xti/files/virus.bat");
        Path path = Paths.get("c:/file/virus.bat");
        System.out.println(path.toAbsolutePath());
        System.out.println(path.getParent());
        System.out.println(path.getRoot());
        System.out.println(path.getFileName());

        // Criação de diretórios
        Files.createDirectories(path.getParent());

        // Escrever e ler arquivos
        byte[] bytes = ("@echo off \n" + 
                        "mkdir %userprofile%\\teste \n" + 
                        "cd / \n" +
                        "tree ").getBytes();
        
        Files.write(path, bytes); //cria,limpa,escreve

        byte[] retorno = Files.readAllBytes(path);
        System.out.println(new String(retorno));
    }
}
