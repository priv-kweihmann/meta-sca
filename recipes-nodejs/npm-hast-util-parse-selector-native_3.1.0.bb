SUMMARY = "NPM: hast-util-parse-selector"
DESCRIPTION = "hast utility to create an element from a simple CSS selector"
HOMEPAGE = "https://github.com/syntax-tree/hast-util-parse-selector#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-types-hast-native"

SRC_URI = "https://registry.npmjs.org/hast-util-parse-selector/-/hast-util-parse-selector-3.1.0.tgz"
SRC_URI[md5sum] = "19cf04eb07ea475b71baf3a60c53ccec"
SRC_URI[sha256sum] = "68c56e48c73353740b3466cc8c44a03839f77ff89f24ba8a98bdf008ef58928a"

NPM_PKGNAME = "hast-util-parse-selector"

inherit npmhelper
inherit native
