import java.io.File;

public class FileLeaf implements FileComponent {
    private File file;

    public FileLeaf(File file) {
        this.file = file;
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + file.getName());
    }
}

