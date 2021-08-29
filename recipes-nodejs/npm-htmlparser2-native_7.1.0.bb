SUMMARY = "NPM: htmlparser2"
DESCRIPTION = "Fast & forgiving HTML/XML parser"
HOMEPAGE = "https://github.com/fb55/htmlparser2#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=10e03952c97f225d4229d7524619eb7f"

DEPENDS = "npm-domelementtype-native \
           npm-domhandler-native \
           npm-domutils-native \
           npm-entities-native"

SRC_URI = "https://registry.npmjs.org/htmlparser2/-/htmlparser2-7.1.0.tgz"
SRC_URI[md5sum] = "1283d63a30b44278c0cb621212078e77"
SRC_URI[sha256sum] = "bd829b428d21d89ac1f0b17c2d497295975945b99d40288b656401936da0bb35"

NPM_PKGNAME = "htmlparser2"

inherit npmhelper
inherit native
