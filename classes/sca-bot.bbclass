## SPDX-License-Identifier: BSD-2-Clause
## Copyright (c) 2021, Konrad Weihmann
inherit sca-global
inherit sca-blacklist

# enable/disable the bot
SCA_BOT_ENABLE ??= "1"

# set a platform provider [github or gitlab]
SCA_BOT_PROVIDER ?= "github"

# the user of the bot
SCA_BOT_BOTUSER ??= ""
# the token the bot can use for authetication
SCA_BOT_BOTTOKEN ??= ""
# project url/number
SCA_BOT_PROJECT ??= ""
# MR/PR number
SCA_BOT_REQUEST ??= ""
# server base url
SCA_BOT_SERVER ??= ""

# 1 - to comment on draft requests
SCA_BOT_COMMENT_DRAFT_REQUEST ?= "0"
# 1 - to comment also changes of indirect files (like recipes)
SCA_BOT_COMMENT_INDIRECT ?= "1"
# 1 - to comment only on changed lines
SCA_BOT_COMMENT_AFFECTED_LINES ?= "0"

SCA_BOT_DEPENDENCIES = "\
    python3-scabot-native \
"

DEPENDS += "${@oe.utils.ifelse(not sca_is_module_blacklisted(d) and d.getVar('SCA_BOT_ENABLE') == '1', '${SCA_BOT_DEPENDENCIES}', '')}"

# We use a global handler, which is fired at the end of any build
# no matter if it was successful or failed
# (we skip on interrupted builds, as they should be coming from user
# interaction only)
addhandler sca_bot_comment
sca_check_sanity_eventhandler[eventmask] = "bb.event.BuildCompleted"
python sca_bot_comment() {
    if bb.event.getName(e) == "BuildCompleted":
        if e._interrupted or d.getVar("SCA_BOT_ENABLE") != "1":
            return

        import glob
        import subprocess
        
        # Run the bot code here
        bb.warn("And here we are")

        # get dm files from SCA_EXPORT_DIR
        # if any, launch the bot
        _files = glob.glob(d.expand("${SCA_EXPORT_DIR}/*/datamodel/*.dm"))

        if not any(_files):
            return

        # setup an appropriate environment
        _env = os.environ.copy()
        _env["SCABOT_BOTTOKEN"] = d.getVar("SCA_BOT_BOTTOKEN")
        _env["SCABOT_BOTUSER"] = d.getVar("SCA_BOT_BOTUSER")
        _env["SCABOT_PROJECT"] = d.getVar("SCA_BOT_PROJECT")
        _env["SCABOT_REQUEST"] = d.getVar("SCA_BOT_REQUEST")
        _env["SCABOT_SERVER"] = d.getVar("SCA_BOT_SERVER")

        if d.getVar("SCA_BOT_COMMENT_DRAFT_REQUEST") == "1":
            _env["SCABOT_COMMENT_DRAFT_REQUEST"] = "1"
        if d.getVar("SCA_BOT_COMMENT_INDIRECT") == "1":
            _env["SCABOT_COMMENT_INDIRECT"] = "1"
        if d.getVar("SCA_BOT_COMMENT_AFFECTED_LINES") == "1":
            _env["SCABOT_COMMENT_AFFECTED_LINES"] = "1"

        # Run the bot

        _args = ["scabot"]
        if e._failures:
            _args += ["--incomplete"]
        _args += [d.getVar("SCA_BOT_PROVIDER")] + _files

        try:
            subprocess.check_output(_args, stdout=subprocess.STDOUT)
        except subprocess.CalledProcessError as exp:
            bb.warn("SCA comment bot failes: {}".format(e.stdout or ""))
}
