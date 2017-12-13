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
