SUMMARY = "NPM: rehype-parse"
DESCRIPTION = "rehype plugin to parse HTML"
HOMEPAGE = "https://github.com/rehypejs/rehype"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=277;endline=278;md5=f7cd6e61bbbca39fe0e60b4899302d5a"

DEPENDS = "npm-hast-util-from-parse5-native \
           npm-parse5-native"

SRC_URI = "https://registry.npmjs.org/rehype-parse/-/rehype-parse-7.0.0.tgz"
SRC_URI[md5sum] = "f1d1d0b1ffe55281117c509db59dbf17"
SRC_URI[sha256sum] = "cd8670caa21af932028b1dfd6ea19104cd72a8046be876e2a6af4065635bb043"

NPM_PKGNAME = "rehype-parse"

inherit npmhelper
inherit native
