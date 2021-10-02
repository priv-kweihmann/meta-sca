SUMMARY = "NPM: power-assert"
DESCRIPTION = "Power Assert in JavaScript"
HOMEPAGE = "https://github.com/power-assert-js/power-assert"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=e6904dda5faf6340c5b571482d881203"

DEPENDS = "npm-define-properties-native \
           npm-empower-native \
           npm-power-assert-formatter-native \
           npm-universal-deep-strict-equal-native \
           npm-xtend-native"

SRC_URI = "https://registry.npmjs.org/power-assert/-/power-assert-1.6.1.tgz"
SRC_URI[md5sum] = "f78ab368d5d5147b1f991729d5bf5d7e"
SRC_URI[sha256sum] = "36564a357f91adc7d89db0c21d16bc0e988450825ae2b866246d9ed0b92e5288"

NPM_PKGNAME = "power-assert"

inherit npmhelper
inherit native
