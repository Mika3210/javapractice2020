package ru.Mika3210.javapractice2020.pr21.ex3;

public class ICreateDocument implements IDocument {
    public IDocument CreateNew(){
        IDocument doc = new IDocument() {

        };
        new TextDocument();
        return doc;
    }

    public IDocument CreateOpen(){
        IDocument doc = new IDocument() {
        };
        new TextDocument();
        return doc;
    }
}
