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

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-footnote/-/micromark-extension-gfm-footnote-1.0.0.tgz"
SRC_URI[md5sum] = "720c31568044dba1af2152b0cfb00c37"
SRC_URI[sha256sum] = "33ec394ea3ea853dcf540281281be2c94f51ae02c47e2d053116e6ab7b8cab58"

NPM_PKGNAME = "micromark-extension-gfm-footnote"

inherit npmhelper
inherit native
