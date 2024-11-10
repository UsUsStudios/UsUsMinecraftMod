package com.ususstudios.ususmod.datagen;

import com.ususstudios.ususmod.UsUsMod;
import com.ususstudios.ususmod.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
	public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider, UsUsMod.MOD_ID, existingFileHelper);
	}
	
	@Override
	protected void addTags(HolderLookup.Provider provider) {
		tag(BlockTags.MINEABLE_WITH_PICKAXE)
				.add(ModBlocks.HEMATITE_BLOCK.get())
				.add(ModBlocks.HEMATITE_DEEPSLATE_ORE.get())
				.add(ModBlocks.HEMATITE_ORE.get())
				.add(ModBlocks.HEMATITE_PROCESSOR.get());
		
		tag(BlockTags.NEEDS_DIAMOND_TOOL)
				.add(ModBlocks.HEMATITE_DEEPSLATE_ORE.get())
				.add(ModBlocks.HEMATITE_PROCESSOR.get());
	}
}
