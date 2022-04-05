SUMMARY = "NPM: @secretlint/secretlint-rule-basicauth"
DESCRIPTION = "A secretlint rule that check Basic Authentication."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-basicauth/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-basicauth/-/secretlint-rule-basicauth-5.1.3.tgz"
SRC_URI[md5sum] = "58cae12f95ea3e0a1a2cf1d8d1b7f97c"
SRC_URI[sha256sum] = "9c8639bac97756b43f2a036bc7a4943c3a9a0fbd1325fb17d52363678e535a11"

NPM_PKGNAME = "@secretlint/secretlint-rule-basicauth"

inherit npmhelper
inherit native
