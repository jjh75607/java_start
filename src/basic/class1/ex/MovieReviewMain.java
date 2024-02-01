package basic.class1.ex;

public class MovieReviewMain {

    public static void main(String[] args) {
        MovieReview movieReview1 = new MovieReview();
        movieReview1.title = "인셉션";
        movieReview1.review = "인생은 무한 루프";

        MovieReview movieReview2 = new MovieReview();
        movieReview2.title = "어바웃 타임";
        movieReview2.review = "인생 시간 영화!";

        MovieReview[] movieReview = {movieReview1, movieReview2};

        for (MovieReview review : movieReview) {
            System.out.println("영화 제목: " + review.title + ", 리뷰: \"" + review.review + "\"");
        }
    }
}
