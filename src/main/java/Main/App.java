package Main;

import Entity.Product;
import com.demo.examples.LevenshteinDistanceExample;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        /*
        Spell check or abbrivation match algorithms
        Apache commons implementation
        Levenshtein distance
        Damerau–Levenshtein distance
        Longest common subsequence
        Hamming distance

        SecondString library implementation - https://github.com/TeamCohen/secondstring
        Jaro distance
        Jaro Winkler
        Needleman Wunsch

            Phonetic based algorithms - implementation org.apache.commons.codec.language.Metaphone
            MetaPhone
            Double MetaPhone
            Soundex
            Refined Soundex
         */

        // TODO : Use Case: Ideal for spell checkers and detecting simple typos.
        LevenshteinDistanceExample l1 = new LevenshteinDistanceExample();
        List<Product> result = l1.findFuzzyProducts("SHome");
        for(Product p : result) {
            System.out.println(p.getName());
        }
    }
}
