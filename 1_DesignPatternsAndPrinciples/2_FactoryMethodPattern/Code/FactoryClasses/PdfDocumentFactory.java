package FactoryClasses;


import ConcreteDocumentClasses.PdfDocumentConcrete;
import DocumentInterfaces.PdfDocument;

public class PdfDocumentFactory extends DocumentFactory {
    @Override
    public PdfDocument createDocument() {
        return new PdfDocumentConcrete();
    }
}
