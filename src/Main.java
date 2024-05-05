public class Main {
    public static void main(String[] args) {
        Author pushkinAleksandr = new Author("Александр", "Пушкин");
        Author turgenevIvan = new Author("Александр", "Тургенев");

        Book capitanDochka = new Book("Капитанская дочка", pushkinAleksandr, 1836);
//        System.out.println(capitanDochka.getTitleBook() + ", " + pushkinAleksandr + ", " + capitanDochka.getYearBook());

        Book fathersAndChildren = new Book("Капитанская дочка", turgenevIvan, 1860);
//        System.out.println(fathersAndChildren.getTitleBook() + ", " + turgenevIvan + ", " + fathersAndChildren.getYearBook());

//        fathersAndChildren.setYearBook(1861);
//        System.out.println(fathersAndChildren.getYearBook());

        System.out.println(pushkinAleksandr.equals(turgenevIvan));
        System.out.println(capitanDochka.equals(fathersAndChildren));

//        Author pushkinAleksandr = new Author("Александр", "Пушкин");
//        Book capitanDochka = new Book("Капитанская дочка", pushkinAleksandr, 1836);
//        System.out.println(capitanDochka);

    }
}
