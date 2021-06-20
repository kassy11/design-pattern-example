package problem.triple;

public class Triple {
  private int id;
  private static Triple[] triples = new Triple[] {new Triple(0), new Triple(1), new Triple(2)};

  private Triple(int id) {
    System.out.println("Triple created id =" + id);
    this.id = id;
  }

  public static Triple getInstance(int id) {
    return triples[id];
  }

  public String toString() {
    return "Triple id = " + id;
  }
}
