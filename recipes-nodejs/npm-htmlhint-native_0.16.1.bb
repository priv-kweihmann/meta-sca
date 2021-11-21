SUMMARY = "NPM: htmlhint"
DESCRIPTION = "The Static Code Analysis Tool for your HTML"
HOMEPAGE = "https://htmlhint.com"

DEFAULT_PREFERENCE = "-1"
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

SRC_URI = "https://registry.npmjs.org/htmlhint/-/htmlhint-0.16.1.tgz"
SRC_URI[md5sum] = "5dc1cfd750b9e8165c050024e7c8c1db"
SRC_URI[sha256sum] = "854ab3d85b6a0235ffd205a38825a890c7d86d8c62721847ef418faa8c9350e9"

NPM_PKGNAME = "htmlhint"

inherit npmhelper
inherit native
