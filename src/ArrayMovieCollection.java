class ArrayMovieCollection {
    private String[] movies;
    private int index;

    public ArrayMovieCollection(int size) {
        movies = new String[size];
        index = 0;
    }

    public void addMovie(String movie) {
        if (index < movies.length) {
            movies[index++] = movie;
        }
    }

    public Iterator<String> iterator() {
        return new ArrayMovieIterator(movies);
    }
}
