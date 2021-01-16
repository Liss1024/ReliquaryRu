package relics;

import basemod.abstracts.CustomRelic;
import com.badlogic.gdx.graphics.Texture;
import com.megacrit.cardcrawl.actions.AbstractGameAction;
import com.megacrit.cardcrawl.actions.defect.DamageAllButOneEnemyAction;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.DamageInfo;
import com.megacrit.cardcrawl.core.AbstractCreature;
import com.megacrit.cardcrawl.dungeons.AbstractDungeon;
import com.megacrit.cardcrawl.monsters.AbstractMonster;
import com.megacrit.cardcrawl.relics.AbstractRelic;
import util.TextureLoader;

public class RelicFirecrackers extends CustomRelic {
    public static final String ID = "reliquary:Firecrackers";
    private static final Texture IMG = TextureLoader.getTexture("reliquaryAssets/images/firecrackers.png");
    private static final Texture OUTLINE  = TextureLoader.getTexture("reliquaryAssets/images/outlines/firecrackers.png");

    public RelicFirecrackers() {
        super(ID, IMG, OUTLINE, RelicTier.UNCOMMON, LandingSound.FLAT);
    }

    @Override
    public void onAttack(DamageInfo info, int damageAmount, AbstractCreature target) {
        if (AbstractDungeon.getCurrRoom().monsters.monsters.size() <= 1)
            return;
        int overkill = damageAmount - target.currentHealth;
        if (overkill <= 0)
            return;
        addToBot(new DamageAllButOneEnemyAction(
                AbstractDungeon.player,
                target,
                DamageInfo.createDamageMatrix(overkill, true),
                DamageInfo.DamageType.THORNS,
                AbstractGameAction.AttackEffect.SLASH_HORIZONTAL,
                true
        ));
        flash();
    }

    @Override
    public String getUpdatedDescription() {
        return DESCRIPTIONS[0];
    }
    @Override
    public AbstractRelic makeCopy()
    {
        return new RelicFirecrackers();
    }
}
