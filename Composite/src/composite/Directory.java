package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Directory extends Entry {
  private final String name;
  private final List<Entry> directory = new ArrayList<>();

  public Directory(String name) {
    this.name = name;
  }

  @Override
  public String getName() {
    return name;
  }

  // ファイルとディレクトリを同一視して再帰的呼び出しを行うことで、
  // ディレクトリ下のサイズを求めている
  @Override
  public int getSize() {
    int size = 0;
    Iterator it = directory.iterator();
    while (it.hasNext()) {
      Entry entry = (Entry) it.next();
      size += entry.getSize();
    }
    return size;
  }

  public void add(Entry entry) {
    directory.add(entry);
  }

  // ファイルとディレクトリを同一視して再帰的呼び出し
  @Override
  protected void printList(String prefix) {
    System.out.println(prefix + "/" + this);
    Iterator it = directory.iterator();
    while (it.hasNext()) {
      Entry entry = (Entry) it.next();
      entry.printList(prefix + "/" + name);
    }
  }
}
