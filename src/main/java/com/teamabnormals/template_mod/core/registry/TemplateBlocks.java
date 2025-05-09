package com.teamabnormals.template_mod.core.registry;

import com.teamabnormals.blueprint.core.util.item.CreativeModeTabContentsPopulator;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import com.teamabnormals.template_mod.core.TemplateMod;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.registries.DeferredBlock;

public class TemplateBlocks {
	public static final BlockSubRegistryHelper BLOCKS = TemplateMod.REGISTRY_HELPER.getBlockSubHelper();

	public static final DeferredBlock<Block> TEMPLATE_BLOCK = BLOCKS.createBlock("template_block", () -> new Block(Block.Properties.ofFullCopy(Blocks.STONE)));

	public static void setupTabEditors() {
		CreativeModeTabContentsPopulator.mod(TemplateMod.MOD_ID);
	}
}
