SUMMARY = "NPM: rehype-parse"
DESCRIPTION = "rehype plugin to parse HTML"
HOMEPAGE = "https://github.com/rehypejs/rehype"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=487;endline=488;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-hast-util-from-parse5-native \
           npm-parse5-native \
           npm-types-hast-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/rehype-parse/-/rehype-parse-8.0.4.tgz"
SRC_URI[md5sum] = "879308cb43780b1bf2e9a9b886857131"
SRC_URI[sha256sum] = "04cfd5b06e6b0624cdd963bd3a9869f3aff414f8a8fc809cb2d705354594b25e"

NPM_PKGNAME = "rehype-parse"

inherit npmhelper
inherit native
