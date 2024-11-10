package com.ususstudios.ususmod.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoodProperties {
	public static final FoodProperties CONTAMINATED_BERRY_PROPERTIES = new FoodProperties.Builder()
			.nutrition(1)
			.saturationModifier(0.15f)
			.alwaysEdible()
			.effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 250), 0.8f)
			.build();
}
