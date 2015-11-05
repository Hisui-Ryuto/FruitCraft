package evo.fruitcraft.Recipes;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import evo.fruitcraft.blocks.FCBOreOrange;
import evo.fruitcraft.foods.FCFCuttedOrange;
import evo.fruitcraft.foods.FCFOrangeWhole;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class FCROrange{
	@EventHandler
	public void Init(FMLInitializationEvent event){
		//Recipe for Orange from the Ore
	    GameRegistry.addShapelessRecipe(new ItemStack(FCFOrangeWhole.FCFOrangeWhole),
			    new ItemStack(FCBOreOrange.FCBOreOrange), Items.water_bucket);
	    //Recipe for when you can't find any oranges
		GameRegistry.addShapelessRecipe(new ItemStack(FCFOrangeWhole.FCFOrangeWhole),
				new ItemStack(Items.dye,1,14), Items.apple);
		//Recipe for cutting orange
		GameRegistry.addShapelessRecipe(new ItemStack(FCFCuttedOrange.FCFCuttedOrange,4));

	}
}