package relics;

import com.badlogic.gdx.graphics.Texture;
import com.megacrit.cardcrawl.cards.AbstractCard;
import com.megacrit.cardcrawl.cards.blue.*;
import com.megacrit.cardcrawl.relics.AbstractRelic;
import com.sun.org.apache.xpath.internal.operations.Mult;
import util.ReliquaryLogger;
import util.TextureLoader;

import java.lang.reflect.Method;

public class RelicRabbitEars extends RelicSolitaireBase {
    public static final String ID = "reliquary:RabbitEars";
    private static final Texture IMG = TextureLoader.getTexture("reliquaryAssets/images/relics/rabbitEars.png");
    private static final Texture OUTLINE  = TextureLoader.getTexture("reliquaryAssets/images/relics/outline/rabbitEars.png");

    private final static int DESC_INDEX_AGGREGATE = 1;
    private final static int DESC_INDEX_BARRAGE = 2;
    private final static int DESC_INDEX_BIASED_COGNITION = 3;
    private final static int DESC_INDEX_BOOT_SEQUENCE = 4;
    private final static int DESC_INDEX_CHARGE_BATTERY = 5;
    private final static int DESC_INDEX_CHILL = 6;
    private final static int DESC_INDEX_COLD_SNAP = 7;
    private final static int DESC_INDEX_CREATIVE_AI = 8;
    private final static int DESC_INDEX_DARKNESS = 9;
    private final static int DESC_INDEX_DOUBLE_ENERGY = 10;
    private final static int DESC_INDEX_DUALCAST = 11;
    private final static int DESC_INDEX_ECHO_FORM = 12;
    private final static int DESC_INDEX_ELECTRODYNAMICS = 13;
    private final static int DESC_INDEX_FISSION = 14;
    private final static int DESC_INDEX_FUSION = 15;
    private final static int DESC_INDEX_GO_FOR_THE_EYES = 16;
    private final static int DESC_INDEX_HEATSINKS = 17;
    private final static int DESC_INDEX_HELLO_WORLD = 18;
    private final static int DESC_INDEX_HOLOGRAM = 19;
    private final static int DESC_INDEX_LOCK_ON = 20;
    private final static int DESC_INDEX_MELTER = 21;
    private final static int DESC_INDEX_METEOR_STRIKE = 22;
    private final static int DESC_INDEX_MULTICAST = 23;
    private final static int DESC_INDEX_RAINBOW = 24;

    public RelicRabbitEars() {
        super(ID, IMG, OUTLINE, RelicTier.BOSS, LandingSound.CLINK);
    }

