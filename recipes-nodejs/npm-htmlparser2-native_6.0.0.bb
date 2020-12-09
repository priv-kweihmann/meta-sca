SUMMARY = "NPM: htmlparser2"
DESCRIPTION = "Fast & forgiving HTML/XML parser"
HOMEPAGE = "https://github.com/fb55/htmlparser2#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=10e03952c97f225d4229d7524619eb7f"

DEPENDS = "npm-domelementtype-native \
           npm-domhandler-native \
           npm-domutils-native \
           npm-entities-native"

SRC_URI = "https://registry.npmjs.org/htmlparser2/-/htmlparser2-6.0.0.tgz"
SRC_URI[md5sum] = "20d5b164a656f9cb72dc43f4028c1f3f"
SRC_URI[sha256sum] = "5ca00ac4d9f45fae7159fcc27f26fac3b40720f82f373f65e11b1f26310b14e9"

NPM_PKGNAME = "htmlparser2"

inherit npmhelper
inherit native
