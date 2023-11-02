import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        
        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);

        Map<String, Long> map = br.lines()
            .map(line -> line.split(","))
            .map(line -> line[11])
            .skip(1)
            .collect(Collectors.groupingBy(pub -> pub, Collectors.counting()))
            ;

        System.out.println(map);

        /////////////////////////////////////

        // List<String> list = new ArrayList<>();
        // String line;
        // while ((line = br.readLine()) != null) {
        //     String[] lines = line.split(",");
        //     list.add(lines[11]);
        // }
        
        // Map<String, Long> result = list.stream()
        //     .collect(Collectors.groupingBy(
        //         Function.identity(), Collectors.counting()
        //     ));
        
        // System.out.println(result);

        ////////////////////////////////////
        
        // List<String> list = new ArrayList<>();
        // String line;
        // while ((line = br.readLine()) != null) {
        //     line = br.readLine().trim();
        //     String[] lines = line.split(",");
        //     list.add(lines[11]);
        // }

        // Map<String, Long> map = list.stream()
        //     .collect(Collectors.groupingBy(w -> w, Collectors.counting()))
        //     ;

        // System.out.println(map);
    }
}