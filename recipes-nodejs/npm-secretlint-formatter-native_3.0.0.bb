SUMMARY = "NPM: @secretlint/formatter"
DESCRIPTION = "A formatter collection for Secretlint."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/formatter/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-debug-native \
           npm-secretlint-types-native \
           npm-terminal-link-native \
           npm-textlint-linter-formatter-native \
           npm-textlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/formatter/-/formatter-3.0.0.tgz"
SRC_URI[md5sum] = "c55f7bcc8cd6321a156f1bec78257994"
SRC_URI[sha256sum] = "93a30c3d38a046322009d191aaf6d66724006803bee4b4d538a12524379ab2c4"

NPM_PKGNAME = "@secretlint/formatter"

inherit npmhelper
inherit native
