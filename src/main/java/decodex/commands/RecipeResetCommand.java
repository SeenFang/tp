package decodex.commands;

import decodex.data.DataManager;
import decodex.data.exception.RecipeManagerException;
import decodex.modules.ModuleManager;
import decodex.recipes.RecipeManager;
import decodex.ui.Ui;

public class RecipeResetCommand extends Command {

    public static final String COMMAND_WORD = "reset";

    public RecipeResetCommand() {
        super();
    }

    @Override
    public void run(DataManager dataManager, ModuleManager moduleManager, Ui ui, RecipeManager recipeManager)
            throws RecipeManagerException {
        recipeManager.resetEditedRecipe();
        ui.printRecipeReset(recipeManager.getEditingRecipe().getName());
    }
}
