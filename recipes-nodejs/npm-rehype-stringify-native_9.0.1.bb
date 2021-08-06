SUMMARY = "NPM: rehype-stringify"
DESCRIPTION = "rehype plugin to serialize HTML"
HOMEPAGE = "https://github.com/rehypejs/rehype"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=134;endline=135;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-hast-util-to-html-native \
           npm-types-hast-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/rehype-stringify/-/rehype-stringify-9.0.1.tgz"
SRC_URI[md5sum] = "c1d69b27a49cddc0cc273ecbe3c8b1a8"
SRC_URI[sha256sum] = "16416768454ef7274b0b5945634e1b5468669eecc2e8e0ed816452a8ea94efce"

NPM_PKGNAME = "rehype-stringify"

inherit npmhelper
inherit native
