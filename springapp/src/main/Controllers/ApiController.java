import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Class1 {
	@GetMapping("welc")
	public String welcome()
	{
		return "Hello World";
	}
}
