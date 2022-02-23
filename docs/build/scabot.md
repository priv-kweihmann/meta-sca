# SCA Bot

you can automatically let your build do comments of SCA findings of this layer to your SCM system like

- Gitlab
- Github

## Usage

In your **local.conf** or **distro.conf** insert the following

```bitbake
INHERIT += "sca-bot"
```

and then choose in the same file your SCM provider.
For Gitlab

```bitbake
SCA_BOT_PROVIDER = "gitlab"
```

and for Github

```bitbake
SCA_BOT_PROVIDER = "github"
```

## Pre-requisites on your SCM server side

- user name of a the bot
  It's highly recommended to use a separate account with limited writing capabilities to the repo
- a personal access token for the user, as authentication with plain passwords is absolutely discouraged.
- the bot user needs the capabilities to make comments to Merge or Pull requests

## Adding the needed project information

Now you need to tell the build how to talk to your git server.
Set in your **local.conf** or **distro.conf** the following

```bitbake
BB_ENV_PASSTHROUGH_ADDITIONS += "SCA_BOT_BOTUSER SCA_BOT_BOTTOKEN SCA_BOT_PROJECT SCA_BOT_REQUEST SCA_BOT_SERVER"
```

so you can pass these sensitive information from the environment.

And then in your pipeline export the following before starting bitbake

```sh
export SCA_BOT_BOTUSER="<the user name of the bot>"
export SCA_BOT_BOTTOKEN="<the personal access token>"
export SCA_BOT_PROJECT="<the project identifier of your repository>"
export SCA_BOT_REQUEST="<the merge/pull request id>"
export SCA_BOT_SERVER="<the server url of your SCM instance>"
```

### Example for gitlab

```sh
export SCA_BOT_BOTUSER="my-bot-user"
export SCA_BOT_BOTTOKEN="abcdefghijklmopqrstuvwxyz123"
export SCA_BOT_PROJECT="1"
export SCA_BOT_REQUEST="10"
export SCA_BOT_SERVER="https://my.corp.gitlab.org/"
```

### Example for github (public repository)

```sh
export SCA_BOT_BOTUSER="my-bot-user"
export SCA_BOT_BOTTOKEN="abcdefghijklmopqrstuvwxyz123"
export SCA_BOT_PROJECT="corp-user-profile"
export SCA_BOT_REQUEST="10"
export SCA_BOT_SERVER="https://github.com/"
```

## Further configuration

You can fine tune the behavior by setting in your **local.conf** or **distro.conf**

| var                            | default |                                                         purpose |
| ------------------------------ | ------: | --------------------------------------------------------------: |
| SCA_BOT_COMMENT_DRAFT_REQUEST  |       0 |                        Comment on **draft** or **WIP** requests |
| SCA_BOT_COMMENT_INDIRECT       |       1 | Comment if a related bitbake file was changed (like the recipe) |
| SCA_BOT_COMMENT_AFFECTED_LINES |       0 |     Comment only if finding is for a change done with the PR/MR |

## Notes

- by default the bot will comment at the very end of the bitbake build, even if it wasn't successful.
- findings that aren't present in the build anymore will get automatically resolved.
  except when the build failed, in this case only new findings will be added, but remaining will stay unchanged
