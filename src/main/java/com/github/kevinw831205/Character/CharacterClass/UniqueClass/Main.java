package com.github.kevinw831205.Character.CharacterClass.UniqueClass;

import com.github.kevinw831205.Character.StatsBuilder;

public class Main {
    public static void main(String[] args) {
        Commoner commoner = new CommonerBuilder()
                .setBaseStats(new StatsBuilder()
                        .setCharm(null)
                        .build())
                .build();
    }
}
