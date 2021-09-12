SUMMARY = "NPM: htmlparser2"
DESCRIPTION = "Fast & forgiving HTML/XML parser"
HOMEPAGE = "https://github.com/fb55/htmlparser2#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=10e03952c97f225d4229d7524619eb7f"

DEPENDS = "npm-domelementtype-native \
           npm-domhandler-native \
           npm-domutils-native \
           npm-entities-native"

SRC_URI = "https://registry.npmjs.org/htmlparser2/-/htmlparser2-7.1.2.tgz"
SRC_URI[md5sum] = "5a479dd85f9a00552b3ec12a5d0b7405"
SRC_URI[sha256sum] = "6de09a6f6991f6a86f2727ea68ab96d9ce340cff30ab3804f06d7aed096c7832"

NPM_PKGNAME = "htmlparser2"

inherit npmhelper
inherit native
