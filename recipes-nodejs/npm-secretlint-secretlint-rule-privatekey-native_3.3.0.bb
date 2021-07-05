SUMMARY = "NPM: @secretlint/secretlint-rule-privatekey"
DESCRIPTION = "A secretlint rule for PrivateKey."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-privatekey/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-privatekey/-/secretlint-rule-privatekey-3.3.0.tgz"
SRC_URI[md5sum] = "5348a5613eb48ae5d87e0be27a5d51b0"
SRC_URI[sha256sum] = "ea148a3fda5b7380539c13af136e5eaca757647ecbfbc32bafa8339678eafe38"

NPM_PKGNAME = "@secretlint/secretlint-rule-privatekey"

inherit npmhelper
inherit native
