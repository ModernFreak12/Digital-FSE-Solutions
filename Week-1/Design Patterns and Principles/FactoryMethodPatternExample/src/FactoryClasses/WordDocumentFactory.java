package FactoryClasses;

import ConcreteDocumentClasses.WordDocumentConcrete;
import DocumentInterfaces.WordDocument;

public class WordDocumentFactory extends DocumentFactory {
    @Override
    public WordDocument createDocument() {
        return new WordDocumentConcrete();
    }
}
