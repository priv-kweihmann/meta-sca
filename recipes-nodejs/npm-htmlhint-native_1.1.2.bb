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

SRC_URI = "https://registry.npmjs.org/htmlhint/-/htmlhint-1.1.2.tgz"
SRC_URI[md5sum] = "395f6fe79eca5fc4e64b6d4fe77fa9ac"
SRC_URI[sha256sum] = "0f2d70c142f46e3a19120247c346ff288ddac3fa37001eb1b5f98ec3141e276d"

NPM_PKGNAME = "htmlhint"

inherit npmhelper
inherit native
