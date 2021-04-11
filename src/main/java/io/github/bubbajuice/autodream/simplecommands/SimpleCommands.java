public class SimpleCommands extends CommandBase {

    @Override
    public String getCommandName() {
        return "autodream";
    }

    @Override
    public String getCommandUsage(ICommandSender sender) {
        return "";
    }

    @Override
    public void processCommand(ICommandSender sender, String[] args) throws CommandException {
        Minecraft.getMinecraft().thePlayer.addChatMessage(new ChatComponentText("hello world!"));
    }
  
}