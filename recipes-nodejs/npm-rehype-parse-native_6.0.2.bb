SUMMARY = "NPM: rehype-parse"
DESCRIPTION = "HTML parser for rehype"
HOMEPAGE = "https://github.com/rehypejs/rehype"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=277;endline=278;md5=f7cd6e61bbbca39fe0e60b4899302d5a"

DEPENDS = "npm-hast-util-from-parse5-native \
           npm-parse5-native \
           npm-xtend-native"

SRC_URI = "https://registry.npmjs.org/rehype-parse/-/rehype-parse-6.0.2.tgz"
SRC_URI[md5sum] = "5431a266abf3fbf92dda075e003c0806"
SRC_URI[sha256sum] = "3c232a42fd172e291993c22d9dfeee96d329f7e18e6e7856d2c94f38bbb06d94"

NPM_PKGNAME = "rehype-parse"

inherit npmhelper
inherit native
