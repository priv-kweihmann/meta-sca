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

SRC_URI = "https://registry.npmjs.org/htmlhint/-/htmlhint-1.0.0.tgz"
SRC_URI[md5sum] = "7766c82a1036673bec1084f6c8036d7c"
SRC_URI[sha256sum] = "a037e4a7f1af930e3c152fbc3f47f8e81058689e11498ad9d770abcd90ff37ed"

NPM_PKGNAME = "htmlhint"

inherit npmhelper
inherit native
