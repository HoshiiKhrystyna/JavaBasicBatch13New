package com.syntax.class24;

public abstract class File {
    abstract void open();
    void edit(){
        System.out.println("Edit the file");
    }
 void close(){
     System.out.println("Close the file");
 }}
class JavaFile extends File{
    @Override
    void open() {
        System.out.println("To open Java file we need notepad++");
    }}
class WordFile extends File{
    @Override
    void open() {
        System.out.println("To open doc file we need Microsoft word");
    }}
class PdfFile extends File{
    @Override
    void open() {
        System.out.println("To open PDF file we need PDF reader");
    }}
