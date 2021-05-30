SUMMARY = "NPM: @secretlint/secretlint-rule-basicauth"
DESCRIPTION = "A secretlint rule that check Basic Authentication."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-basicauth/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-basicauth/-/secretlint-rule-basicauth-3.0.0.tgz"
SRC_URI[md5sum] = "afd9514eb6350da069dddbb23b289204"
SRC_URI[sha256sum] = "85240a75cf385ef2d6e19ad9484da743538dd0ecb096c3acae4ca2184b679c26"

NPM_PKGNAME = "@secretlint/secretlint-rule-basicauth"

inherit npmhelper
inherit native
