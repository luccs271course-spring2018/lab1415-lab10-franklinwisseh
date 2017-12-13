import java.util.*;
import org.jgrapht.Graph;
import org.jgrapht.alg.color.GreedyColoring;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;
import org.jgrapht.traverse.BreadthFirstIterator;
import org.jgrapht.traverse.ClosestFirstIterator;
import org.jgrapht.traverse.DepthFirstIterator;
import org.jgrapht.traverse.RandomWalkIterator;

public class Main {

    public static void main(final String[] args) {

        final Graph<String, DefaultEdge> myGraph = new SimpleGraph<>(DefaultEdge.class);

        final String NV = stateCodes.NV;
        final String UT = stateCodes.UT;
        final String AZ = stateCodes.AZ;
        final String CA = stateCodes.CA;
        final String OR = stateCodes.OR;
        final String ID = stateCodes.ID;

        GeoGraph.addVertex(NV);
        GeoGraph.addVertex(UT);
        GeoGraph.addVertex(AZ);
        GeoGraph.addVertex(CA);
        GeoGraph.addVertex(OR);
        GeoGraph.addVertex(ID);

        GeoGraph.addEdge(NV, UT);
        GeoGraph.addEdge(NV, AZ);
        GeoGraph.addEdge(NV, CA);
        GeoGraph.addEdge(NV, OR);
        GeoGraph.addEdge(NV, ID);
        GeoGraph.addEdge(UT, AZ);
        GeoGraph.addEdge(AZ, CA);
        GeoGraph.addEdge(CA, OR);
        GeoGraph.addEdge(OR, ID);
        GeoGraph.addEdge(ID, UT);

        System.out.println(GeoGraph);

        final Iterator<String> bf = new BreadthFirstIterator<>(myGraph, NV);
        while (bf.hasNext()) {
            final String state = bf.next();
            System.out.println("Breadth first search starts at NV " + state);
        }

        final Iterator<String> bf2 = new BreadthFirstIterator<>(myGraph, UT);
        while (bf2.hasNext()) {
            final String state = bf2.next();
            System.out.println("Breadth-Two first search starts at UT " + state);
        }

        final Iterator<String> cf = new ClosestFirstIterator<>(myGraph, NV);
        while (cf.hasNext()) {
            final String state = cf.next();
            System.out.println("Closest first search starts at NV " + state);
        }

        final Iterator<String> cf2 = new ClosestFirstIterator<>(myGraph, UT);
        while (cf2.hasNext()) {
            final String state = cf2.next();
            System.out.println("Closest-Two first search starts at UT " + state);
        }

        final Iterator<String> df = new DepthFirstIterator<>(myGraph, NV);
        while (df.hasNext()) {
            final String state = df.next();
            System.out.println("Depth first search starts at NV " + state);
        }

        final Iterator<String> df2 = new DepthFirstIterator<>(myGraph, UT);
        while (df2.hasNext()) {
            final String state = df2.next();
            System.out.println("Depth-Two first search starts at UT " + state);
        }

        final Iterator<String> rw = new RandomWalkIterator<>(myGraph, NV);
        while (rw.hasNext()) {
            final String state = rw.next();
            System.out.println("Closest first search starts at NV " + state);
        }

        final Iterator<String> rw = new RandomWalkIterator<>(myGraph, UT);
        while (rw.hasNext()) {
            final String state = rw.next();
            System.out.println("Closest-Two first search starts at UT " + state);
        }
        GreedyColoring graph = new GreedyColoring(myGraph);
        System.out.println(graph.getColoring());
    }
}