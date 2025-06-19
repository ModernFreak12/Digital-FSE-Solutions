package ConcreteDocumentClasses;

import DocumentInterfaces.ExcelDocument;

public class ExcelDocumentConcrete implements ExcelDocument {
    @Override
    public void openExcel(){
        System.out.println("Opening Excel Document");
    }
}
