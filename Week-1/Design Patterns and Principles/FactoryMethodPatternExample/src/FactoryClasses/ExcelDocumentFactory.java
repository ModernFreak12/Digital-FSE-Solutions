package FactoryClasses;

import ConcreteDocumentClasses.ExcelDocumentConcrete;
import DocumentInterfaces.ExcelDocument;

public class ExcelDocumentFactory extends DocumentFactory {
    @Override
    public ExcelDocument createDocument() {
        return new ExcelDocumentConcrete();
    }
}
