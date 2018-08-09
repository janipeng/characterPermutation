package org.jani;

import org.junit.Test;

import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Collections.singletonList;
import static org.jani.CharacterPermutation.listPermutations;
import static org.junit.Assert.assertEquals;

public class CharacterPermutationTest {

    @Test
    public void return_a_when_given_one_character_a() {
        List<String> permutations = listPermutations("a");

        assertEquals(singletonList("a"), permutations);
    }

    @Test
    public void return_ab_ba_when_given_characters_ab() {
        List<String> permutations = listPermutations("ab");

        assertEquals(asList("ab", "ba"), permutations);
    }

    @Test
    public void return_abc_acb_bac_bca_cab_cba_when_given_abc() {
        List<String> permutations = listPermutations("abc");

        assertEquals(asList("abc", "acb", "bac", "bca", "cab", "cba"), permutations);
    }

    @Test
    public void return_an_array_list_size_is_24_when_given_abcd() {
        List<String> permutations = listPermutations("abcd");

        assertEquals(24, permutations.size());
    }
}