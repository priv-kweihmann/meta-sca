SUMMARY = "NPM: @secretlint/secretlint-rule-basicauth"
DESCRIPTION = "A secretlint rule that check Basic Authentication."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-basicauth/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=402802be77c922cb018a8b5099208dab"

DEPENDS = "npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-basicauth/-/secretlint-rule-basicauth-4.2.0.tgz"
SRC_URI[md5sum] = "a8460d3a8db375151c3c64a1f54b2424"
SRC_URI[sha256sum] = "705b049a9bd249e26f06e383240a3145405743f381cb733177b7a56e129bcd14"

NPM_PKGNAME = "@secretlint/secretlint-rule-basicauth"

inherit npmhelper
inherit native
