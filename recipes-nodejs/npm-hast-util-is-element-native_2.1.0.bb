SUMMARY = "NPM: hast-util-is-element"
DESCRIPTION = "hast utility to check if a node is a (certain) element"
HOMEPAGE = "https://github.com/syntax-tree/hast-util-is-element#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-types-hast-native \
           npm-types-unist-native"

SRC_URI = "https://registry.npmjs.org/hast-util-is-element/-/hast-util-is-element-2.1.0.tgz"
SRC_URI[md5sum] = "63ce40be4f54351ea25dce03df650834"
SRC_URI[sha256sum] = "9847ca8d4b669cdc331f9f22a38ee9705af29fe2534a91cf32d61ad3fe33ebf5"

NPM_PKGNAME = "hast-util-is-element"

inherit npmhelper
inherit native
