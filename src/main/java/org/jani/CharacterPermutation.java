package org.jani;

import java.util.ArrayList;
import java.util.List;

import static java.util.Collections.singletonList;

class CharacterPermutation {

    static List<String> listPermutations(String input) {
        if (input.length() == 1) {
            return singletonList(input);
        }

        List<String> permutations = new ArrayList<String>();
        for (int index = 0; index < input.length(); index++) {
            for (String permutation : listPermutations(subtractOneCharByIndex(input, index))) {
                permutations.add(input.charAt(index) + permutation);
            }
        }
        return permutations;
    }

    private static String subtractOneCharByIndex(String input, int index) {
        return input.substring(0, index) + input.substring(index + 1);
    }
}
