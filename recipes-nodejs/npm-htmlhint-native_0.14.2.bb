SUMMARY = "NPM: htmlhint"
DESCRIPTION = "The Static Code Analysis Tool for your HTML"
HOMEPAGE = "https://htmlhint.com"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=9ab22e524b729e8ba6a68fda798ad089"

DEPENDS = "npm-async-native \
           npm-chalk-native \
           npm-commander-native \
           npm-glob-native \
           npm-parse-glob-native \
           npm-request-native \
           npm-strip-json-comments-native \
           npm-xml-native"

SRC_URI = "https://registry.npmjs.org/htmlhint/-/htmlhint-0.14.2.tgz"
SRC_URI[md5sum] = "6c54febb1b41e4f3f6d337d9d24f0997"
SRC_URI[sha256sum] = "c8c6dbdbc14cbcbc20e494795b86eef31b994d3a08586745da2555637fcf5d0b"

NPM_PKGNAME = "htmlhint"

inherit npmhelper
inherit native
