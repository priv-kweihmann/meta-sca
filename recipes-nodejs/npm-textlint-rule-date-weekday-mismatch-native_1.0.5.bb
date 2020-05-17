SUMMARY = "NPM: textlint-rule-date-weekday-mismatch"
DESCRIPTION = "textlint rule that found mismatch between date and weekday."
HOMEPAGE = "https://github.com/azu/textlint-rule-date-weekday-mismatch"

DEPENDS = "npm-chrono-node-native npm-moment-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bc9a2bae21f2f74984d4a43e24285986"

SRC_URI = "https://registry.npmjs.org/textlint-rule-date-weekday-mismatch/-/textlint-rule-date-weekday-mismatch-1.0.5.tgz"
SRC_URI[md5sum] = "87b2e9bcefa69ffd005f39915acde38e"
SRC_URI[sha256sum] = "105eefeb5fff124d2cb832d92ff0aed96fa9814061fea905dadbe40fe1dee3c8"

NPM_PKGNAME = "textlint-rule-date-weekday-mismatch"

inherit npmhelper
inherit native
