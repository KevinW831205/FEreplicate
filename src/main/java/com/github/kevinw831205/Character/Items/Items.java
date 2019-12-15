package com.github.kevinw831205.Character.Items;

import java.util.ArrayList;

public interface Items {
    ArrayList <HealingItem> HealingItems = new ArrayList<HealingItem>();
    ArrayList <PermanentStatBoosting> PermanentStatBoostingItems = new ArrayList<PermanentStatBoosting>();
    ArrayList <TemoraryStatBoosting> TemporaryStatBoostingItems = new ArrayList<TemoraryStatBoosting>();
    ArrayList <ClassChanging> ClassChangeItems = new ArrayList<ClassChanging>();
    ArrayList <Keys> Keys = new ArrayList<Keys>();
    ArrayList <OffensiveIem> OffensiveItems = new ArrayList<OffensiveIem>();
    ArrayList <AccessoryItem> AccessoryItems = new ArrayList<AccessoryItem>();
    ArrayList <Equipment> Equipment = new ArrayList<Equipment>();
    ArrayList <SkillTeaching> SkillTeachingItems = new ArrayList<SkillTeaching>();
    ArrayList <ValuableItem> ValuableItems = new ArrayList<ValuableItem>();
    ArrayList <Miscellaneous> MiscellaneousItems = new ArrayList<Miscellaneous>();
    ArrayList <NoEffectItem> NoEffectItems = new ArrayList<NoEffectItem>();

    public void getItems();
}
