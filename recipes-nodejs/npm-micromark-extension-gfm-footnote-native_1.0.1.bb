SUMMARY = "NPM: micromark-extension-gfm-footnote"
DESCRIPTION = "micromark extension to support GFM footnotes"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-footnote#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=23d8001628ed74be839cbeff9bdbe7dc"

DEPENDS = "npm-micromark-core-commonmark-native \
           npm-micromark-factory-space-native \
           npm-micromark-util-character-native \
           npm-micromark-util-normalize-identifier-native \
           npm-micromark-util-sanitize-uri-native \
           npm-micromark-util-symbol-native \
           npm-power-assert-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-footnote/-/micromark-extension-gfm-footnote-1.0.1.tgz"
SRC_URI[md5sum] = "055ef27e08112642c6d8146b19c65b79"
SRC_URI[sha256sum] = "db7477d39ebe186f1e93aa16fa504f2fecbc6d67efdecd10c1ed371a22e3b45f"

NPM_PKGNAME = "micromark-extension-gfm-footnote"

inherit npmhelper
inherit native