    @SuppressWarnings("DuplicateBranchesInSwitch")
    public void upgradeCard(AbstractCard card) {
        flash();
        try {
            Method upgradeName = AbstractCard.class.getDeclaredMethod("upgradeName");
            upgradeName.setAccessible(true);
            upgradeName.invoke(card);
        } catch (Exception e) {
            ReliquaryLogger.error("RelicRabbitEars failed to call upgradeName().");
        }
        switch (card.cardID) {
            case Aggregate.ID:
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_AGGREGATE];
                break;
            case AllForOne.ID:
                card.baseDamage += 5;
                break;
            case Amplify.ID:
                card.baseMagicNumber += 1;
                card.magicNumber += 1;
                break;
            case AutoShields.ID:
                card.baseBlock += 4;
                break;
            case BallLightning.ID:
                card.baseMagicNumber += 1;
                card.magicNumber += 1;
                break;
            case Barrage.ID:
                card.baseMagicNumber = 10;
                card.magicNumber = 10;
                card.upgradedMagicNumber = true;
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_BARRAGE];
                break;
            case BeamCell.ID:
                card.baseDamage += 1;
                card.baseMagicNumber += 1;
                card.magicNumber += 1;
                break;
            case BiasedCognition.ID:
                card.baseMagicNumber += 1;
                card.magicNumber += 1;
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_BIASED_COGNITION];
                break;
            case Blizzard.ID:
                card.baseMagicNumber += 1;
                card.magicNumber += 1;
                break;
            case BootSequence.ID:
                card.selfRetain = true;
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_BOOT_SEQUENCE];
                break;
            case Buffer.ID:
                card.baseMagicNumber += 1;
                card.magicNumber += 1;
                break;
            case Capacitor.ID:
                card.baseMagicNumber += 1;
                card.magicNumber += 1;
                break;
            case Chaos.ID:
                changeBaseCost(card, 0);
                break;
            case Chill.ID:
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_CHILL];
                break;
            case Claw.ID:
                card.baseMagicNumber += 1;
                card.magicNumber += 1;
                break;
            case ColdSnap.ID:
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_COLD_SNAP];
                break;
            case CompileDriver.ID:
                card.baseDamage += 4;
                break;
            case ConserveBattery.ID:
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_CHARGE_BATTERY];
                break;
            case Consume.ID:
                card.baseMagicNumber += 1;
                card.magicNumber += 1;
                break;
            case Coolheaded.ID:
                card.baseMagicNumber += 1;
                card.magicNumber += 1;
                break;
            case CoreSurge.ID:
                card.baseMagicNumber += 1;
                card.magicNumber += 1;
                break;
            case CreativeAI.ID:
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_CREATIVE_AI];
                break;
            case Darkness.ID:
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_DARKNESS];
                break;
            case Defend_Blue.ID:
                card.baseBlock += 4;
                break;
            case Defragment.ID:
                card.baseMagicNumber += 1;
                card.magicNumber += 1;
                break;
            case DoomAndGloom.ID:
                card.baseMagicNumber += 1;
                card.magicNumber += 1;
                break;
            case DoubleEnergy.ID:
                card.exhaust = false;
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_DOUBLE_ENERGY];
                break;
            case Dualcast.ID:
                card.baseMagicNumber = 3;
                card.magicNumber = 3;
                card.upgradedMagicNumber = true;
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_DUALCAST];
                break;
            case EchoForm.ID:
                changeBaseCost(card, 5);
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_ECHO_FORM];
                break;
            case Electrodynamics.ID:
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_ELECTRODYNAMICS];
                break;
            case Equilibrium.ID:
                card.baseBlock += 4;
                break;
            case Fission.ID:
                card.exhaust = false;
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_FISSION];
                break;
            case ForceField.ID:
                card.baseBlock += 4;
                break;
            case FTL.ID:
                card.baseBlock += 1;
                card.baseMagicNumber += 1;
                card.magicNumber += 1;
                break;
            case Fusion.ID:
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_FUSION];
                break;
            case GeneticAlgorithm.ID:
                changeBaseCost(card, 0);
                break;
            case Glacier.ID:
                card.baseMagicNumber += 1;
                card.magicNumber += 1;
                break;
            case GoForTheEyes.ID:
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_GO_FOR_THE_EYES];
                break;
            case Heatsinks.ID:
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_HEATSINKS];
                break;
            case HelloWorld.ID:
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_HELLO_WORLD];
                break;
            case Hologram.ID:
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_HOLOGRAM];
                break;
            case Hyperbeam.ID:
                card.baseMagicNumber -= 1;
                card.magicNumber -= 1;
                break;
            case Leap.ID:
                card.baseBlock += 3;
                break;
            case LockOn.ID:
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_LOCK_ON];
                break;
            case Loop.ID:
                card.baseMagicNumber += 1;
                card.magicNumber += 1;
                break;
            case MachineLearning.ID:
                changeBaseCost(card, 0);
                break;
            case Melter.ID:
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_MELTER];
                break;
            case MeteorStrike.ID:
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_METEOR_STRIKE];
                break;
            case MultiCast.ID:
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_MULTICAST];
                break;
            case Overclock.ID:
                card.baseMagicNumber += 1;
                card.magicNumber += 1;
                break;
            case Rainbow.ID:
                card.rawDescription = DESCRIPTIONS[DESC_INDEX_RAINBOW];
                break;
            default:
                ReliquaryLogger.error("RelicRabbitEars tried to upgrade unknown card with ID: " + card.cardID);
        }
        card.initializeDescription();
    }

    @Override
    public String getUpdatedDescription() {
        return DESCRIPTIONS[0];
    }
    @Override
    public AbstractRelic makeCopy()
    {
        return new RelicRabbitEars();
    }
}
