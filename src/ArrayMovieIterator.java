class ArrayMovieIterator implements Iterator<String> {
    private String[] movies;
    private int position;

    public ArrayMovieIterator(String[] movies) {
        this.movies = movies;
    }

    public boolean hasNext() {
        return position < movies.length;
    }

    public String next() {
        return movies[position++];
    }
}
