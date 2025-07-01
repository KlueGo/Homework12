public class Main {
    public static void main(String args[]) {

        Autor autor1 = new Autor("Александр Пушкин");
        Book book1 = new Book("Евгений Онегин", 1837);
        Autor autor2 = new Autor("Эдуард Асадов");
        Book book2 = new Book("Не проходите мимо любви", 2005);

        System.out.println("Книга " + book1.getNameBook() + " Автор " + autor1.getAutorName() + " " + book1.getPublishingYear() + " года выпуска.");
        System.out.println("Книга " + book2.getNameBook() + " Автор " + autor2.getAutorName() + " " + book2.getPublishingYear() + " года выпуска.");
        book2.setPublishingYear(2006);
        System.out.println("Книга " + book2.getNameBook() + " Автор " + autor2.getAutorName() + " " + book2.getPublishingYear() + " года выпуска.");
    }

    public static class Book {
        private String nameBook;
        private int publishingYear;

        public Book(String nameBook, int publishingYear) {
            this.nameBook = nameBook;
            this.publishingYear = publishingYear;

        }

        public String getNameBook() {
            return this.nameBook;
        }
        public int getPublishingYear() {
           return this.publishingYear;
        }

        public void setPublishingYear(int publishingYear) {
            this.publishingYear = publishingYear;
        }
    }

    public static class Autor {
        private String autorName;

        public Autor(String autorName){
            this.autorName = autorName;
        }
        public String getAutorName(){
            return this.autorName;
        }
    }


}