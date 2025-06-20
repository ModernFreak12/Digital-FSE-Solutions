import DocumentInterfaces.*;
import FactoryClasses.*;

public class Main {
    public static void main(String[] args) {
        DocumentFactory wordFactory = new WordDocumentFactory();
        WordDocument wordDoc = (WordDocument) wordFactory.createDocument();
        wordDoc.openWord();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        PdfDocument pdfDoc = (PdfDocument) pdfFactory.createDocument();
        pdfDoc.openPdf();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        ExcelDocument excelDoc = (ExcelDocument) excelFactory.createDocument();
        excelDoc.openExcel();
    }
}