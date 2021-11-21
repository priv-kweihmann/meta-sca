SUMMARY = "NPM: micromark-extension-gfm-footnote"
DESCRIPTION = "micromark extension to support GFM footnotes"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-footnote#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=23d8001628ed74be839cbeff9bdbe7dc"

DEPENDS = "npm-micromark-core-commonmark-native \
           npm-micromark-factory-space-native \
           npm-micromark-util-character-native \
           npm-micromark-util-normalize-identifier-native \
           npm-micromark-util-sanitize-uri-native \
           npm-micromark-util-symbol-native \
           npm-uvu-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-footnote/-/micromark-extension-gfm-footnote-1.0.2.tgz"
SRC_URI[md5sum] = "f7c57f5de111bfab2305b835c75fb652"
SRC_URI[sha256sum] = "7c2cb0d1f2a08694f4a5e8f1b7737cf35b04e3fefc45e4ee156f9b43e015188d"

NPM_PKGNAME = "micromark-extension-gfm-footnote"

inherit npmhelper
inherit native
