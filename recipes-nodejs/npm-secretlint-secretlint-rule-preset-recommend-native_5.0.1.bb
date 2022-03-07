SUMMARY = "NPM: @secretlint/secretlint-rule-preset-recommend"
DESCRIPTION = "Recommended rule preset of secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-preset-recommend/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-secretlint-rule-aws-native \
           npm-secretlint-secretlint-rule-basicauth-native \
           npm-secretlint-secretlint-rule-filter-comments-native \
           npm-secretlint-secretlint-rule-gcp-native \
           npm-secretlint-secretlint-rule-github-native \
           npm-secretlint-secretlint-rule-npm-native \
           npm-secretlint-secretlint-rule-privatekey-native \
           npm-secretlint-secretlint-rule-sendgrid-native \
           npm-secretlint-secretlint-rule-slack-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-preset-recommend/-/secretlint-rule-preset-recommend-5.0.1.tgz"
SRC_URI[md5sum] = "8fe367c97092d4bb037a512afdd905e7"
SRC_URI[sha256sum] = "f949d17142a479da84b782ea892034f4f3ffe1f5fd7fd5007846e6fee694152a"

NPM_PKGNAME = "@secretlint/secretlint-rule-preset-recommend"

inherit npmhelper
inherit native
