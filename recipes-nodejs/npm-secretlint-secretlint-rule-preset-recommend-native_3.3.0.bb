SUMMARY = "NPM: @secretlint/secretlint-rule-preset-recommend"
DESCRIPTION = "Recommended rule preset of secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-preset-recommend/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-secretlint-rule-aws-native \
           npm-secretlint-secretlint-rule-basicauth-native \
           npm-secretlint-secretlint-rule-gcp-native \
           npm-secretlint-secretlint-rule-github-native \
           npm-secretlint-secretlint-rule-npm-native \
           npm-secretlint-secretlint-rule-privatekey-native \
           npm-secretlint-secretlint-rule-sendgrid-native \
           npm-secretlint-secretlint-rule-slack-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-preset-recommend/-/secretlint-rule-preset-recommend-3.3.0.tgz"
SRC_URI[md5sum] = "bf251d43d1d7fc4a098166b3d0181c73"
SRC_URI[sha256sum] = "2794a78f3ed985c4ade837ddddbd451be78d17cce0d02b4478735a92fd440165"

NPM_PKGNAME = "@secretlint/secretlint-rule-preset-recommend"

inherit npmhelper
inherit native
