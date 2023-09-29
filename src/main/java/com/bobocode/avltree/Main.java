package com.bobocode.avltree;

import com.bobocode.avltree.printer.WindowPrinter;
import com.bobocode.avltree.printer.Printer;

public class Main {

  public static void main(String[] args) {
    AVLTree avlTree = new AVLTree();
    avlTree.insert(1);
    avlTree.insert(2);
    avlTree.insert(3);

    Printer printer = new WindowPrinter();
    printer.print(avlTree.root);
  }
}