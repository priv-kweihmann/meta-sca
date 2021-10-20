SUMMARY = "NPM: micromark-util-events-to-acorn"
DESCRIPTION = "micromark utility to try and parse events w/ acorn"
HOMEPAGE = "https://github.com/micromark/micromark-extension-mdx-expression/tree/main#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://readme.md;beginline=117;endline=119;md5=78fe2908aa41cafa888a383cde1de0c1"

DEPENDS = "npm-estree-util-visit-native \
           npm-micromark-util-types-native \
           npm-types-acorn-native \
           npm-types-estree-native \
           npm-uvu-native \
           npm-vfile-message-native"

SRC_URI = "https://registry.npmjs.org/micromark-util-events-to-acorn/-/micromark-util-events-to-acorn-1.0.4.tgz"
SRC_URI[md5sum] = "435c89774580923e650f7a319c5bd332"
SRC_URI[sha256sum] = "dec054070b8fc4051a484166ea16d90b9708045d69583501cf814477823c0b6b"

NPM_PKGNAME = "micromark-util-events-to-acorn"

inherit npmhelper
inherit native
