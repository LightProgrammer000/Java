package PXTI_002;
 
import java.io.*;
import java.nio.file.*;
 
public class Dados_Cpu
{
    public static void main(String[] args) throws IOException 
    {
        FileSystem fs = FileSystems.getDefault();
        
        for (FileStore store : fs.getFileStores()) 
        {
            System.out.println("Unidade:" + store.toString());
            System.out.println("Total:" + store.getTotalSpace());
            System.out.println("Disponivel:" + store.getUsableSpace());
            System.out.println("Utilizada:" + (store.getTotalSpace() - store.getUsableSpace()));
        }
    }
}
