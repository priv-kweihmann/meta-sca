SUMMARY = "NPM: @secretlint/secretlint-rule-basicauth"
DESCRIPTION = "A secretlint rule that check Basic Authentication."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-basicauth/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-basicauth/-/secretlint-rule-basicauth-4.1.3.tgz"
SRC_URI[md5sum] = "f8d6417c8bf085967fefc137edf60e34"
SRC_URI[sha256sum] = "a8dcea179d4a496f1fbfb4940ea653ca1024c0ba789595ff996f1c516cc71d80"

NPM_PKGNAME = "@secretlint/secretlint-rule-basicauth"

inherit npmhelper
inherit native
