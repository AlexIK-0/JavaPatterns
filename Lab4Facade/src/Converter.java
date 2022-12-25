

import java.io.File;
import java.io.IOException;
public class Converter {

    public enum Format {
        pdf,
        txt,
        png,
    }
    public Converter(){}

    public void Convert(String path,String savePath, Format extension) {
        if (extension == Format.pdf){ConvertPdf.convert(path,savePath);}
        if (extension == Format.txt){ConvertTxt.convert(path,savePath);}
        if (extension == Format.png){ConvertPng.convert(path,savePath);}

    }

    class ConvertTxt{
        public static void convert(String filePath, String savePath) {
            System.out.println("Конвертация файла в txt ");
            File get = new File(filePath);
            File save = new File(savePath + ".txt");
            try {
                save.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Файл сохранен по адресу "+savePath + " в формате txt");

        }
    }

    class ConvertPdf {
        public static void convert(String filePath,String savePath ) {
            System.out.println("Конвертация файла в pdf ");
            File get = new File(filePath);
            File save = new File(savePath + ".pdf");
            try {
                save.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Файл сохранен по адресу "+savePath + " в формате pdf");

        }
    }

    class ConvertPng{
        public static void convert(String filePath,String savePath) {
            System.out.println("Конвертация файла в png");
            File get = new File(filePath);
            File save = new File(savePath +".png" );
            try {
                save.createNewFile();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Файл сохранен по адресу "+savePath + "в формате png");

        }

    }
}
