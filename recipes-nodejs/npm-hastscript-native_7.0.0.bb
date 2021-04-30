SUMMARY = "NPM: hastscript"
DESCRIPTION = "hast utility to create trees"
HOMEPAGE = "https://github.com/syntax-tree/hastscript#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-comma-separated-tokens-native \
           npm-hast-util-parse-selector-native \
           npm-property-information-native \
           npm-space-separated-tokens-native \
           npm-types-hast-native"

SRC_URI = "https://registry.npmjs.org/hastscript/-/hastscript-7.0.0.tgz"
SRC_URI[md5sum] = "3bde8b957e26b5fb3af4d1e9df83c30f"
SRC_URI[sha256sum] = "30027ad510b95d1d57b4b350ef9ac335effa336eb458e5adb238af0c1b1ebdbd"

NPM_PKGNAME = "hastscript"

inherit npmhelper
inherit native
