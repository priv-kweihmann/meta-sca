SUMMARY = "NPM: micromark-extension-gfm-strikethrough"
DESCRIPTION = "micromark extension to support GFM strikethrough"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-strikethrough#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-util-chunked-native \
           npm-micromark-util-classify-character-native \
           npm-micromark-util-resolve-all-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-power-assert-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-strikethrough/-/micromark-extension-gfm-strikethrough-1.0.2.tgz"
SRC_URI[md5sum] = "f666b616dc1083029935f2a43fb41715"
SRC_URI[sha256sum] = "92c9717fafb56eb92d7f53c6923d011d400b37a827ad7d82c463ad95965ffcf0"

NPM_PKGNAME = "micromark-extension-gfm-strikethrough"

inherit npmhelper
inherit native
