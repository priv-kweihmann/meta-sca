SUMMARY = "NPM: retext-profanities"
DESCRIPTION = "retext plugin to check for profane and vulgar wording"
HOMEPAGE = "https://github.com/retextjs/retext-profanities#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=8e9f707ac01af145c36ef2adde15d7e4"

DEPENDS = "npm-cuss-native \
           npm-nlcst-search-native \
           npm-nlcst-to-string-native \
           npm-pluralize-native \
           npm-quotation-native \
           npm-types-nlcst-native \
           npm-unified-native \
           npm-unist-util-position-native"

SRC_URI = "https://registry.npmjs.org/retext-profanities/-/retext-profanities-7.1.0.tgz"
SRC_URI[md5sum] = "3e35ba69535f73bf48d7fb6a02989920"
SRC_URI[sha256sum] = "096a08433b247d77ad8ec2d361137dbae26fc55a3b3b993989847cc12c448e41"

NPM_PKGNAME = "retext-profanities"

inherit npmhelper
inherit native
