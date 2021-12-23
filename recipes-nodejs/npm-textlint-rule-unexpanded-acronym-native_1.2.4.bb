SUMMARY = "NPM: textlint-rule-unexpanded-acronym"
DESCRIPTION = "textlint rule that check unexpanded acronym word."
HOMEPAGE = "https://github.com/textlint-rule/textlint-rule-unexpanded-acronym"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

DEPENDS = "npm-array-includes-native \
           npm-is-capitalized-native"

SRC_URI = "https://registry.npmjs.org/textlint-rule-unexpanded-acronym/-/textlint-rule-unexpanded-acronym-1.2.4.tgz"
SRC_URI[md5sum] = "e608db36089e5bfcbb147e0bacbe8a7c"
SRC_URI[sha256sum] = "33893ffa564c5802c0046ca825dec2fcc20192557d8f7d54332bef529e8f8150"

NPM_PKGNAME = "textlint-rule-unexpanded-acronym"

inherit npmhelper
inherit native
