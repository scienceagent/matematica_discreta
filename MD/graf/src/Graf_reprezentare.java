import org.jgrapht.Graph;
import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.SimpleGraph;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Graf_reprezentare {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declararea unui graf de numere intregi
        Graph<Integer, DefaultEdge> graph = new SimpleGraph<>(DefaultEdge.class);

        while (true) {
            printMenu(); // afisare meniu
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addEdge(graph);
                    break;
                case 2:
                    displayGraph(graph);
                    break;
                case 3:
                    displayIncidenceMatrix(graph);
                    break;
                case 4:
                    displayAdjacencyMatrix(graph);
                    break;
                case 5:
                    displayAdjacencyList(graph);
                    break;
                case 6:
                    deleteEdge(graph);
                    break;
                case 7:
                    deleteVertex(graph);
                    break;
                case 0:
                    System.out.println("STOP program (tasta 0 )!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Optiune incorecta");
            }
        }
    }

    // Afisare meniu
    private static void printMenu() {
        System.out.println("----- Menu -----");
        System.out.println("1. Adaugare arcuri noi");
        System.out.println("2. Afisare graf");
        System.out.println("3. Afisare matrice de incidenta");
        System.out.println("4. Afisare matrice de adiacenta");
        System.out.println("5. Afisare lista de adiacenta");
        System.out.println("6. Sterge arcuri");
        System.out.println("7. Sterge nod");
        System.out.println("0. Exit");
        System.out.print("Enter optiunea --> ");
    }

    private static void addEdge(Graph<Integer, DefaultEdge> graph) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dati numarul de noduri ce vrei sa citesti: ");
        int numVertices = scanner.nextInt(); 
    
        for (int i = 0; i < numVertices; i++) {
            System.out.print("enter nodul: ");
            int vertex = scanner.nextInt(); 
            graph.addVertex(vertex); 
            System.out.println("nodul adaugat: " + vertex);
        }
    
        System.out.print("Dati numarul de arcuri ce vrei sa citesti: ");
        int numEdges = scanner.nextInt(); 
    
        for (int i = 0; i < numEdges; i++) {
            System.out.print("arcul de inceput: ");
            int source = scanner.nextInt(); 
            System.out.print("nodul final: ");
            int target = scanner.nextInt(); 
            if (!graph.containsEdge(source, target)) {
                graph.addEdge(source, target); 
                System.out.println("arcul adaugat cu succes: (" + source + ", " + target + ")");
            } else {
                System.out.println("Arcul (" + source + ", " + target + ") există deja în graf.");
            }
            if (source == target) {
                if (!graph.containsEdge(source, source)) {
                    graph.addEdge(source, source); 
                    System.out.println("arcul adaugat cu succes: (" + source + ", " + source + ")");
                } else {
                    System.out.println("Arcul (" + source + ", " + source + ") există deja în graf.");
                }
            }
        }
    }    
    
    
    // Metoda pentru a sterge o legatura dintre noduri
    private static void deleteEdge(Graph<Integer, DefaultEdge> graph) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce arcul initial: ");
        int source = scanner.nextInt(); // declarre nodul sursa
        System.out.print("Introduce arcul final: ");
        int target = scanner.nextInt(); // declarare nodul destinatie
        // verificam daca graful contine arce
        if (graph.containsEdge(source, target)) {
            graph.removeEdge(source, target); // stergem
            System.out.println("Arcul sters: (" + source + ", " + target + ")");
        } else {
            System.out.println("Arcul nu a fost gasit: (" + source + ", " + target + ")");   
        }
            }
    

        // Metoda pentru a sterge o legatura dintre noduri
        private static void deleteVertex(Graph<Integer, DefaultEdge> graph) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce nodul initial: ");
            int source = scanner.nextInt(); // citire nod necesar de sters
                   // verificam daca graful contine nodul introdus
                   if (graph.containsVertex(source)) {
                    graph.removeVertex(source); // stergem nodul
                    System.out.println("Nodul sters: (" + source + ")");
                } else {
                    System.out.println("Nodul nu a fost gasit: (" + source + ")");   
                }
        }
    

    // Afisare graf
    private static void displayGraph(Graph<Integer, DefaultEdge> graph) {
        System.out.println("Graful: " + graph);
    }

    // Metoda de afisare a matricei de incidenta
    // 1, dacă nodul i este extremitatea finală a arcului j;
    // -1, dacă nodul i este extremitatea iniţială a arcului j;
    // 0, dacă nodul i nu este extremitate a arcului j.
    private static void displayIncidenceMatrix(Graph<Integer, DefaultEdge> graph) {
        System.out.println("Matricea de incidenta:");
        // Declaram o lista
        List<DefaultEdge> edges = new ArrayList<>(graph.edgeSet());
        // Parcugem nodurile grafului
        for (Integer vertex : graph.vertexSet()) {
            // Parcurgem arcurile
            for (DefaultEdge edge : edges) {
                // Declaram nodul sursa si destinatie
                Integer source = graph.getEdgeSource(edge);
                Integer target = graph.getEdgeTarget(edge);
                // Verificam conditia
                if (vertex.equals(source)) {
                    System.out.print("-1 ");
                } else if (vertex.equals(target)) {
                    System.out.print("1 ");
                } 
                    else if (vertex.equals(source)) {
                        System.out.println("2");
                    }
                else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }

    // Metoda de afisare a matricei de adiacenta
    private static void displayAdjacencyMatrix(Graph<Integer, DefaultEdge> graph) {
        System.out.println("Matricea de adiacenta:");
        // Parcurgem fiecare varf din arc
        for (Integer source : graph.vertexSet()) {
            for (Integer target : graph.vertexSet()) {
                // Verificam daca exista un arc intre varful sursa si destinatie
                System.out.print(graph.containsEdge(source, target) ? "1 " : "0 ");
            }
            System.out.println();
        }
    }

    // Metoda de afisare a listei de adiacenta
    private static void displayAdjacencyList(Graph<Integer, DefaultEdge> graph) {
        System.out.println("Lista de adiacenta:");
        // Iterarea dupa noduri
        for (Integer vertex : graph.vertexSet()) {
            System.out.print(vertex + ": ");
            // Declareare unei liste pentru stocarea listei
            List<Integer> neighbors = new ArrayList<>();
            // Iterarea dupa arce
            for (DefaultEdge edge : graph.edgesOf(vertex)) {
                // Verificam daca nodul curent este sursa sau destinatia arcului
                Integer neighbor = graph.getEdgeSource(edge).equals(vertex) ? graph.getEdgeTarget(edge)
                        : graph.getEdgeSource(edge);
                // Adaugam elementele in lista
                neighbors.add(neighbor);
            }
            // Afisarea listei in ordine crescatoare
            neighbors.sort(Integer::compareTo);
            for (Integer neighbor : neighbors) {
                System.out.print(neighbor + " ");
            }
            // Afisam 0 la sfarsit
            System.out.print("0");
            System.out.println();
        }
    }
}
