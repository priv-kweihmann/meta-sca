SUMMARY = "NPM: htmlparser2"
DESCRIPTION = "Fast & forgiving HTML/XML parser"
HOMEPAGE = "https://github.com/fb55/htmlparser2#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=10e03952c97f225d4229d7524619eb7f"

DEPENDS = "npm-domelementtype-native \
           npm-domhandler-native \
           npm-domutils-native \
           npm-entities-native"

SRC_URI = "https://registry.npmjs.org/htmlparser2/-/htmlparser2-8.0.0.tgz"
SRC_URI[md5sum] = "2877d274a68b9e2664455ecb464802ad"
SRC_URI[sha256sum] = "6a30154a449eedbe26c5fdaa62f5d9f00429fb2bc0bb3710f556f3a4f904ab08"

NPM_PKGNAME = "htmlparser2"

inherit npmhelper
inherit native
