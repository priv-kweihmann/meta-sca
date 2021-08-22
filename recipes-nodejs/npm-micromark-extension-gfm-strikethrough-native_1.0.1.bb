SUMMARY = "NPM: micromark-extension-gfm-strikethrough"
DESCRIPTION = "micromark extension to support GFM strikethrough"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-strikethrough#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-util-chunked-native \
           npm-micromark-util-classify-character-native \
           npm-micromark-util-resolve-all-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-strikethrough/-/micromark-extension-gfm-strikethrough-1.0.1.tgz"
SRC_URI[md5sum] = "a06d0f81d40ff70080d60ecbe2243786"
SRC_URI[sha256sum] = "b74f146eb89cb68c652a668c07399b6e08c60525e935f9da5dabebe43ff8748a"

NPM_PKGNAME = "micromark-extension-gfm-strikethrough"

inherit npmhelper
inherit native
