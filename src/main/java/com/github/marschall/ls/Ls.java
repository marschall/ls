package com.github.marschall.ls;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ls {

  public static void main(String[] args) throws IOException {
    Path parent;
    if (args.length > 0) {
      parent = Path.of(args[0]);
    } else {
      parent = Path.of(".");
    }
    try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(parent)) {
      for (Path child : directoryStream) {
        System.out.println(child.getFileName());
      }
    }
  }

}
