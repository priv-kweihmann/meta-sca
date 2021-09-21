SUMMARY = "NPM: htmlhint"
DESCRIPTION = "The Static Code Analysis Tool for your HTML"
HOMEPAGE = "https://htmlhint.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=9ab22e524b729e8ba6a68fda798ad089"

DEPENDS = "npm-async-native \
           npm-chalk-native \
           npm-commander-native \
           npm-glob-native \
           npm-node-fetch-native \
           npm-parse-glob-native \
           npm-strip-json-comments-native \
           npm-types-node-fetch-native \
           npm-xml-native"

SRC_URI = "https://registry.npmjs.org/htmlhint/-/htmlhint-0.15.2.tgz"
SRC_URI[md5sum] = "d99218ccedaaed12d09111e707d8fa47"
SRC_URI[sha256sum] = "f1971d9047394422ac16fe3e8d369c28f0105315183c3d3f950b12504f04d6cd"

NPM_PKGNAME = "htmlhint"

inherit npmhelper
inherit native
