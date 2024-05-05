public class Main {
    public static void main(String[] args) {
//        Author pushkinAleksandr = new Author("Александр Пушкин");
//        Author turgenevIvan = new Author("Иван Тургенев");
//
//        Book capitanDochka = new Book("Капитанская дочка", pushkinAleksandr, 1836);
//        System.out.println(capitanDochka.getTitleBook() + ", " + pushkinAleksandr.getNameAuthor() + ", " + capitanDochka.getYearBook());
//
//        Book fathersAndChildren = new Book("Отцы и дети", turgenevIvan, 1860);
//        System.out.println(fathersAndChildren.getTitleBook() + ", " + turgenevIvan.getNameAuthor() + ", " + fathersAndChildren.getYearBook());
//
//        fathersAndChildren.setYearBook(1861);
//        System.out.println(fathersAndChildren.getYearBook());

        Author pushkinAleksandr = new Author("Александр", "Пушкин");
        Book capitanDochka = new Book("Капитанская дочка", pushkinAleksandr, 1836);
        System.out.println(capitanDochka);
    }
}
