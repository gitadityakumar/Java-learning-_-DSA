import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExplorer {

    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");
        Path root = Paths.get(currentDirectory);

        try {
            exploreDirectory(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void exploreDirectory(Path path) throws IOException {
        try (var stream = Files.newDirectoryStream(path)) {
            for (Path entry : stream) {
                if (entry.getFileName().toString().equals("..")) {
                    Path parentDirectory = path.getParent();
                    if (parentDirectory != null) {
                        System.out.println("Moving up to: " + parentDirectory.toAbsolutePath());
                        exploreDirectory(parentDirectory);
                    }
                } else {
                    System.out.println(entry.toAbsolutePath());
                    if (Files.isDirectory(entry)) {
                        exploreDirectory(entry);
                    }
                }
            }
        }
    }
}
