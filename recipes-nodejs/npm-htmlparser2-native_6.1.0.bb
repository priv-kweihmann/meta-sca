SUMMARY = "NPM: htmlparser2"
DESCRIPTION = "Fast & forgiving HTML/XML parser"
HOMEPAGE = "https://github.com/fb55/htmlparser2#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=10e03952c97f225d4229d7524619eb7f"

DEPENDS = "npm-domelementtype-native \
           npm-domhandler-native \
           npm-domutils-native \
           npm-entities-native"

SRC_URI = "https://registry.npmjs.org/htmlparser2/-/htmlparser2-6.1.0.tgz"
SRC_URI[md5sum] = "b519817d871d4514d446a7aed7a25f0e"
SRC_URI[sha256sum] = "27586a56330e8e17043aaa807dc1dc0062d460972f86b4a2f16bc0aa8f9cbd58"

NPM_PKGNAME = "htmlparser2"

inherit npmhelper
inherit native
