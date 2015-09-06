package com.maxiaohua.genealogy.fw.core.rft.impl;

import java.awt.event.ActionEvent;

import javax.swing.Action;
import javax.swing.JEditorPane;
import javax.swing.UIManager;
import javax.swing.text.JTextComponent;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.TextAction;


public class StyledEditorKitEx extends StyledEditorKit {

    
    private static final long serialVersionUID = 1L;

    private static final Action[] DEFAULT_EX_ACTION = { new FontFamilyAction("font-family-SansSerif", "SansSerif"),
            new FontFamilyAction("font-family-Monospaced", "Monospaced"), new FontFamilyAction("font-family-Serif", "Serif"),
            new FontSizeAction("font-size-8", 8), new FontSizeAction("font-size-10", 10), new FontSizeAction("font-size-12", 12),
            new FontSizeAction("font-size-14", 14), new FontSizeAction("font-size-16", 16), new FontSizeAction("font-size-18", 18),
            new FontSizeAction("font-size-24", 24), new FontSizeAction("font-size-36", 36), new FontSizeAction("font-size-48", 48),
            new AlignmentAction("left-justify", StyleConstants.ALIGN_LEFT), new AlignmentAction("center-justify", StyleConstants.ALIGN_CENTER),
            new AlignmentAction("right-justify", StyleConstants.ALIGN_RIGHT), new BoldAction(), new ItalicAction(), new StyledInsertBreakAction(),
            new UnderlineAction(), new StrikeThroughAction() };

    
    public StyledEditorKitEx() {
        super();
    }

    
    @Override
    public Action[] getActions() {
        return TextAction.augmentList(super.getActions(), DEFAULT_EX_ACTION);
    }

    
    public static class StrikeThroughAction extends StyledTextAction {

        
        private static final long serialVersionUID = 1L;

        
        public StrikeThroughAction() {
            super("font-strikethrough");
        }

        
        public void actionPerformed(
                ActionEvent e) {
            JEditorPane editor = getEditor(e);
            if (editor != null) {
                StyledEditorKit kit = getStyledEditorKit(editor);
                MutableAttributeSet attr = kit.getInputAttributes();
                boolean strikethrough = (StyleConstants.isStrikeThrough(attr)) ? false : true;
                SimpleAttributeSet sas = new SimpleAttributeSet();
                StyleConstants.setStrikeThrough(sas, strikethrough);
                setCharacterAttributes(editor, sas, false);
            }
        }
    }

    
    static class StyledInsertBreakAction extends StyledTextAction {
        
        private static final long serialVersionUID = 1L;
        private SimpleAttributeSet tempSet;

        
        StyledInsertBreakAction() {
            super(insertBreakAction);
        }

        
        public void actionPerformed(
                ActionEvent e) {
            JEditorPane target = getEditor(e);

            if (target != null) {
                if ((!target.isEditable()) || (!target.isEnabled())) {
                    UIManager.getLookAndFeel().provideErrorFeedback(target);
                    return;
                }
                StyledEditorKit sek = getStyledEditorKit(target);

                if (tempSet != null) {
                    tempSet.removeAttributes(tempSet);
                } else {
                    tempSet = new SimpleAttributeSet();
                }
                tempSet.addAttributes(sek.getInputAttributes());
                target.replaceSelection("\n");

                MutableAttributeSet ia = sek.getInputAttributes();

                ia.removeAttributes(ia);
                ia.addAttributes(tempSet);
                tempSet.removeAttributes(tempSet);
            } else {
                JTextComponent text = getTextComponent(e);

                if (text != null) {
                    if ((!text.isEditable()) || (!text.isEnabled())) {
                        UIManager.getLookAndFeel().provideErrorFeedback(target);
                        return;
                    }
                    text.replaceSelection("\n");
                }
            }
        }
    }
}