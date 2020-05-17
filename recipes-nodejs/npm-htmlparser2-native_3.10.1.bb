SUMMARY = "NPM: htmlparser2"
DESCRIPTION = "Fast & forgiving HTML/XML/RSS parser"
HOMEPAGE = "https://github.com/fb55/htmlparser2#readme"

DEPENDS = "npm-domelementtype-native npm-domhandler-native npm-domutils-native npm-entities-native npm-inherits-native npm-readable-stream-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=10e03952c97f225d4229d7524619eb7f"

SRC_URI = "https://registry.npmjs.org/htmlparser2/-/htmlparser2-3.10.1.tgz"
SRC_URI[md5sum] = "a2f6ce3a97bcbe114af9a0393d394b4b"
SRC_URI[sha256sum] = "d61041c2679b64759ce176ab72431cb719e45f1aac6bbaf3ee8b460d3153fc82"

NPM_PKGNAME = "htmlparser2"

inherit npmhelper
inherit native
