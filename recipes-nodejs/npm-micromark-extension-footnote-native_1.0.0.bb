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
           npm-micromark-util-symbol-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-footnote/-/micromark-extension-footnote-1.0.0.tgz"
SRC_URI[md5sum] = "3e32d281c1b1b0c76cf4a1531f1dc884"
SRC_URI[sha256sum] = "e01b2bbff8501e70bba89fb0ca43b28352b0b30879387b70834724919095be76"

NPM_PKGNAME = "micromark-extension-footnote"

inherit npmhelper
inherit native
