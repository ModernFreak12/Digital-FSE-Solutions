package ConcreteDocumentClasses;

import DocumentInterfaces.WordDocument;

public class WordDocumentConcrete implements WordDocument {
    @Override
    public void openWord(){
        System.out.println("Opening Word Document");
    }
}
