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
        
    }
}
