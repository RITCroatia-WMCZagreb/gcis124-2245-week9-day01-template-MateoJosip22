/*
@ASSESSME.USERID: mj6269
@ASSESSME.AUTHOR: Mateo Josipovic
@ASSESSME.DESCRIPTION: Week-9-Day-1-in Class
@ASSESSME.ANALYZE: YES
*/

import java.util.HashSet;
import java.util.Set;

public class Vertex<E> {
    private E value;
    private Set<Vertex<E>> neighbors = null;

    public Vertex(E value){
        this.value = value;
        this.neighbors = new HashSet<>();
    }

    public E getValue(){
        return this.value;
    }

    public void connect(Vertex<E> neighbor){
        this.neighbors.add(neighbor);
    }

    public boolean connected(Vertex<E> neighbor){
        return this.neighbors.contains(neighbor);
    }


    public Set<Vertex<E>> getNeighbors(){
        return this.neighbors;
    }

    public static void main(String[] args) {
        Vertex<String> vA = new Vertex<String>("A");
        Vertex<String> vB = new Vertex<String>("B");
        Vertex<String> vC = new Vertex<String>("C");

        vA.connect(vB);
        vA.connect(vC);
        vB.connect(vC);
        vC.connect(vB);
        vC.connect(vA);
    }
}