SUMMARY = "NPM: rehype-parse"
DESCRIPTION = "rehype plugin to parse HTML"
HOMEPAGE = "https://github.com/rehypejs/rehype"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=287;endline=288;md5=f7cd6e61bbbca39fe0e60b4899302d5a"

DEPENDS = "npm-hast-util-from-parse5-native \
           npm-parse5-native"

SRC_URI = "https://registry.npmjs.org/rehype-parse/-/rehype-parse-7.0.1.tgz"
SRC_URI[md5sum] = "bfb5c698b9905bc24516b7c220c62fad"
SRC_URI[sha256sum] = "c3e7ec95a5274ecbc2269a3c5c282456d15bdb20b748b7c0b234109eee7fd52e"

NPM_PKGNAME = "rehype-parse"

inherit npmhelper
inherit native
