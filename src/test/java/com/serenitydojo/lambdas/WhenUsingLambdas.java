package test.java.com.serenitydojo.lambdas;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class WhenUsingLambdas {
    @Test
    public void printColors(){
        List<String> colors = Arrays.asList("red", "green", "blue");

        colors.forEach(
                //different ways to state how to print the colors array
                //c -> printColorOf(c)
                c -> System.out.println("COLOR: " + c)
                //this::printColorOf
        );
//        for(String color : colors){
//            printColorOf(color);
//        }
    }

//    public void printColorOf(String color){
//        System.out.println("COLOR: " + color);
//    }

    @Test
    public void filteringColors(){
        List<String> colors = Arrays.asList("gritty-white", "red", "green", "blue", "grey", "grey-blue" );
        //List<String> filteredColors = colors.stream()
        Optional<Integer> minLength = colors.stream()
                .filter(color -> color.startsWith("g"))
                .map(String::length)
                //.map(color -> color.toUpperCase())
                .sorted()
                .findFirst();
        minLength.ifPresent(
                length -> System.out.println(length)
        );

        //System.out.println(minLength.orElseGet(()->0));
                //.collect(Collectors.toList());

                /*System.out.println(filteredColors);
//                .forEach(
//                        color -> System.out.println(color)
//                )*/
    }
}
