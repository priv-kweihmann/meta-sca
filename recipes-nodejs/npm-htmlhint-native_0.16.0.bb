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

SRC_URI = "https://registry.npmjs.org/htmlhint/-/htmlhint-0.16.0.tgz"
SRC_URI[md5sum] = "7ce2c68de3b3babc0d4544892399890a"
SRC_URI[sha256sum] = "fe2a0fbbc63766edf20b564ba92bef5e8fb0478f8d0eff6b38b2acc55dbc3436"

NPM_PKGNAME = "htmlhint"

inherit npmhelper
inherit native
