SUMMARY = "NPM: htmlparser2"
DESCRIPTION = "Fast & forgiving HTML/XML parser"
HOMEPAGE = "https://github.com/fb55/htmlparser2#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=10e03952c97f225d4229d7524619eb7f"

DEPENDS = "npm-domelementtype-native \
           npm-domhandler-native \
           npm-domutils-native \
           npm-entities-native"

SRC_URI = "https://registry.npmjs.org/htmlparser2/-/htmlparser2-7.1.1.tgz"
SRC_URI[md5sum] = "6bb1ce5742139cd995a3074da5a9c931"
SRC_URI[sha256sum] = "f32ae210fb9bb58870cb91ef3b22bd1970245ef4dd33666c886c47ada291558e"

NPM_PKGNAME = "htmlparser2"

inherit npmhelper
inherit native
