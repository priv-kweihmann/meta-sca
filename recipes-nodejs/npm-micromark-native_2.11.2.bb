SUMMARY = "NPM: micromark"
DESCRIPTION = "small commonmark compliant markdown parser with positional info and concrete tokens"
HOMEPAGE = "https://github.com/micromark/micromark#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-debug-native \
           npm-parse-entities-native"

SRC_URI = "https://registry.npmjs.org/micromark/-/micromark-2.11.2.tgz"
SRC_URI[md5sum] = "af207aeb651dc03904e2ab4785696551"
SRC_URI[sha256sum] = "5956f1d9253d55f213ca7ef2cd19d782a515716b0daac8788be31f789df20db6"

NPM_PKGNAME = "micromark"

inherit npmhelper
inherit native
