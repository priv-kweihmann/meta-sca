SUMMARY = "NPM: @secretlint/secretlint-rule-privatekey"
DESCRIPTION = "A secretlint rule for PrivateKey."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-privatekey/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-privatekey/-/secretlint-rule-privatekey-5.1.1.tgz"
SRC_URI[md5sum] = "06d3666b4cfa8765ceae64e2da48c339"
SRC_URI[sha256sum] = "b7c8baaae3e2e6204648aa6c9f87fa4ef13074ad69eaf4758a68c6aaf6abecad"

NPM_PKGNAME = "@secretlint/secretlint-rule-privatekey"

inherit npmhelper
inherit native
