package visitor;

import java.util.Iterator;

// データ構造を渡り歩きながら一覧を表示するためのクラス
public class ListVisitor extends Visitor {
  private String currentdir = "";

  @Override
  public void visit(File file) {
    System.out.println(currentdir + "/" + file);
  }

  @Override
  public void visit(Directory directory) {
    System.out.println(currentdir + "/" + directory);
    String saveDir = currentdir;
    currentdir = currentdir + "/" + directory.getName();
    Iterator<Directory> it = directory.iterator();
    while (it.hasNext()) {
      Entry entry = (Entry) it.next();
      entry.accept(this);
    }
    currentdir = saveDir;
  }
}
