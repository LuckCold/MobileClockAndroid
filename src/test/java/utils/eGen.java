package utils;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import junit.framework.TestResult;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;


//Evidence Generator
public class eGen {
    private static final String DATE_FORMAT = "dd_MM_yy";
    private static final String HOUR_FORMAT = "hhmmss";
    private static final String SEPARADOR = "_";
    private static final String FILE_TYPE = "pdf";
    private static final String FOLDER_SUCCESS = "success";
    private static final String FOLDER_FAILURE = "failure";
    private static final String FOLDER_PATH = "./target/reports/evidences/";

    static Calendar calendar = Calendar.getInstance();
    static SimpleDateFormat dataFormat = new SimpleDateFormat(DATE_FORMAT);
    SimpleDateFormat hourFormat = new SimpleDateFormat(HOUR_FORMAT);
    static String data = dataFormat.format(calendar.getTime());
    String hora = hourFormat.format(calendar.getTime());

    static WebDriver webDriver;
    static File print = null;
    public void geraEvidencia(WebDriver webdriver, String fileName) throws IOException, BadElementException {
        this.webDriver = webdriver;

        criaPasta();
        tiraPrint();
//        try {
//            //Cria um novo documento PDF
//            String pdfPath;
//            TestResult result = new TestResult();
//            System.out.println(result.failureCount());
//            System.out.println(result.wasSuccessful());
////            pdfPath = "src/test/evidences/" + data + "/" + FOLDER_FAILURE + "/" + fileName + SEPARADOR + hora + "." + FILE_TYPE;
//            pdfPath = "src/test/evidences/" + data + "/" + FOLDER_SUCCESS + "/" + fileName + SEPARADOR + hora + "." + FILE_TYPE;
//            Path pdfDocument = Paths.get(pdfPath);
//            Document document = new Document();
//            PdfWriter writer = null;
//
//
//            if (!pdfDocument.toFile().isFile()) {
//                Image img = null;
//                writer = PdfWriter.getInstance(document, new FileOutputStream(pdfPath));
//                document.open();
//                img =
//                document.add(new Paragraph(TestDetails.stepName));
//                img.scalePercent(25);
//                document.add(img);
//            } else {
//                PdfReader reader = new PdfReader(pdfPath);
//
//            }
//            FileUtils.deleteQuietly(print);
//            document.close();
//        } catch (DocumentException e) {
//            System.err.println(e.getMessage());
//        } catch (
//            FileNotFoundException e) {
//            System.err.println(e.getMessage());
//        }
//
//
    }

    private static void criaPasta() throws IOException {
        Path path = Paths.get( FOLDER_PATH + data);
        if(!Files.exists(path)){
            Files.createDirectory(path);
            log.println("Novo diretório criado");
            Path pathSucess = Paths.get(FOLDER_PATH + data + "/" + FOLDER_SUCCESS);
            Files.createDirectory(pathSucess);
            Path pathFailure = Paths.get(FOLDER_PATH + data + "/" + FOLDER_FAILURE);
            Files.createDirectory(pathFailure);
        }
    }
    private static void tiraPrint() throws IOException, BadElementException {
        print = new File("./target/reports/screenshots/" + TestDetails.stepName.replace(" ", "_" + ".png"));
        File scrFile = ((TakesScreenshot)webDriver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, print);
        Image.getInstance("./target/reports/screenshots/" + TestDetails.stepName.replace(" ", "_" + ".png"));
    }


}
