Factions - Guilding and user-controlled antigrief plugin for Minecraft
====================
This plugin will allow the players on the server to create factions/guilds. The factions can claim territory that will be protected from non-members. Factions can forge alliances and declare themselves enemies with others. Land may be taken from other factions through war.

The goals of this plugin:

* Creating a Factions API for other plugins


Usage
---------

The chat console command is:

 * `/f`

This command has subcommands like:

* `/f create MyFactionName`
* `/f invite MyFriendsName`
* `/f claim`
* `/f map`
* ... etc

You may also read the documentation ingame as the plugin ships with an ingame help manual. Read the help pages like this:

* `/f help 1`
* `/f help 2`
* `/f help 3`

Note that you may optionally skip the slash and just write

* `f`

Installing
----------
1. Put Factions.jar in the plugins folder.

A default config file will be created on the first run.

Disclamer
---------
I am not the original creator of this plugin. I strongly advise that you check him out here: https://github.com/imjack
I forked this repo so I could add an API side of things to add functionality for other plugins such as HCF, Havoc Factions, and more!

License
----------
This project has a LGPL license.<br>
This project uses [GSON](http://code.google.com/p/google-gson/) which has a [Apache 2.0 license](http://www.apache.org/licenses/LICENSE-2.0 ).
