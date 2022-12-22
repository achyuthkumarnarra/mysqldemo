package controller;

import com.mysql.demo.visitors;
import exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import repository.visitorsrepository;
import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/visitors")
public class visitorcontroller {

    @Autowired
    private visitorsrepository visitorsrepository;

    @GetMapping
    public List<visitors> getAllvisitors(){
        return visitorsrepository.findAll();
    }

    @PostMapping
    public visitors createvisitor(@RequestBody visitors visitor) {
        return visitorsrepository.save(visitor);
    }
    @GetMapping("{id}")
    public ResponseEntity<visitors> getEmployeeById(@PathVariable  long id){
        visitors visitor = visitorsrepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("visitor not exist with id:" + id));
        return ResponseEntity.ok(visitor);
    }
        @DeleteMapping("{id}")
    public ResponseEntity<HttpStatus> deleteEmployee(@PathVariable long id){

        visitors visitor = visitorsrepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("visitor not exist with id: " + id));

       visitorsrepository.delete(visitor);

        return new ResponseEntity<>(HttpStatus.NO_CONTENT);

    }
}
