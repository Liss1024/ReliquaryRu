package patches;

import com.evacipated.cardcrawl.modthespire.lib.SpireField;
import com.evacipated.cardcrawl.modthespire.lib.SpirePatch;
import com.megacrit.cardcrawl.cards.AbstractCard;

@SpirePatch(
    cls="com.megacrit.cardcrawl.cards.AbstractCard",
    method=SpirePatch.CLASS
)
public class PatchPurpleTingedLeaf {
    public static SpireField<Boolean> inPurpleTingedLeaf = new SpireField<>(() -> false);

    @SpirePatch(
        cls="com.megacrit.cardcrawl.cards.AbstractCard",
        method="makeStatEquivalentCopy"
    )
    public static class MakeStatEquivalentCopy
    {
        public static AbstractCard Postfix(AbstractCard __result, AbstractCard __instance)
        {
            inPurpleTingedLeaf.set(__result, inPurpleTingedLeaf.get(__instance));
            return __result;
        }
    }

}
