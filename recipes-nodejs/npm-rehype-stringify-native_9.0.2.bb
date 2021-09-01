SUMMARY = "NPM: rehype-stringify"
DESCRIPTION = "rehype plugin to serialize HTML"
HOMEPAGE = "https://github.com/rehypejs/rehype"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=134;endline=135;md5=511f6768a0948d45e6ce0015231af805"

DEPENDS = "npm-hast-util-to-html-native \
           npm-types-hast-native \
           npm-unified-native"

SRC_URI = "https://registry.npmjs.org/rehype-stringify/-/rehype-stringify-9.0.2.tgz"
SRC_URI[md5sum] = "3616ea794c98c421ac7870da51fdaf99"
SRC_URI[sha256sum] = "6d09775f9f43e219c1d30574a41d216e730d47418b29d934a07eb3414e3b81fb"

NPM_PKGNAME = "rehype-stringify"

inherit npmhelper
inherit native
