import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Node {

	Node next;
	int data;

}

//TODO added lombok check if @Data is really needed or check if the parametrised constructor is needed