SUMMARY = "NPM: htmlparser2"
DESCRIPTION = "Fast & forgiving HTML/XML/RSS parser"
HOMEPAGE = "https://github.com/fb55/htmlparser2#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=10e03952c97f225d4229d7524619eb7f"

DEPENDS = "npm-domelementtype-native \
           npm-domhandler-native \
           npm-domutils-native \
           npm-entities-native"

SRC_URI = "https://registry.npmjs.org/htmlparser2/-/htmlparser2-4.1.0.tgz"
SRC_URI[md5sum] = "5e53fda415188ef832857126a43bfc3c"
SRC_URI[sha256sum] = "8cd8c766a8979f475cee366830435b63706f29421f7d437b9e331427c87c77a1"

NPM_PKGNAME = "htmlparser2"

inherit npmhelper
inherit native
