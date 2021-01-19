SUMMARY = "NPM: parse-json"
DESCRIPTION = "Parse JSON with more helpful errors"
HOMEPAGE = "https://github.com/sindresorhus/parse-json#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-babel-code-frame-native \
           npm-error-ex-native \
           npm-json-parse-even-better-errors-native \
           npm-lines-and-columns-native"

SRC_URI = "https://registry.npmjs.org/parse-json/-/parse-json-5.2.0.tgz"
SRC_URI[md5sum] = "e57264dc3a419b54a3438bb71e1a17b9"
SRC_URI[sha256sum] = "06b73684e0fdc2344daa6b718cdbeb3365339deab8ce8d0cc3cf3ff80d7b088d"

NPM_PKGNAME = "parse-json"

inherit npmhelper
inherit native
