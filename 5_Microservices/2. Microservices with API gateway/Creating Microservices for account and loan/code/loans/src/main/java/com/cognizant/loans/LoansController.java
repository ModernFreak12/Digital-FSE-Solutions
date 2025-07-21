package com.cognizant.loans;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/loans")
public class LoansController {

    @GetMapping("/{number}")
    public String getLoans(@PathVariable String number){
        return "{ number : " + number + " type: \"car\", loan: 400000, " +
                "emi: 3258, tenure: 18 }";
    }
}
