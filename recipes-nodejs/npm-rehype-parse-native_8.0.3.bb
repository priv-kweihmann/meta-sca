SUMMARY = "NPM: rehype-parse"
DESCRIPTION = "rehype plugin to parse HTML"
HOMEPAGE = "https://github.com/rehypejs/rehype"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=297;endline=298;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-hast-util-from-parse5-native \
           npm-parse5-native \
           npm-types-hast-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/rehype-parse/-/rehype-parse-8.0.3.tgz"
SRC_URI[md5sum] = "eae7a94d791c2daa2c6f7680f97172aa"
SRC_URI[sha256sum] = "ca788eb098ce58037c003d79754336ca0f087267a7ae583f27b0d3e991deb601"

NPM_PKGNAME = "rehype-parse"

inherit npmhelper
inherit native
