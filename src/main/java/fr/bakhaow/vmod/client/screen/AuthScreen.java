package fr.bakhaow.vmod.client.screen;

import java.io.IOException;

import com.azuriom.azauth.AuthenticationException;
import com.azuriom.azauth.AzAuthenticator;
import com.azuriom.azauth.model.User;

import net.minecraft.client.gui.screen.MainMenuScreen;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.widget.TextFieldWidget;
import net.minecraft.client.gui.widget.button.Button;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class AuthScreen extends Screen
{

	public AuthScreen() {
		super(new TranslationTextComponent("narrator.screen.auth"));
	}


	private TextFieldWidget usernameField;
    private TextFieldWidget passwordField;
    private String username = "E-Mail";
    private String password = "Password";
    private String info = "Connectez-vous avec votre adresse mail !";
    private String url = "https://v.bakhaow.fr";
    private static User auth;
	public static boolean authed = false;
	
    @Override
    public void tick() {
    	this.usernameField.tick();
    	this.passwordField.tick();
    }
    
    @Override
    public void init() {
        this.addButton(new Button(this.width / 2 - 50, this.height/4 * 3, 98, 20, "§2Connexion", (p_213094_1_) -> {
            this.username = this.usernameField.getText();
            this.password = this.passwordField.getText();
        	info = "§3Connexion - > ...";
        	try {
        		auth(username, password, url);
				AuthScreen.authed = true;
				this.usernameField.active = false;
				this.passwordField.active = false;
				this.minecraft.displayGuiScreen(new MainMenuScreen());
			} catch (AuthenticationException e) {
				System.out.println("[AuthExcept]");
				info = "§4Mauvais identifiants";
				e.printStackTrace();
			} catch (IOException e) {
				System.out.println("[Except]");
				info = "§4Erreur de connexion !";
				e.printStackTrace();
			}
        	AuthScreen.authed = true;
         }));
        this.usernameField = new TextFieldWidget(this.font, this.width / 2 - 100, this.height / 4, 200, 20, this.username);
        this.usernameField.setText(this.username);
        this.usernameField.setResponder((p_214313_1_) -> {
            this.username = p_214313_1_;
         });
        this.children.add(this.usernameField);
        this.passwordField = new TextFieldWidget(this.font, this.width / 2 - 100, this.height / 2, 200, 20, this.password);
        this.passwordField.setText(this.password);
        this.passwordField.setResponder((p_214313_1_) -> {
            this.password = p_214313_1_;
         });
        this.children.add(this.passwordField);
        this.setFocusedDefault(this.usernameField);
    }
    
    public void render(int p_73863_1_, int p_73863_2_, float p_73863_3_) {
        this.renderBackground();
        this.drawCenteredString(this.font, "§nE-Mail", this.width / 2, this.height / 4 - 20, 11184810);
        this.drawCenteredString(this.font, "§nMot de passe", this.width / 2, this.height / 2 - 20, 11184810);
        this.drawCenteredString(this.font, info, this.width / 2, this.height / 4 * 3 - 20, 11184810);
        this.usernameField.render(p_73863_1_, p_73863_2_, p_73863_3_);
        this.passwordField.render(p_73863_1_, p_73863_2_, p_73863_3_);
        super.render(p_73863_1_, p_73863_2_, p_73863_3_);
    }
    
    protected void keyTyped(char p_73869_1_, int p_73869_2_) {
        if (this.usernameField.isFocused()) {
            this.usernameField.charTyped(p_73869_1_, p_73869_2_);
            this.username = this.usernameField.getText();
        } else if (this.passwordField.isFocused()) {
            this.passwordField.charTyped(p_73869_1_, p_73869_2_);
            this.password = this.passwordField.getText();
        }
    }
    
    public boolean keyPressed(int p_keyPressed_1_, int p_keyPressed_2_, int p_keyPressed_3_) {
        if (super.keyPressed(p_keyPressed_1_, p_keyPressed_2_, p_keyPressed_3_)) {
           return true;
        } else if (p_keyPressed_1_ != 257 && p_keyPressed_1_ != 335) {
           return false;
        }
		return true;
     }
    
    protected void mouseClicked(int x, int y, int btn) {
        super.mouseClicked(x, y, btn);
        this.usernameField.mouseClicked(x, y, btn);
        this.passwordField.mouseClicked(x, y, btn);
    }
    
    public static String auth(String username, String password, String url) throws AuthenticationException, IOException {
        AzAuthenticator authenticator = new AzAuthenticator(url);
        auth = authenticator.authenticate(username, password);
        return auth.getUsername();
    }
    
}