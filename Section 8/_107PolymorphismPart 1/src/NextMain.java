public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A","Jaws");
        movie.watchMovie();

        Adventure jaws = (Adventure) Movie.getMovie("A","Jaws");
        jaws.watchMovie();
//        We can cast the instances of the class like the above example

        Object comedy = Movie.getMovie("C","Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var airplane = Movie.getMovie("c","Airplane");
        airplane.watchMovie();

        var plane = new Comedy("Airplane");
        plane.watchComedy();

        Object unknownObject = Movie.getMovie("S","Airplane");
        if (unknownObject.getClass().getSimpleName() == "Comedy")
        {
            Comedy C = (Comedy) unknownObject;
            C.watchComedy();
        }else if (unknownObject instanceof Adventure)
        {
            ((Adventure) unknownObject).watchAdventure();
        } else if (unknownObject instanceof  ScienceFiction syfy) {
            syfy.watchScience();
        }
    }
}
