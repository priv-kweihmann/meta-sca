SUMMARY = "NPM: micromark-extension-footnote"
DESCRIPTION = "micromark extension to support footnotes"
HOMEPAGE = "https://github.com/micromark/micromark-extension-footnote#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-core-commonmark-native \
           npm-micromark-factory-space-native \
           npm-micromark-util-character-native \
           npm-micromark-util-chunked-native \
           npm-micromark-util-normalize-identifier-native \
           npm-micromark-util-resolve-all-native \
           npm-micromark-util-symbol-native \
           npm-uvu-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-footnote/-/micromark-extension-footnote-1.0.2.tgz"
SRC_URI[md5sum] = "20aafe669970b0a47d218b9a43750a71"
SRC_URI[sha256sum] = "b3b876abd1b9b1fa2bc8cea7f4bd9ee1cc2cab9ce610f1d2d105c63572d37740"

NPM_PKGNAME = "micromark-extension-footnote"

inherit npmhelper
inherit native
