package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        // Given
        User janusz = new YGeneration("Janusz Kowalski");
        User seba = new Millenials("Sebastian Nowak");
        User brajan = new ZGeneration("Brajan Iksiński");

        // When
        String januszPost = janusz.sharePost();
        System.out.println("Janusz publishes: " + januszPost);
        String sebaPost = seba.sharePost();
        System.out.println("Seba publishes: " + sebaPost);
        String brajanPost = brajan.sharePost();
        System.out.println("Brajan publishes: " + brajanPost);

        // Then
        Assert.assertEquals("[Twitter publisher] Publishing on Twitter", januszPost);
        Assert.assertEquals("[Facebook publisher] Publishing on Facebook", sebaPost);
        Assert.assertEquals("[Snapchat publisher] Publishing on Snapchat", brajanPost);

    }

    @Test
    public void testIndividualSharingStrategies() {
        // Given
        User janusz = new YGeneration("Janusz Kowalski");

        // When
        String januszPost = janusz.sharePost();
        System.out.println("Janusz publishes: " + januszPost);
        janusz.setSocialPublisher(new SnapchatPublisher());
        januszPost = janusz.sharePost();
        System.out.println("Janusz now publishes: " + januszPost);

        // Then
        Assert.assertEquals("[Snapchat publisher] Publishing on Snapchat", januszPost);
    }
}
