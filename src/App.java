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

    public static void main(String[] args) throws Exception {
        
    }
}
