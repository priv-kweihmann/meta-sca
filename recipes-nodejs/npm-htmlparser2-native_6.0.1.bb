SUMMARY = "NPM: htmlparser2"
DESCRIPTION = "Fast & forgiving HTML/XML parser"
HOMEPAGE = "https://github.com/fb55/htmlparser2#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=10e03952c97f225d4229d7524619eb7f"

DEPENDS = "npm-domelementtype-native \
           npm-domhandler-native \
           npm-domutils-native \
           npm-entities-native"

SRC_URI = "https://registry.npmjs.org/htmlparser2/-/htmlparser2-6.0.1.tgz"
SRC_URI[md5sum] = "593098afe64f7082948173d76580feea"
SRC_URI[sha256sum] = "dfaf1d72f976c0af3d5bf1a81eea4a587e45d9aec49017b5cc05a7bc5367f805"

NPM_PKGNAME = "htmlparser2"

inherit npmhelper
inherit native
