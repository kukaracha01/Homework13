public class Main {
    public static void main(String[] args) {

        Author pushkinAleksandr = new Author("Александр Пушкин");
        Author turgenevIvan = new Author("Иван Тургенев");

        Book capitanDochka = new Book("Капитанская дочка", pushkinAleksandr.getNameAuthor(), 1836);
        System.out.println(capitanDochka.getTitleBook() + ", " + capitanDochka.getAuthorBook() + ", " + capitanDochka.getYearBook());

        Book fathersAndChildren = new Book("Отцы и дети", turgenevIvan.getNameAuthor(), 1860);
        System.out.println(fathersAndChildren.getTitleBook() + ", " + fathersAndChildren.getAuthorBook() + ", " + fathersAndChildren.getYearBook());

        fathersAndChildren.setYearBook(1861);
        System.out.println(fathersAndChildren.getYearBook());
    }
}
