import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class DirectoryComposite implements FileComponent {
    private File directory;
    private List<FileComponent> underfile = new ArrayList<>();

    public DirectoryComposite(File directory) {
        this.directory = directory;
        for (File file : directory.listFiles()) {
            if (file.isDirectory()) {
                underfile.add(new DirectoryComposite(file));
            } else {
                underfile.add(new FileLeaf(file));
            }
        }
    }

    @Override
    public void display(String indent) {
        System.out.println(indent + directory.getName() + "/");
        for (FileComponent component : underfile) {
            component.display(indent + "    ");
        }
    }
}

