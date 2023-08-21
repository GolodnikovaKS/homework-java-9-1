public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Клавдия";
        post.surname = "Голодникова";
        post.patronymic = "Сергеевна";
        post.phone = "8 (923) 707-81-91";
        post.passport = "4444 № 44444444";
        post.subscription = true;

        post.birthday = new FormDate();
        post.birthday.day = 13;
        post.birthday.month = 6;
        post.birthday.year = 1999;

    }
}
