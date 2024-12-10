package gr.aueb.cf.ch9;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * copies a pdf file as binary file.
 */
public class PdfCopyApp {

    public static void main(String[] args) {
        int b;
        int counter = 0;
        long start;
        long end;
        double elapsedTime = 0.0;

        try (FileInputStream fis = new FileInputStream("C:\\Users\\nikko\\Workspace\\dummy.pdf");
             FileOutputStream fos = new FileOutputStream("C:\\Users\\nikko\\Workspace\\dummy-out.pdf")) {

            start = System.currentTimeMillis();
            while ((b = fis.read()) != -1) {
                fos.write(b);
                counter++;
            }
            end = System.currentTimeMillis();
            elapsedTime = (end - start) / 1000.0;

            System.out.printf("To arxeio me megethos %.1fKB (%d bytes) antigrafike epituxws\n",
                    (counter / 1024.0), counter);
            System.out.println("Elapsed Time: " +elapsedTime);

        } catch (IOException e) {
            System.err.println(e.getMessage());
        }


    }
}
