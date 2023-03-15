package net.Brian_stars.rubymod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BrianRubyMod implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "rubymod";


	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);


	public static final Block RUBY_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0F,1200.0F).sounds(BlockSoundGroup.STONE).requiresTool());
	public static final Block RUBY_ORE = new Block(FabricBlockSettings.of(Material.STONE).strength(4.0F,1200.0F).sounds(BlockSoundGroup.STONE).requiresTool());


	public static final BlockItem RUBY_BLOCK_ITEM = new BlockItem(RUBY_BLOCK,new FabricItemSettings().group(ItemGroups.RUBY));
	public static final BlockItem RUBY_ORE_ITEM = new BlockItem(RUBY_ORE,new FabricItemSettings().group(ItemGroups.RUBY));

	public static final Item RUBY = new Item(new FabricItemSettings().group(ItemGroups.RUBY));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		Registry.register(Registry.ITEM,new Identifier(MOD_ID,"ruby"),RUBY);

		Registry.register(Registry.BLOCK,new Identifier(MOD_ID,"ruby_block"),RUBY_BLOCK);
		Registry.register(Registry.BLOCK,new Identifier(MOD_ID,"ruby_ore"),RUBY_ORE);

		Registry.register(Registry.ITEM,new Identifier(MOD_ID,"ruby_block"),RUBY_BLOCK_ITEM);
		Registry.register(Registry.ITEM,new Identifier(MOD_ID,"ruby_ore"),RUBY_ORE_ITEM);
	}
}