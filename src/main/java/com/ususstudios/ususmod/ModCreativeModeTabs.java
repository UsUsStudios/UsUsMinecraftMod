package com.ususstudios.ususmod;

import com.ususstudios.ususmod.block.ModBlocks;
import com.ususstudios.ususmod.item.ModItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
			DeferredRegister.create(Registries.CREATIVE_MODE_TAB, UsUsMod.MOD_ID);
	
	public static final Supplier<CreativeModeTab> BISMUTH_ITEMS_TAB = CREATIVE_MODE_TAB.register("bismuth_items_tab",
			() -> CreativeModeTab.builder()
					.icon(() -> new ItemStack(ModItems.BISMUTH.get()))
					.title(Component.translatable("creativetab.ususminecraftmod.bismuth_items"))
					.displayItems((itemDisplayParameters, output) -> {
						output.accept(ModItems.BISMUTH);
						output.accept(ModItems.RAW_BISMUTH);
						output.accept(ModItems.CHISEL);
						output.accept(ModBlocks.BISMUTH_BLOCK);
						output.accept(ModBlocks.BISMUTH_ORE);
						output.accept(ModBlocks.BISMUTH_DEEPSLATE_ORE);
						output.accept(ModBlocks.MAGIC_BLOCK);
					}).build());
	
	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TAB.register(eventBus);
	}
}
