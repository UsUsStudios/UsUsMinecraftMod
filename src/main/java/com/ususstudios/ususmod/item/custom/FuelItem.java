package com.ususstudios.ususmod.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

import javax.annotation.Nullable;

public class FuelItem extends Item {
	private final int burnTime;
	
	public FuelItem(Properties properties, int constructorBurnTime) {
		super(properties);
		this.burnTime = constructorBurnTime;
	}
	
	@Override
	public int getBurnTime(ItemStack itemStack, @Nullable RecipeType<?> recipeType) {
		return this.burnTime;
	}
}
