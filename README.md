# WhaleOres

[![Join the chat at https://gitter.im/WhaleOres/Lobby](https://badges.gitter.im/WhaleOres/Lobby.svg)](https://gitter.im/WhaleOres/Lobby?utm_source=badge&utm_medium=badge&utm_campaign=pr-badge&utm_content=badge)

[![WhaleOres](https://www.dropbox.com/s/vfdmjoag3c436t0/WhaleOres.png?dl=1)](https://github.com/cmduale/whaleores)

WhaleOres is a mod for specialized for the needs of the user. How it works:

  - Fill a survey to show what you want
  - Submit it
  - We make it for you
  - We email a link to you
  - Magic!

You can also:
  - Design the mod
  - Tweak it around (but not too much, of course)
  - Help in the development

### Our Goals 

> Our goals are that we can do all the surveys
> so we can get more people in this mod.
> Also we are trying to influence the mod to get the choice
> of the people (like Minecraft vox populi)

This mod uses Java and Forge 1.7.10 (the most modded version of Minecraft).

### Tech
WhaleOres uses a number Java projects to work properly:

* [Eclipse IDE] - awesome Java IDE
* [IntelliJ] - another Java IDE that can be used for modding
* [paint.net] - for the design
* [Forge Mod Client] - the MAIN part for the mod

And of course WhaleOres itself is open source with a [public repository][repo]
 on GitHub.

### Installation (Windows)

WhaleOres requires [Git] first up.
Download and install from the installer.

Open Git Bash and type this code:

```sh
$ git clone github.com/cmduale/whaleores
```
Then download [Eclipse IDE] and [JDK 8] and install them both.
Then open the cloned folder and make a .bat file with this code:
```sh
gradlew setupDecompWorkspace && gradlew eclipse
```
or alternatively run gradlew2.bat.
When the .bat file is finished building the Eclipse environment, open Eclipse IDE, then when a popup says 'Select Workspace', pick the 'eclipse' folder in where the repo was cloned.

### Installation on Unix operating Systems (Macs and Linux PCs)
First download and install those same tools from Windows, but only for either Mac or Linux ([Git], [Eclipse IDE] and [JDK 8]).
Then clone the repository on Git with this code:
```sh
$ git clone github.com/cmduale/whaleores.git
```
Then open a terminal in that folder where you cloned WhaleOres and type this code:
```sh
.\gradlew setupDecompWorkspace
```
```sh
.\gradlew eclipse
```
Then open Eclipse IDE then when a popup says to 'Select Workspace', go to where you cloned WhaleOres and pick the 'eclipse' folder.

**Note - These instructions may not be exact, but feel free to edit the file to help Mac and Linux users build the mod.**


### Creators
![DERPYSQUID](https://yt3.ggpht.com/-Y1yPkR88tUo/AAAAAAAAAAI/AAAAAAAAAAA/7iTZGC6dNfw/s176-c-k-no-mo-rj-c0xffffff/photo.jpg) [DERPY SQUID] - Design 

![Grandroshen](https://yt3.ggpht.com/-LPWM6mAuMxk/AAAAAAAAAAI/AAAAAAAAAAA/Fi_zHwVETYY/s176-c-k-no-mo-rj-c0xffffff/photo.jpg) [Grandroshen] - Code/Design

![TheModdedWhale](http://static.planetminecraft.com/files/avatar/2266444_0.png) [TheModdedWhale/CMDuale] - Code/Creator

**There will be a Planet Minecraft/Curse Minecraft Forum link but that will be coming soon.**
**Thanks for having a look at this mod and happy Minecrafting!**


   [whlore]: <https://github.com/cmduale/whaleores>
   [repo]: <https://github.com/cmduale/whaleores.git>
   [Paint.net]: <http://getpaint.net>
   [Forge Mod Client]: <http://files.minecraftforge.net/>
   [IntelliJ]: <https://www.jetbrains.com/idea>
   [Eclipse IDE]: <http://eclipse.org/>
   [Git]: <https://git-scm.com/>
   [JDK 8]: <www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html>
   [DERPY SQUID]: <http://bit.ly/derpysquid>
   [Grandroshen]: <http://bit.ly/grandroshen>
   [TheModdedWhale/CMDuale]: <http://bit.ly/sayderpywhale>
  
