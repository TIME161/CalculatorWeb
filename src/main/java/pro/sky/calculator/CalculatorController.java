package pro.sky.calculator;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pro.sky.calculator.exception.CalculatorException;


@RestController
@RequestMapping("/calculator")
public class CalculatorController {
    CalculatorServices services = new CalculatorServices();

   @ExceptionHandler(CalculatorException.class)
   public ResponseEntity<?> handleCalculatorException(CalculatorException e) {
       return ResponseEntity.status(e.getErrorCode()).body(e.getMessage());
   }


    @RequestMapping()
    public String welcomePage() {
        return "Добро пожаловать в калькулятор";
    }

    @RequestMapping("/plus")
    public String plus(@RequestParam("value1") Integer num1, @RequestParam("value2") Integer num2) {
        return services.calcPlus(num1, num2);
    }

    @RequestMapping("/minus")
    public String minus(@RequestParam("value1") Integer num1, @RequestParam("value2") Integer num2) {
        return services.calcMinus(num1, num2);
    }

    @RequestMapping("/multiply")
    public String multiply(@RequestParam("value1") Integer num1, @RequestParam("value2") Integer num2) {
        return services.calcMultiply(num1, num2);
    }

    @RequestMapping("/devide")
    public String devide(@RequestParam("value1") Integer num1, @RequestParam("value2") Integer num2) {
        return services.calcDevide(num1, num2);
    }
}