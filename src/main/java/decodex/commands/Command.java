package decodex.commands;

import decodex.data.DataManager;
import decodex.data.exception.CommandException;
import decodex.data.exception.DataManagerException;
import decodex.data.exception.ModuleException;
import decodex.data.exception.RecipeException;
import decodex.data.exception.RecipeManagerException;
import decodex.data.exception.ModuleManagerException;
import decodex.modules.ModuleManager;
import decodex.recipes.RecipeManager;
import decodex.ui.Ui;

/**
 * Command serves as a foundation for other commands to be built upon.
 */
public abstract class Command {

    public Command() {
    }

    public abstract void run(DataManager dataManager, ModuleManager moduleManager, Ui ui, RecipeManager recipeManager)
            throws CommandException, ModuleManagerException, DataManagerException, ModuleException, RecipeException,
            RecipeManagerException;
}
