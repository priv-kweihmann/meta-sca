SUMMARY = "NPM: @secretlint/secretlint-rule-npm"
DESCRIPTION = "A secretlint rule for npm."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-npm/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-npm/-/secretlint-rule-npm-3.1.0.tgz"
SRC_URI[md5sum] = "6e21610efd56b7d545f48b0e56353c02"
SRC_URI[sha256sum] = "8f08a35be2fe951897adb9560f1454584aee63b848690833f86cb36ec782eb17"

NPM_PKGNAME = "@secretlint/secretlint-rule-npm"

inherit npmhelper
inherit native
