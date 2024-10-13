public class Main {
    public static void main(String[] args) {
        ListMovieCollection listCollection = new ListMovieCollection();
        listCollection.addMovie("Inception");
        listCollection.addMovie("Interstellar");

        ArrayMovieCollection arrayCollection = new ArrayMovieCollection(2);
        arrayCollection.addMovie("The Matrix");
        arrayCollection.addMovie("The Lord of the Rings");

        System.out.println("Movies from List:");
        Iterator<String> listIterator = listCollection.iterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Movies from Array:");
        Iterator<String> arrayIterator = arrayCollection.iterator();
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }
    }
}
