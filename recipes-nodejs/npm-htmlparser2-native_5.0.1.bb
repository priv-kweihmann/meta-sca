SUMMARY = "NPM: htmlparser2"
DESCRIPTION = "Fast & forgiving HTML/XML/RSS parser"
HOMEPAGE = "https://github.com/fb55/htmlparser2#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=10e03952c97f225d4229d7524619eb7f"

DEPENDS = "npm-domelementtype-native \
           npm-domhandler-native \
           npm-domutils-native \
           npm-entities-native"

SRC_URI = "https://registry.npmjs.org/htmlparser2/-/htmlparser2-5.0.1.tgz"
SRC_URI[md5sum] = "cc0e4fdf8accb4bb47255c0540b8a63c"
SRC_URI[sha256sum] = "f7671d475acd17c9e452dfeda18edc16bcc0a693c48d8f77f367d5699b83b389"

NPM_PKGNAME = "htmlparser2"

inherit npmhelper
inherit native
