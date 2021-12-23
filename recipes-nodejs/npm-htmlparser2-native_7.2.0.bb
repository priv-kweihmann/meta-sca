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

SRC_URI = "https://registry.npmjs.org/htmlparser2/-/htmlparser2-7.2.0.tgz"
SRC_URI[md5sum] = "81944a6800f0b025b78130b1ebfbfa12"
SRC_URI[sha256sum] = "e682e978245845266080f633d9d00303a78cc4e460ba8742d5c213e5d32bdd8a"

NPM_PKGNAME = "htmlparser2"

inherit npmhelper
inherit native
