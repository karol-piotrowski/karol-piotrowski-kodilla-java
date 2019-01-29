package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("SESAME")
                .burgers(3)
                .ingredient(Bigmac.CHEESE)
                .ingredient(Bigmac.CHILLI_PEPPERS)
                .ingredient(Bigmac.CUCUMBER)
                .sauce(Bigmac.BARBECUE)
                .ingredient(Bigmac.BACON)
                .build();
        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals(Bigmac.BARBECUE, bigmac.getSauce());
        Assert.assertEquals(3, bigmac.getBurgers());
        Assert.assertEquals("SESAME", bigmac.getBun());
    }

}
