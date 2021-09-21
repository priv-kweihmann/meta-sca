SUMMARY = "NPM: micromark-util-decode-string"
DESCRIPTION = "micromark utility to decode markdown strings"
HOMEPAGE = "https://github.com/micromark/micromark/tree/main#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=77;endline=78;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-micromark-util-character-native \
           npm-micromark-util-decode-numeric-character-reference-native \
           npm-parse-entities-native"

SRC_URI = "https://registry.npmjs.org/micromark-util-decode-string/-/micromark-util-decode-string-1.0.0.tgz"
SRC_URI[md5sum] = "d78de31f35d26ec559f22e4a1220cf2f"
SRC_URI[sha256sum] = "bbeb4854a8b698c1f122778c25e939905c02a9dd34aa888012b0940507feac0e"

NPM_PKGNAME = "micromark-util-decode-string"

inherit npmhelper
inherit native
