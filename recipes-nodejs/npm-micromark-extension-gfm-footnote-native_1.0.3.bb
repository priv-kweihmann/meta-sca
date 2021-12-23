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
           npm-uvu-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-footnote/-/micromark-extension-gfm-footnote-1.0.3.tgz"
SRC_URI[md5sum] = "c334f9f98274fd877015f86e8bc25eaa"
SRC_URI[sha256sum] = "1c1a1544d3f2505d30818ae8220cc5af67558f433567711e5fa77fa7d0190667"

NPM_PKGNAME = "micromark-extension-gfm-footnote"

inherit npmhelper
inherit native
