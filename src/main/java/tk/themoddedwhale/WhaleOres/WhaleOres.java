package tk.themoddedwhale.WhaleOres;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

@Mod(modid = "ore", name = "WhaleOres", version = "v1.0.1a")
public class WhaleOres {
	public static Item circuitItem;
	public static Block circuitBlock;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		//Item/Block init and registering
		//Config handling
		circuitItem = new CircuitItem().setUnlocalizedName("CircuitItem").setTextureName("ore:circuititem");
		circuitBlock = new CircuitBlock(Material.cloth).setBlockName("CircuitBlock");
		
		
		
		GameRegistry.registerItem(circuitItem, circuitItem.getUnlocalizedName().substring(5));
		GameRegistry.registerBlock(circuitBlock, circuitBlock.getUnlocalizedName().substring(5));
		System.out.println(circuitBlock.getUnlocalizedName().substring(5));
	}
	@EventHandler
	public void Init(FMLInitializationEvent event) {
		//Proxy, TileENtity, entity and packet registering
	}
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
}