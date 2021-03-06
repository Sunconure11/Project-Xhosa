package com.stek101.projectzulu.common.dungeon.spawner.tag.keys;

import java.util.ArrayList;
import java.util.HashMap;

import net.minecraft.entity.EntityLiving;
import net.minecraft.world.World;

import com.stek101.projectzulu.common.dungeon.spawner.tag.OptionalParser;
import com.stek101.projectzulu.common.dungeon.spawner.tag.TypeValuePair;
import com.stek101.projectzulu.common.dungeon.spawner.tag.settings.OptionalSettings.Operand;

public class KeyParserMinHeight extends KeyParserBase {

    public KeyParserMinHeight(Key key) {
        super(key, false, KeyType.CHAINABLE);
    }

    @Override
    public boolean parseChainable(String parseable, ArrayList<TypeValuePair> parsedChainable,
            ArrayList<Operand> operandvalue) {
        String[] pieces = parseable.split(",");
        Operand operand = parseOperand(pieces);

        TypeValuePair typeValue = new TypeValuePair(key, OptionalParser.parseSingleInteger(pieces, 256, key.key));

        if (typeValue.getValue() != null) {
            parsedChainable.add(typeValue);
            operandvalue.add(operand);
            return true;
        }
        return false;
    }

    @Override
    public boolean parseValue(String parseable, HashMap<String, Object> valueCache) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isValidLocation(World world, EntityLiving entity, int xCoord, int yCoord, int zCoord,
            TypeValuePair typeValuePair, HashMap<String, Object> valueCache) {
        Integer minSpawnHeight = (Integer) typeValuePair.getValue();
        return yCoord < minSpawnHeight ? true : false;
    }
}