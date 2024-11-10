package com.ususstudios.ususmod.datagen;

import com.ususstudios.ususmod.UsUsMod;
import com.ususstudios.ususmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStateProvider extends BlockStateProvider {
	public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
		super(output, UsUsMod.MOD_ID, exFileHelper);
	}
	
	@Override
	protected void registerStatesAndModels() {
		blockWithItem(ModBlocks.HEMATITE_BLOCK);
		blockWithItem(ModBlocks.HEMATITE_ORE);
		blockWithItem(ModBlocks.HEMATITE_DEEPSLATE_ORE);
		blockWithItem(ModBlocks.HEMATITE_PROCESSOR);
	}
	
	private void blockWithItem(DeferredBlock<?> deferredBlock) {
		simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
	}
}
