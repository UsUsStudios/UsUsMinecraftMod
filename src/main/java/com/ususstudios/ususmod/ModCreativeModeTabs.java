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
	
	public static final Supplier<CreativeModeTab> HEMATITE_ITEMS_TAB = CREATIVE_MODE_TAB.register("hematite_items_tab",
			() -> CreativeModeTab.builder()
					.icon(() -> new ItemStack(ModItems.HEMATITE.get()))
					.title(Component.translatable("creativetab.ususminecraftmod.hematite_items"))
					.displayItems((itemDisplayParameters, output) -> {
						output.accept(ModItems.HEMATITE);
						output.accept(ModItems.RAW_HEMATITE);
						output.accept(ModItems.HEMATITE_CHISEL);
						output.accept(ModItems.CONTAMINATED_SWEET_BERRIES);
						output.accept(ModBlocks.HEMATITE_BLOCK);
						output.accept(ModBlocks.HEMATITE_ORE);
						output.accept(ModBlocks.HEMATITE_DEEPSLATE_ORE);
						output.accept(ModBlocks.HEMATITE_PROCESSOR);
					}).build());
	
	public static void register(IEventBus eventBus) {
		CREATIVE_MODE_TAB.register(eventBus);
	}
}
