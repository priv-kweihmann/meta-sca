SUMMARY = "NPM: rehype-parse"
DESCRIPTION = "rehype plugin to parse HTML"
HOMEPAGE = "https://github.com/rehypejs/rehype"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=297;endline=298;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-hast-util-from-parse5-native \
           npm-parse5-native \
           npm-types-hast-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/rehype-parse/-/rehype-parse-8.0.1.tgz"
SRC_URI[md5sum] = "7c81b8824f0a9b33143c6d80908ee498"
SRC_URI[sha256sum] = "c7c26a8678272d90a4b6f518887c03831fdb77e807c14a50c56f4213faebf190"

NPM_PKGNAME = "rehype-parse"

inherit npmhelper
inherit native
