package com.github.technus.tectech.loader;

import com.github.technus.tectech.thing.CustomItemList;
import gregtech.api.enums.GT_Values;
import gregtech.api.enums.ItemList;
import gregtech.api.enums.Materials;
import gregtech.api.enums.OrePrefixes;
import gregtech.api.util.GT_OreDictUnificator;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.fluids.FluidStack;

/**
 * Created by Tec on 06.08.2017.
 */
public class DreamCraftRecipeLoader implements Runnable {
    @Override
    public void run() {
        Object[] o = new Object[0];
        //Dynamo Hatches UV-UIV
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{ItemList.Hatch_Dynamo_UV.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.NaquadahAlloy, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Osmium, 2)}, Materials.Silver.getMolten(1000), CustomItemList.eM_dynamomulti4_UV.get(1, o), 100, 122880);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{ItemList.Transformer_MAX_UV.get(1, o), CustomItemList.eM_dynamomulti4_UV.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt08, Materials.NaquadahAlloy, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Osmium, 4)}, Materials.Electrum.getMolten(1000), CustomItemList.eM_dynamomulti16_UV.get(1, o), 200, 122880);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{com.dreammaster.gthandler.CustomItemList.WetTransformer_UHV_UV.get(1, o), CustomItemList.eM_dynamomulti16_UV.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt12, Materials.NaquadahAlloy, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Osmium, 6)}, Materials.Tungsten.getMolten(1000), CustomItemList.eM_dynamomulti64_UV.get(1, o), 400, 122880);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{ItemList.Hatch_Dynamo_MAX.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.Superconductor, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Neutronium, 2)}, Materials.Silver.getMolten(2000), CustomItemList.eM_dynamomulti4_UHV.get(1, o), 100, 500000);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{com.dreammaster.gthandler.CustomItemList.Transformer_UEV_UHV.get(1, o), CustomItemList.eM_dynamomulti4_UHV.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt08, Materials.Superconductor, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Neutronium, 4)}, Materials.Electrum.getMolten(2000), CustomItemList.eM_dynamomulti16_UHV.get(1, o), 200, 500000);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{com.dreammaster.gthandler.CustomItemList.WetTransformer_UEV_UHV.get(1, o), CustomItemList.eM_dynamomulti16_UHV.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt12, Materials.Superconductor, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Neutronium, 6)}, Materials.Tungsten.getMolten(2000), CustomItemList.eM_dynamomulti64_UHV.get(1, o), 400, 500000);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{com.dreammaster.gthandler.CustomItemList.Hatch_Dynamo_UEV.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.Draconium, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Bedrockium, 2)}, Materials.Silver.getMolten(4000), CustomItemList.eM_dynamomulti4_UEV.get(1, o), 100, 2000000);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{com.dreammaster.gthandler.CustomItemList.Transformer_UIV_UEV.get(1, o), CustomItemList.eM_dynamomulti4_UEV.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt08, Materials.Draconium, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Bedrockium, 4)}, Materials.Electrum.getMolten(4000), CustomItemList.eM_dynamomulti16_UEV.get(1, o), 200, 2000000);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{com.dreammaster.gthandler.CustomItemList.WetTransformer_UIV_UEV.get(1, o), CustomItemList.eM_dynamomulti16_UEV.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt12, Materials.Draconium, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Bedrockium, 6)}, Materials.Tungsten.getMolten(4000), CustomItemList.eM_dynamomulti64_UEV.get(1, o), 400, 2000000);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{com.dreammaster.gthandler.CustomItemList.Hatch_Dynamo_UIV.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.NetherStar, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.BlackPlutonium, 2)}, Materials.Silver.getMolten(8000), CustomItemList.eM_dynamomulti4_UIV.get(1, o), 100, 8000000);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{com.dreammaster.gthandler.CustomItemList.Transformer_UMV_UIV.get(1, o), CustomItemList.eM_dynamomulti4_UIV.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt08, Materials.NetherStar, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.BlackPlutonium, 4)}, Materials.Electrum.getMolten(8000), CustomItemList.eM_dynamomulti16_UIV.get(1, o), 200, 8000000);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{com.dreammaster.gthandler.CustomItemList.WetTransformer_UMV_UIV.get(1, o), CustomItemList.eM_dynamomulti16_UIV.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt12, Materials.NetherStar, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.BlackPlutonium, 6)}, Materials.Tungsten.getMolten(8000), CustomItemList.eM_dynamomulti64_UIV.get(1, o), 400, 8000000);
        //Energy Hatches  UV-UIV
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{ItemList.Hatch_Energy_UV.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.NaquadahAlloy, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Osmium, 2)}, Materials.Silver.getMolten(1000), CustomItemList.eM_energymulti4_UV.get(1, o), 100, 122880);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{ItemList.Transformer_MAX_UV.get(1, o), CustomItemList.eM_energymulti4_UV.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt08, Materials.NaquadahAlloy, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Osmium, 4)}, Materials.Electrum.getMolten(1000), CustomItemList.eM_energymulti16_UV.get(1, o), 200, 122880);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{com.dreammaster.gthandler.CustomItemList.WetTransformer_UHV_UV.get(1, o), CustomItemList.eM_energymulti16_UV.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt12, Materials.NaquadahAlloy, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Osmium, 6)}, Materials.Tungsten.getMolten(1000), CustomItemList.eM_energymulti64_UV.get(1, o), 400, 122880);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{ItemList.Hatch_Energy_MAX.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.Superconductor, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Neutronium, 2)}, Materials.Silver.getMolten(2000), CustomItemList.eM_energymulti4_UHV.get(1, o), 100, 500000);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{com.dreammaster.gthandler.CustomItemList.Transformer_UEV_UHV.get(1, o), CustomItemList.eM_energymulti4_UHV.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt08, Materials.Superconductor, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Neutronium, 4)}, Materials.Electrum.getMolten(2000), CustomItemList.eM_energymulti16_UHV.get(1, o), 200, 500000);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{com.dreammaster.gthandler.CustomItemList.WetTransformer_UEV_UHV.get(1, o), CustomItemList.eM_energymulti16_UHV.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt12, Materials.Superconductor, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Neutronium, 6)}, Materials.Tungsten.getMolten(2000), CustomItemList.eM_energymulti64_UHV.get(1, o), 400, 500000);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{com.dreammaster.gthandler.CustomItemList.Hatch_Energy_UEV.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.Draconium, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Bedrockium, 2)}, Materials.Silver.getMolten(4000), CustomItemList.eM_energymulti4_UEV.get(1, o), 100, 2000000);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{com.dreammaster.gthandler.CustomItemList.Transformer_UIV_UEV.get(1, o), CustomItemList.eM_energymulti4_UHV.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt08, Materials.Draconium, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Bedrockium, 4)}, Materials.Electrum.getMolten(4000), CustomItemList.eM_energymulti16_UEV.get(1, o), 200, 2000000);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{com.dreammaster.gthandler.CustomItemList.WetTransformer_UIV_UEV.get(1, o), CustomItemList.eM_energymulti16_UHV.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt12, Materials.Draconium, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.Bedrockium, 6)}, Materials.Tungsten.getMolten(4000), CustomItemList.eM_energymulti64_UEV.get(1, o), 400, 2000000);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{com.dreammaster.gthandler.CustomItemList.Hatch_Energy_UIV.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt04, Materials.NetherStar, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.BlackPlutonium, 2)}, Materials.Silver.getMolten(8000), CustomItemList.eM_energymulti4_UIV.get(1, o), 100, 8000000);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{com.dreammaster.gthandler.CustomItemList.Transformer_UMV_UIV.get(1, o), CustomItemList.eM_energymulti4_UIV.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt08, Materials.NetherStar, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.BlackPlutonium, 4)}, Materials.Electrum.getMolten(8000), CustomItemList.eM_energymulti16_UIV.get(1, o), 200, 8000000);
        GT_Values.RA.addAssemblerRecipe(new ItemStack[]{com.dreammaster.gthandler.CustomItemList.WetTransformer_UMV_UIV.get(1, o), CustomItemList.eM_energymulti16_UIV.get(1, o), GT_OreDictUnificator.get(OrePrefixes.wireGt12, Materials.NetherStar, 2), GT_OreDictUnificator.get(OrePrefixes.plate, Materials.BlackPlutonium, 6)}, Materials.Tungsten.getMolten(8000), CustomItemList.eM_energymulti64_UIV.get(1, o), 400, 8000000);

        //Research Station
        GT_Values.RA.addAssemblylineRecipe(com.dreammaster.gthandler.CustomItemList.ScannerZPM.get(1), 144000, new ItemStack[]{
                ItemList.Hull_ZPM.get(1),
                ItemList.Emitter_ZPM.get(8),
                ItemList.Sensor_ZPM.get(8),
                ItemList.Circuit_Crystalmainframe.get(4),
                ItemList.Field_Generator_ZPM.get(1),
                ItemList.Electric_Motor_ZPM.get(2),
                GT_OreDictUnificator.get(OrePrefixes.cableGt02, Materials.Naquadah, 4),
                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Naquadah, 32),
        }, new FluidStack[]{
                Materials.Tungsten.getMolten(2000),
                Materials.UUMatter.getFluid(1000),
                new FluidStack(FluidRegistry.getFluid("ic2coolant"), 2000)
        }, CustomItemList.Machine_Multi_Research.get(1), 12000, 100000);

        //Oject Holder
        GT_Values.RA.addAssemblylineRecipe(ItemList.Hatch_Input_Bus_ZPM.get(1), 72000, new ItemStack[]{
                ItemList.Hatch_Input_Bus_ZPM.get(1),
                ItemList.Robot_Arm_ZPM.get(2),
                ItemList.Electric_Motor_ZPM.get(2),
                ItemList.Circuit_Crystalmainframe.get(2),
                GT_OreDictUnificator.get(OrePrefixes.cableGt02, Materials.Naquadah, 2),
                GT_OreDictUnificator.get(OrePrefixes.wireFine, Materials.Naquadah, 16),
        }, new FluidStack[]{
                Materials.Tungsten.getMolten(1000),
                Materials.UUMatter.getFluid(500),
                new FluidStack(FluidRegistry.getFluid("ic2coolant"), 1000)
        }, CustomItemList.holder_Hatch.get(1), 1200, 100000);
    }
}
