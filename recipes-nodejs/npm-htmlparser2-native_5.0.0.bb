SUMMARY = "NPM: htmlparser2"
DESCRIPTION = "Fast & forgiving HTML/XML/RSS parser"
HOMEPAGE = "https://github.com/fb55/htmlparser2#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=10e03952c97f225d4229d7524619eb7f"

DEPENDS = "npm-domelementtype-native \
           npm-domhandler-native \
           npm-domutils-native \
           npm-entities-native"

SRC_URI = "https://registry.npmjs.org/htmlparser2/-/htmlparser2-5.0.0.tgz"
SRC_URI[md5sum] = "e4ead463c1abd931f8766e14d415f693"
SRC_URI[sha256sum] = "70c4ca073afa70e389540d66a12dd85269bbadad83fb109e3ab11b82fa32d588"

NPM_PKGNAME = "htmlparser2"

inherit npmhelper
inherit native
