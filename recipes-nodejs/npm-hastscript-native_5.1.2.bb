SUMMARY = "NPM: hastscript"
DESCRIPTION = "hast utility to create trees"
HOMEPAGE = "https://github.com/syntax-tree/hastscript#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-comma-separated-tokens-native \
           npm-hast-util-parse-selector-native \
           npm-property-information-native \
           npm-space-separated-tokens-native"

SRC_URI = "https://registry.npmjs.org/hastscript/-/hastscript-5.1.2.tgz"
SRC_URI[md5sum] = "2d162eb3868ab11c427f318a729a345c"
SRC_URI[sha256sum] = "9b71f2f25217422f351651b743d4b9acbeb381bcdc6edf96eea53f05864f1c2f"

NPM_PKGNAME = "hastscript"

inherit npmhelper
inherit native
