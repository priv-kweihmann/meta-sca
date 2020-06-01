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

SRC_URI = "https://registry.npmjs.org/htmlhint/-/htmlhint-0.14.0.tgz"
SRC_URI[md5sum] = "c921b4a14901e04dab10e8c9abf13388"
SRC_URI[sha256sum] = "ada1d7be880d891de56f2d4293feb85b3da0c20ad60b8c99b931bb48dcbdfabd"

NPM_PKGNAME = "htmlhint"

inherit npmhelper
inherit native
