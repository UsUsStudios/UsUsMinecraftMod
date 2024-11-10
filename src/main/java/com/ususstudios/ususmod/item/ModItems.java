package com.ususstudios.ususmod.item;

import com.ususstudios.ususmod.UsUsMod;
import com.ususstudios.ususmod.item.custom.ChiselItem;
import com.ususstudios.ususmod.item.custom.FuelItem;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;

public class ModItems {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(UsUsMod.MOD_ID);
	
	public static final DeferredItem<Item> HEMATITE = ITEMS.register("hematite",
			() -> new Item(new Item.Properties()) {
				@Override
				public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
					tooltipComponents.add(Component.translatable("tooltips.ususminecraftmod.hematite"));
					super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
				}
			});
	
	public static final DeferredItem<Item> RAW_HEMATITE = ITEMS.register("raw_hematite",
			() -> new Item(new Item.Properties()) {
				@Override
				public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
					tooltipComponents.add(Component.translatable("tooltips.ususminecraftmod.raw_hematite"));
					super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
				}
			});
	
	public static final DeferredItem<Item> HEMATITE_CHISEL = ITEMS.register("hematite_chisel",
			() -> new ChiselItem(new Item.Properties().durability(32)));
	
	public static final DeferredItem<Item> CONTAMINATED_SWEET_BERRIES = ITEMS.register("contaminated_sweet_berries",
			() -> new Item(new Item.Properties().food(ModFoodProperties.CONTAMINATED_BERRY_PROPERTIES)) {
				@Override
				public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
					tooltipComponents.add(Component.translatable("tooltips.ususminecraftmod.contaminated_sweet_berries"));
					super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
				}
			});
	
	public static final DeferredItem<Item> STARLIGHT_ASHES = ITEMS.register("starlight_ashes",
			() -> new FuelItem(new Item.Properties(), 800) {
				@Override
				public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
					tooltipComponents.add(Component.translatable("tooltips.ususminecraftmod.starlight_ashes"));
					super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
				}
			});
	
	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
	}
}
