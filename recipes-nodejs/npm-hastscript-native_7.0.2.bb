SUMMARY = "NPM: hastscript"
DESCRIPTION = "hast utility to create trees"
HOMEPAGE = "https://github.com/syntax-tree/hastscript#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-comma-separated-tokens-native \
           npm-hast-util-parse-selector-native \
           npm-property-information-native \
           npm-space-separated-tokens-native \
           npm-types-hast-native"

SRC_URI = "https://registry.npmjs.org/hastscript/-/hastscript-7.0.2.tgz"
SRC_URI[md5sum] = "05a7012a0968d517eb52bc11e8b46a7b"
SRC_URI[sha256sum] = "53b83872b29d239708965ba3aea011a1943732c44898cf931e887bbbd33961b2"

NPM_PKGNAME = "hastscript"

inherit npmhelper
inherit native
