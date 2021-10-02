SUMMARY = "NPM: micromark-extension-footnote"
DESCRIPTION = "micromark extension to support footnotes"
HOMEPAGE = "https://github.com/micromark/micromark-extension-footnote#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-core-commonmark-native \
           npm-micromark-factory-space-native \
           npm-micromark-util-character-native \
           npm-micromark-util-chunked-native \
           npm-micromark-util-normalize-identifier-native \
           npm-micromark-util-resolve-all-native \
           npm-micromark-util-symbol-native \
           npm-power-assert-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-footnote/-/micromark-extension-footnote-1.0.1.tgz"
SRC_URI[md5sum] = "3c1aa349da28974f004cad91b7c230f1"
SRC_URI[sha256sum] = "0c87977ffd5707e62a3afa86fb117e17bb5d950988b2486c394577c9a7a7c513"

NPM_PKGNAME = "micromark-extension-footnote"

inherit npmhelper
inherit native
