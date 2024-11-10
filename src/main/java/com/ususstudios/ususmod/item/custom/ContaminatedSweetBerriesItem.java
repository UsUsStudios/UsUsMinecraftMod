package com.ususstudios.ususmod.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class ContaminatedSweetBerriesItem extends Item {
	public ContaminatedSweetBerriesItem(Properties properties) {
		super(properties);
	}
	
	@Override
	public UseAnim getUseAnimation(ItemStack stack) {
		return UseAnim.EAT;
	}
}
