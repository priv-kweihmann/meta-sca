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

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-preset-recommend/-/secretlint-rule-preset-recommend-2.2.0.tgz"
SRC_URI[md5sum] = "e1774cd49324f072d65d95e4499d163b"
SRC_URI[sha256sum] = "f9dccf206a40df7ee0bd41d2111c91d622e23e7963acd3959505823d6b3606fb"

NPM_PKGNAME = "@secretlint/secretlint-rule-preset-recommend"

inherit npmhelper
inherit native
