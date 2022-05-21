package day11_faker_file;

import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C03_FileExist {
    @Test
    public void test01() {
        System.out.println(System.getProperty("user.dir"));
        //C:\Users\LG\IdeaProjects\com.Batch59Selenium

        System.out.println(System.getProperty("user.home"));
        //C:\Users\LG

        String dosyaYolu=System.getProperty("user.home")+"\\Desktop\\text.txt";

        System.out.println(dosyaYolu);

        System.out.println(Files.exists(Paths.get("C:\\Users\\LG\\Desktop\\text.txt")));

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

    }
}
