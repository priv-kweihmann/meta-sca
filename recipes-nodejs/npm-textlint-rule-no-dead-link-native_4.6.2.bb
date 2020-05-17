SUMMARY = "NPM: textlint-rule-no-dead-link"
DESCRIPTION = "A textlint rule to check if all links are alive"
HOMEPAGE = "https://github.com/textlint-rule/textlint-rule-no-dead-link"

DEPENDS = "npm-fs-extra-native npm-get-url-origin-native npm-minimatch-native npm-node-fetch-native npm-p-memoize-native npm-p-queue-native npm-textlint-rule-helper-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://ReadMe.md;beginline=165;md5=355b64b34f8b0e8810c4e72a77859cc2"

SRC_URI = "https://registry.npmjs.org/textlint-rule-no-dead-link/-/textlint-rule-no-dead-link-4.6.2.tgz"
SRC_URI[md5sum] = "d777f2d693e4c85a985260bdfaa15362"
SRC_URI[sha256sum] = "3bf2a4fdea9c84ad528ce828130ee775e978b9cf07da6d02e8c5cda0ba941379"

NPM_PKGNAME = "textlint-rule-no-dead-link"

inherit npmhelper
inherit native
