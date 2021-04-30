SUMMARY = "NPM: hast-util-parse-selector"
DESCRIPTION = "hast utility to create an element from a simple CSS selector"
HOMEPAGE = "https://github.com/syntax-tree/hast-util-parse-selector#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-types-hast-native"

SRC_URI = "https://registry.npmjs.org/hast-util-parse-selector/-/hast-util-parse-selector-3.0.0.tgz"
SRC_URI[md5sum] = "09a79fa7af2d474edd02a7dcf0325159"
SRC_URI[sha256sum] = "7dbf809ff652991d66fb5ce27ed6439d0ed8aa368232be0e2e04bc47b9e26cdd"

NPM_PKGNAME = "hast-util-parse-selector"

inherit npmhelper
inherit native
