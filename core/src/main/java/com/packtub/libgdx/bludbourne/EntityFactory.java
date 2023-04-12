package com.packtub.libgdx.bludbourne;
import com.badlogic.gdx.utils.Json;

public class EntityFactory {

    private static Json _json = new Json();

    public static enum EntityType {
        PLAYER, DEMO_PLAYER, NPC
    }

    public static String PLAYER_CONFIG = "scripts/player.json";

    static public Entity2 getEntity(EntityType entityType) {
        Entity2 entity = null;
        switch (entityType) {
            case PLAYER:
                entity = new Entity2(
                    new PlayerInputComponent(),
                    new PlayerPhysicsComponent(),
                    new PlayerGraphicsComponent());
                entity.setEntityConfig(
                    Entity2.getEntityConfig(
                        EntityFactory.PLAYER_CONFIG));
                entity.sendMessage(
                    Component.MESSAGE.LOAD_ANIMATIONS,
                    _json.toJson(entity.getEntityConfig()));
                return entity;
            case DEMO_PLAYER:
                entity = new Entity2(new NPCInputComponent(),
                    new PlayerPhysicsComponent(),
                    new PlayerGraphicsComponent());
                return entity;
            case NPC:
                entity = new Entity2(
                    new NPCInputComponent(),new NPCPhysicsComponent(),                    new NPCGraphicsComponent());                return entity;            default:                return null;
        }
    }
}




