package com.ususstudios.ususmod.datagen;

import com.ususstudios.ususmod.UsUsMod;
import com.ususstudios.ususmod.item.ModItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
	public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
		super(output, UsUsMod.MOD_ID, existingFileHelper);
	}
	
	@Override
	protected void registerModels() {
		basicItem(ModItems.HEMATITE.get());
		basicItem(ModItems.RAW_HEMATITE.get());
		basicItem(ModItems.CONTAMINATED_SWEET_BERRIES.get());
		basicItem(ModItems.HEMATITE_CHISEL.get());
		basicItem(ModItems.STARLIGHT_ASHES.get());
	}
}
