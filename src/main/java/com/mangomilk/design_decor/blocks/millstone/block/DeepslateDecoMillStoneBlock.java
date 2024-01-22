package com.mangomilk.design_decor.blocks.millstone.block;

import com.mangomilk.design_decor.registry.CDDBlockEntities;
import com.simibubi.create.content.kinetics.millstone.MillstoneBlock;
import com.simibubi.create.content.kinetics.millstone.MillstoneBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class DeepslateDecoMillStoneBlock extends MillstoneBlock {
    public DeepslateDecoMillStoneBlock(Properties properties) {
        super(properties);
    }



    @Override
    public BlockEntityType<? extends MillstoneBlockEntity> getBlockEntityType() {
        return CDDBlockEntities.DEEPSLATE_MILLSTONE.get();
    }
}
