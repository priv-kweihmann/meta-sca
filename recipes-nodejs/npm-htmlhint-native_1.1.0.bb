SUMMARY = "NPM: htmlhint"
DESCRIPTION = "The Static Code Analysis Tool for your HTML"
HOMEPAGE = "https://htmlhint.com"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=9ab22e524b729e8ba6a68fda798ad089"

DEPENDS = "npm-async-native \
           npm-chalk-native \
           npm-commander-native \
           npm-glob-native \
           npm-node-fetch-native \
           npm-parse-glob-native \
           npm-strip-json-comments-native \
           npm-xml-native"

SRC_URI = "https://registry.npmjs.org/htmlhint/-/htmlhint-1.1.0.tgz"
SRC_URI[md5sum] = "8cf506073d688e783a6bd96ca59aeb6d"
SRC_URI[sha256sum] = "1693803a30098df77741f82d857694baf4b2d132000134983040af197409ba4d"

NPM_PKGNAME = "htmlhint"

inherit npmhelper
inherit native
