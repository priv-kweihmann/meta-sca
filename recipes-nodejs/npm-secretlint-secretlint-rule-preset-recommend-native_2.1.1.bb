SUMMARY = "NPM: @secretlint/secretlint-rule-preset-recommend"
DESCRIPTION = "Recommended rule preset of secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-preset-recommend/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-secretlint-rule-aws-native \
           npm-secretlint-secretlint-rule-basicauth-native \
           npm-secretlint-secretlint-rule-gcp-native \
           npm-secretlint-secretlint-rule-npm-native \
           npm-secretlint-secretlint-rule-privatekey-native \
           npm-secretlint-secretlint-rule-sendgrid-native \
           npm-secretlint-secretlint-rule-slack-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-preset-recommend/-/secretlint-rule-preset-recommend-2.1.1.tgz"
SRC_URI[md5sum] = "077b8a7d83aec18b6f392c943e0f7a98"
SRC_URI[sha256sum] = "3f2f98ce110a49cbdd60c02298a0552c0c3981e2069aa43c9071ef17d20631fe"

NPM_PKGNAME = "@secretlint/secretlint-rule-preset-recommend"

inherit npmhelper
inherit native
