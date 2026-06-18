public interface Sort<T extends Comparable > {

    /**
     * @param original
     * @return sorted copy of original
     */
    T[] sort(T[] original);
}
