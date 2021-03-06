package com.stek101.projectzulu.common.dungeon.spawner.tag.keys;

import java.util.ArrayList;
import java.util.HashMap;

import net.minecraft.entity.EntityLiving;
import net.minecraft.world.World;

import com.stek101.projectzulu.common.core.ProjectZuluLog;
import com.stek101.projectzulu.common.dungeon.spawner.tag.TypeValuePair;
import com.stek101.projectzulu.common.dungeon.spawner.tag.settings.OptionalSettings.Operand;

public class KeyParserTop extends KeyParserBase {

    public KeyParserTop(Key key) {
        super(key, true, KeyType.CHAINABLE);
    }

    @Override
    public boolean parseChainable(String parseable, ArrayList<TypeValuePair> parsedChainable,
            ArrayList<Operand> operandvalue) {
        String[] pieces = parseable.split(",");
        Operand operand = parseOperand(pieces);
        if (pieces.length == 1) {
            parsedChainable.add(new TypeValuePair(key, isInverted(parseable)));
            operandvalue.add(operand);
            return true;
        } else {
            ProjectZuluLog.severe("Error Parsing Needs %s parameter. Invalid Argument Length.", key.key);
            return false;
        }
    }

    @Override
    public boolean parseValue(String parseable, HashMap<String, Object> valueCache) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isValidLocation(World world, EntityLiving entity, int xCoord, int yCoord, int zCoord,
            TypeValuePair typeValuePair, HashMap<String, Object> valueCache) {
        boolean isInverted = (Boolean) typeValuePair.getValue();
        boolean isTopBlock = world.getBiomeGenForCoords(xCoord, zCoord).topBlock == world.getBlock(xCoord, yCoord - 1,
                zCoord);
        return isInverted ? isTopBlock : !isTopBlock;
    }
}