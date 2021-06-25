SUMMARY = "NPM: @secretlint/secretlint-rule-no-homedir"
DESCRIPTION = "A secretlint rule that disallow to include user's homedir path."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-no-homedir/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-escape-string-regexp-native \
           npm-secretlint-types-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-no-homedir/-/secretlint-rule-no-homedir-3.1.0.tgz"
SRC_URI[md5sum] = "5b54167a49edb39eb7feab93cb3e13fb"
SRC_URI[sha256sum] = "9c38c5cbb7d78e8291bd8c095742a4b56989e709a42d36a80c7364eae5b30395"

NPM_PKGNAME = "@secretlint/secretlint-rule-no-homedir"

inherit npmhelper
inherit native
