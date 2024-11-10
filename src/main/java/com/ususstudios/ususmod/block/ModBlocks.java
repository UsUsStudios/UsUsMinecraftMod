package com.ususstudios.ususmod.block;

import com.ususstudios.ususmod.block.custom.HematiteProcessor;
import net.minecraft.network.chat.Component;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;
import com.ususstudios.ususmod.UsUsMod;
import com.ususstudios.ususmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(UsUsMod.MOD_ID);
	
	public static final DeferredBlock<Block> HEMATITE_BLOCK = registerBlock("hematite_block",
			() -> new Block(BlockBehaviour.Properties.of()
					.strength(4f)
					.requiresCorrectToolForDrops()
					.sound(SoundType.DRIPSTONE_BLOCK)));
	
	public static final DeferredBlock<Block> HEMATITE_ORE = registerBlock("hematite_ore",
			() -> new DropExperienceBlock(UniformInt.of(2, 4),
					BlockBehaviour.Properties.of()
							.strength(3f)
							.requiresCorrectToolForDrops()
							.sound(SoundType.STONE)));
	
	public static final DeferredBlock<Block> HEMATITE_DEEPSLATE_ORE = registerBlock("hematite_deepslate_ore",
			() -> new DropExperienceBlock(UniformInt.of(2, 4),
					BlockBehaviour.Properties.of()
							.strength(4f)
							.requiresCorrectToolForDrops()
							.sound(SoundType.DEEPSLATE)
			));
	
	public static final DeferredBlock<Block> HEMATITE_PROCESSOR = registerBlock("hematite_processor",
			() -> new HematiteProcessor(BlockBehaviour.Properties.of()
							.strength(4f)
							.requiresCorrectToolForDrops()
							.sound(SoundType.NETHERRACK)
			) {
				@Override
				public void appendHoverText(ItemStack stack, Item.TooltipContext context, List<Component> tooltipComponents, TooltipFlag tooltipFlag) {
					tooltipComponents.add(Component.translatable("tooltips.ususminecraftmod.hematite_processor"));
					super.appendHoverText(stack, context, tooltipComponents, tooltipFlag);
				}
			});
	
	
	private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
		DeferredBlock<T> toReturn = BLOCKS.register(name, block);
		registerBlockItem(name, toReturn);
		return toReturn;
	}
	
	private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
		ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
	}
	
	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}
