SUMMARY = "NPM: htmlparser2"
DESCRIPTION = "Fast & forgiving HTML/XML parser"
HOMEPAGE = "https://github.com/fb55/htmlparser2#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=10e03952c97f225d4229d7524619eb7f"

DEPENDS = "npm-domelementtype-native \
           npm-domhandler-native \
           npm-domutils-native \
           npm-entities-native"

SRC_URI = "https://registry.npmjs.org/htmlparser2/-/htmlparser2-7.0.0.tgz"
SRC_URI[md5sum] = "72c4ea0cc62e3ed5420feca3f6030638"
SRC_URI[sha256sum] = "e1260b050404fd41e0f454e08637616b342fe664d8ed8da85d4cb2dbc08c0a56"

NPM_PKGNAME = "htmlparser2"

inherit npmhelper
inherit native
