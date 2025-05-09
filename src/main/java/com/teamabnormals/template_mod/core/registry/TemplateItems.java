package com.teamabnormals.template_mod.core.registry;

import com.teamabnormals.blueprint.core.util.registry.ItemSubRegistryHelper;
import com.teamabnormals.template_mod.core.TemplateMod;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;

public class TemplateItems {
	public static final ItemSubRegistryHelper ITEMS = TemplateMod.REGISTRY_HELPER.getItemSubHelper();

	public static final DeferredItem<Item> TEMPLATE_ITEM = ITEMS.createItem("template_item", () -> new Item(new Item.Properties()));
}