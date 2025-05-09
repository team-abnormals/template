package com.teamabnormals.template_mod.core;

import com.teamabnormals.blueprint.core.util.registry.RegistryHelper;
import com.teamabnormals.template_mod.core.registry.TemplateBlocks;
import com.teamabnormals.template_mod.core.registry.TemplateItems;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.neoforge.data.event.GatherDataEvent;

@Mod(TemplateMod.MOD_ID)
public class TemplateMod {
	public static final String MOD_ID = "template_mod";
	public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MOD_ID);

	public TemplateMod(net.neoforged.bus.api.IEventBus bus, ModContainer container) {
		TemplateBlocks.BLOCKS.register(bus);
		TemplateItems.ITEMS.register(bus);

		bus.addListener(this::commonSetup);
		bus.addListener(this::clientSetup);
		bus.addListener(this::dataSetup);
	}

	private void commonSetup(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {

		});
	}

	private void clientSetup(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			TemplateBlocks.setupTabEditors();
		});
	}

	private void dataSetup(GatherDataEvent event) {

	}
}