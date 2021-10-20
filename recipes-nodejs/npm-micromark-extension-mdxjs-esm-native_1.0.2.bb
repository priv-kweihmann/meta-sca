SUMMARY = "NPM: micromark-extension-mdxjs-esm"
DESCRIPTION = "micromark extension to support MDX JS import/exports"
HOMEPAGE = "https://github.com/micromark/micromark-extension-mdxjs-esm#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-core-commonmark-native \
           npm-micromark-util-character-native \
           npm-micromark-util-events-to-acorn-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-unist-util-position-from-estree-native \
           npm-uvu-native \
           npm-vfile-message-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-mdxjs-esm/-/micromark-extension-mdxjs-esm-1.0.2.tgz"
SRC_URI[md5sum] = "47c7a175d591d5923ff984a5eaff173c"
SRC_URI[sha256sum] = "11f4236400273abe027e237db6e2d0c8485aa834768bc2a9ebaec2ed1929557e"

NPM_PKGNAME = "micromark-extension-mdxjs-esm"

inherit npmhelper
inherit native
