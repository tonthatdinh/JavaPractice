package Graph;

import java.util.List;

public class Graph {
    int numVertice;
    List<Integer> ListVertice;
    int numEdege;
    int[][] adjMatrix;

    public int getNumVertice() {
        return numVertice;
    }

    public void setNumVertice(int numVertice) {
        this.numVertice = numVertice;
    }

    public int getNumEdege() {
        return numEdege;
    }

    public void setNumEdege(int numEdege) {
        this.numEdege = numEdege;
    }
}
