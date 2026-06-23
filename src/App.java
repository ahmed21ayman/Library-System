public class App {
    static class Book{
        protected String title;
        protected String author;
        protected boolean Availbility;
        Book(String title, String author, boolean Availbility){
            this.title = title;
            this.author = author;
            this.Availbility = Availbility;
        }
    }

    static class Member{
        private int id;
        private String name;
        Member(int id, String name){
            this.id = id;
            this.name = name;
        }
        void memberinfo(){
            System.out.println(" id : " + id + " name: " + name + " ");
        }
    }

    static class Library extends Book{
        Library(String title, String author, boolean Availbility){
            super(title, author, Availbility);
        }

        void addBook(){
            this.title = title;
            this.author = author;
            this.Availbility = true;
            System.out.println(title + " by " + author + " this book is added now");
        }

        void borrowBook(){
            if(this.Availbility != true){
                System.out.println(title + " this book is not avlible now");
            }else {
                this.title = title;
                this.author = author;
                this.Availbility = false;
                System.out.println(title + " this book for you now");
            }
        }

        void returnBook(){
            this.title = title;
            this.author = author;
            this.Availbility = true;
            System.out.println(title + " this book is back avlible now");
        }

    }


    public static void main(String[] args) throws Exception {
        Library b1 = new Library("w", "mohamed", true);
        Library b2 = new Library("ww", "mohamed", true);
        Library b3 = new Library("www", "mohamed", true);
        Library b4 = new Library("wwww", "mohamed", true);
        Library b5 = new Library("wwwww", "mohamed", true);
        Member m1 = new Member(1, "ahmed");
        Member m2 = new Member(2, "mohamed");
        b1.borrowBook();
        b1.borrowBook();
        b1.returnBook();
    }
}
