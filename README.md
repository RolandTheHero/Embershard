# Embershard
Embershard is the name of this [Battle Nations](https://en.wikipedia.org/wiki/Battle_Nations) helper bot designed for the Battle Nations guild *Eternal Embers* on [Discord](https://discord.com). It is written in the [Java](https://en.wikipedia.org/wiki/Java_(programming_language)) programming language using the [JDA](https://jda.wiki/) (Java Discord API) library.

## Commands
The bot supports various [slash commands](https://discord.com/developers/docs/interactions/application-commands#slash-commands). Parameters in square brackets (`[]`) are required, whereas parameters in parentheses (`()`) are optional.

`/view (discord-user) (bn-user)` View a user's Raid Policy. If used on oneself, an Edit button is placed to allow the editing of one's Raid Policy. The Edit button opens a [modal](https://discord.com/developers/docs/components/using-modal-components) (or a form) with which one can customise their Raid Policy. Additionally, if the user does not have a username set, there is another entry on the modal to specify their username. If the `bn-user` argument is supplied, searches the data for usernames containing the argument. This will simply open up the respective user's policy if only one matching user was found, or show a list in a similar fashion to the `/list` command if there were more than one results. If no arguments are supplied, it is equivalent to viewing one's own policy. If both arguments are supplied, an error message will be shown to the user.

`/list (all)` List all users' Raid Policies. The `all` boolean parameter specifies whether or not to show users all users regardless if they have set their username or a Raid Policy, defaulted to `false` if not supplied.

`/setname [username]` Set your Battle Nations username.

`/gold (amount)` View the gold leaderboard. If the `amount` integer parameter is specified, updates your gold amount with the new value instead.

`/guides` View Battle Nations guides compiled from various sources.

`/formation (data)` Create a custom formation image using the provided `data` string. If the `data` argument is not supplied, bring up the command help page instead.