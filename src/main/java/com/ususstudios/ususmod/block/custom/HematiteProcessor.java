package com.ususstudios.ususmod.block.custom;

import com.ususstudios.ususmod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class HematiteProcessor extends Block {
	public HematiteProcessor(Properties properties) {
		super(properties);
	}
	
	@Override
	protected InteractionResult useWithoutItem(BlockState state, Level level, BlockPos pos,
	                                           Player player, BlockHitResult hitResult) {
		level.playSound(player, pos, SoundEvents.NETHERRACK_PLACE, SoundSource.BLOCKS, 1f, 1f);
		
		return super.useWithoutItem(state, level, pos, player, hitResult);
	}
	
	@Override
	public void stepOn(Level level, BlockPos pos, BlockState state, Entity entity) {
		if (entity instanceof ItemEntity itemEntity) {
			if (itemEntity.getItem().getItem() == ModItems.RAW_HEMATITE.get()) {
				itemEntity.setItem(new ItemStack(ModItems.HEMATITE.get(), itemEntity.getItem().getCount()));
			}
		}
		
		super.stepOn(level, pos, state, entity);
	}
}
