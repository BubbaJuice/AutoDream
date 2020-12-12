# AutoDream 
AutoDream is a [1.8.9 Minecraft Forge](http://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.8.9.html) mod developed by [BubbaJuice](https://bubbajuice.github.io) and influenced by [Sk1er's](https://github.com/Sk1erLLC) [AutoGG Mod](https://github.com/Sk1erLLC/AutoGG) that allows you to automatically say "Dream is overrated." before a game is about to start on [mc.hypixel.net](https://hypixel.net). 
## Requirements 
- [**Minecraft Forge 1.8.9 - 11.15.1.2318**](http://files.minecraftforge.net/maven/net/minecraftforge/forge/index_1.8.9.html) (For Mod Use)
- [**JDK 8**](https://adoptopenjdk.net) (For Mod Use and Building)
- [**Gradle 4.9**](https://docs.gradle.org/4.9/userguide/installation.html) (For Building)
- [**Git**](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git) (For Building)
## Installation
If you haven't installed Forge already visit https://www.pcgamesn.com/minecraft/how-to-install-minecraft-forge which has 3 simple steps on how to install forge.

Installing the mod is fairly simple.
1. Download the latest version of the mod from https://github.com/BubbaJuice/AutoDream/releases.
2. Move the jar to `.minecraft/mods`.
3. Launch Minecraft Forge!
4. After this the mod should work as intended. If you ever encounter an issue report it using the process in [CONTRIBUTING.md](CONTRIBUTING.md)
## Building
### Unix-based Systems (Linux, Mac, etc.)
1. Open a terminal.
2. Clone the repository:
```bash
$ git clone git@github.com:BubbaJuice/AutoDream.git
```
3. Change your directory to the directory you just cloned:
```bash
$ cd filelocation
```
4. Run the gradle build command:
```bash
$ gradle build
```
5. The built mod should be located in `build/libs`
### Microsoft Windows
1. I don't use windows but run the following command that may or may not build it:
```batch
> gradlew.bat build
``` 
## Downloads 
See [releases](https://github.com/BubbaJuice/AutoDream/releases) for downloads 
## Open Source Credits
Repository | License
------------ | -------------
[AutoGG](https://github.com/Sk1erLLC/AutoGG) | [GPL-3.0 License](https://github.com/Sk1erLLC/AutoGG/blob/master/LICENSE)
## License 
AutoDream is licensed under **GNU General Public License v3.0**, see: [LICENSE](LICENSE).