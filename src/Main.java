public class Main {
    public static void main(String args[]) {

        Author autor1 = new Author("Александр", " Пушкин");
        Book book1 = new Book("Евгений Онегин", 1837);
        Author autor2 = new Author("Эдуард", " Асадов");
        Book book2 = new Book("Не проходите мимо любви", 2005);

        System.out.println("Книга " + book1.getNameBook() + " Автор " + autor1.getFullName() + " " + book1.getPublishingYear() + " года выпуска.");
        System.out.println("Книга " + book2.getNameBook() + " Автор " + autor2.getFullName() + " " + book2.getPublishingYear() + " года выпуска.");
        book2.setPublishingYear(2006);
        System.out.println("Книга " + book2.getNameBook() + " Автор " + autor2.getFullName() + " " + book2.getPublishingYear() + " года выпуска.");
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

    public static class Author {
        private String authorName;
        private String authorSername;

        public Author(String authorName, String authorSername){
            this.authorName = authorName;
            this.authorSername = authorSername;

        }
        public String getAuthorName(){
            return this.authorName;
        }
        public String getAuthorSername(){
            return this.authorSername;
        }
        public String getFullName(){
            return authorName + authorSername;
        }
    }


}