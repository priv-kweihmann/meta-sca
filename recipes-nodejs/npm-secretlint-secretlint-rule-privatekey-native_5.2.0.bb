SUMMARY = "NPM: @secretlint/secretlint-rule-privatekey"
DESCRIPTION = "A secretlint rule for PrivateKey."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-privatekey/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-privatekey/-/secretlint-rule-privatekey-5.2.0.tgz"
SRC_URI[md5sum] = "4824c453247b736d1402b5e86f1b8c6d"
SRC_URI[sha256sum] = "ca2a6d183626afb9674d6b8175fb615646ea5cf1bf181da1531c04889ba6ff13"

NPM_PKGNAME = "@secretlint/secretlint-rule-privatekey"

inherit npmhelper
inherit native
