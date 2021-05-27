SUMMARY = "NPM: @secretlint/secretlint-rule-npm"
DESCRIPTION = "A secretlint rule for npm."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-npm/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-npm/-/secretlint-rule-npm-2.2.0.tgz"
SRC_URI[md5sum] = "80419350179af4b8f01d9a48e8569c74"
SRC_URI[sha256sum] = "15634440c352a928069a04e13fefb3a7ccc005906a5356b08f9c801b5c57d665"

NPM_PKGNAME = "@secretlint/secretlint-rule-npm"

inherit npmhelper
inherit native
