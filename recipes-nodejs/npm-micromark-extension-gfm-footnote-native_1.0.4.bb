SUMMARY = "NPM: micromark-extension-gfm-footnote"
DESCRIPTION = "micromark extension to support GFM footnotes"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-footnote#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=23d8001628ed74be839cbeff9bdbe7dc"

DEPENDS = "npm-micromark-core-commonmark-native \
           npm-micromark-factory-space-native \
           npm-micromark-util-character-native \
           npm-micromark-util-normalize-identifier-native \
           npm-micromark-util-sanitize-uri-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-uvu-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-footnote/-/micromark-extension-gfm-footnote-1.0.4.tgz"
SRC_URI[md5sum] = "6afd79e08654abc7eeea0b4207825da2"
SRC_URI[sha256sum] = "267fd6eb7c3f1c71f3cca55ba490c4be1b75b79435d04bb574a78067a6e72ffa"

NPM_PKGNAME = "micromark-extension-gfm-footnote"

inherit npmhelper
inherit native
