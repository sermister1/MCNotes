package com.sermister1.mcnotes;

import java.io.IOException;

import org.lwjgl.input.Keyboard;

import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiTextField;

public class GuiCustomMenu extends GuiScreen{

    private GuiTextField textField;
    private GuiTextField textField1;

    
    @Override
    public void initGui() {
        textField = new GuiTextField(0, this.fontRendererObj, this.width / 2 - 100, this.height / 2 - 10, 200, 20);
        textField.setMaxStringLength(50); // Maximum number of characters allowed
        textField.setFocused(false); // Set focus to the text field when the GUI opens
        textField.setEnableBackgroundDrawing(true);
        
        textField1 = new GuiTextField(1, this.fontRendererObj, this.width / 2 - 100, this.height / 2 - 40, 200, 20);
        textField1.setMaxStringLength(50); // Maximum number of characters allowed
        textField1.setFocused(true); // Set focus to the text field when the GUI opens
        textField1.setEnableBackgroundDrawing(true);
        
        
    }

    @Override
    public void drawScreen(int mouseX, int mouseY, float partialTicks) {
        // Draw background and other elements if needed
        super.drawScreen(mouseX, mouseY, partialTicks);
        textField.setText(TextStrings.Get1Str());
        textField1.setText(TextStrings.Get2Str());
        textField.drawTextBox(); // Draw the text field
        textField1.drawTextBox(); // Draw the text field
    }

    @Override
    protected void keyTyped(char typedChar, int keyCode) throws IOException {
        // Handle key typing events
        
        textField.textboxKeyTyped(typedChar, keyCode); // Pass the key events to the text field
        textField1.textboxKeyTyped(typedChar, keyCode); // Pass the key events to the text field
        super.keyTyped(typedChar, keyCode);
        /*if(keyCode == Keyboard.KEY_LEFT && textField.isFocused()) {
        	textField.moveCursorBy(-1);
        }
        if(keyCode == Keyboard.KEY_RIGHT && textField.isFocused()) {
        	textField.moveCursorBy(1);
        }
        if(keyCode == Keyboard.KEY_LEFT && textField1.isFocused()) {
        	textField1.moveCursorBy(-1);
        }
        if(keyCode == Keyboard.KEY_RIGHT && textField1.isFocused()) {
        	textField1.moveCursorBy(1);
        }*/
        //if(textField.isFocused()) {
	        /*if (keyCode == Keyboard.KEY_LEFT) {          // Left arrow key
	            if (textField.getCursorPosition() > 0) {
	                textField.setCursorPosition(textField.getCursorPosition() - 1);
	            }
	        } else if (keyCode == Keyboard.KEY_RIGHT) {  // Right arrow key
	            if (textField.getCursorPosition() < textField.getText().length()) {
	                textField.setCursorPosition(textField.getCursorPosition() + 1);
	            }
	        }*/
        /*if(keyCode == Keyboard.KEY_LEFT) {
            textField.moveCursorBy(-1); // Move cursor one position to the left
        } else if(keyCode == Keyboard.KEY_RIGHT) {
            textField.moveCursorBy(1); // Move cursor one position to the right
        }*/
        //}
    }

    @Override
    public void updateScreen() {
        super.updateScreen();
        textField.updateCursorCounter(); // Update the text field's cursor
        textField1.updateCursorCounter(); // Update the text field's cursor
        TextStrings.Write2Str1(textField.getText());
        TextStrings.Write2Str2(textField1.getText());
    }

    @Override
    protected void mouseClicked(int mouseX, int mouseY, int mouseButton) throws IOException {
        // Handle mouse clicking events
        super.mouseClicked(mouseX, mouseY, mouseButton);
        textField.mouseClicked(mouseX, mouseY, mouseButton); // Pass the mouse events to the text field
        textField1.mouseClicked(mouseX, mouseY, mouseButton); // Pass the mouse events to the text field
    }
}
