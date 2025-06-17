package ConcreteDocumentClasses;

import DocumentInterfaces.PdfDocument;

public class PdfDocumentConcrete implements PdfDocument {
    @Override
    public void openPdf(){
        System.out.println("Opening PDF Document");
    }
}
