# DSA Problems and Solutions

![LeetCode Stats](https://leetcard.jacoblin.cool/neo124?theme=dark&font=Niramit&ext=activity)

```Technologies
Java
Arrays
HashMap
Linked List
Stack
```

```java
@Service
public class DsaService {
  private final List<String> dataStructures = Arrays.asList(
    "Arrays", "Linked List", "Stack", "Queue", "HashMap",
          "Tree", "Graph");

  private final List<String> algorithms = Arrays.asList(
    "Binary Search", "DFS", "BFS", "Dijkstra", "Merge Sort",
            "Quick Sort", "Dynamic Programming");

  @Autowired
  private ProblemRepository problemRepo;

  public DsaProfile getProfile() {
    return DsaProfile.builder()
      .level("Intermediate")
      .focusAreas(Arrays.asList("Problem Solving", "Optimization", "Time Complexity"))
      .dataStructures(this.dataStructures)
      .algorithms(this.algorithms)
      .solvedProblems(problemRepo.countSolved())
      .build();
  }
}
```

