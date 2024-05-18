import java.io.File;

public class FileSystemTree {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Usage: java FileSystemTree <directory-path>");
            System.exit(1);
        }

        File rootDir = new File(args[0]);
        if (!rootDir.isDirectory()) {
            System.out.println("The provided path is not a directory.");
            System.exit(1);
        }

        DirectoryComposite root = new DirectoryComposite(rootDir);
        root.display("");
    }
}

