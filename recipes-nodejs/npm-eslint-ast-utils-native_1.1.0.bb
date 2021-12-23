SUMMARY = "NPM: eslint-ast-utils"
DESCRIPTION = "Utility library to manipulate ASTs"
HOMEPAGE = "https://github.com/jfmengels/eslint-ast-utils#readme"

DEPENDS = "npm-lodash.get-native npm-lodash.zip-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=1e5b333790e6b59d4d4d223304b5e80d"

SRC_URI = "https://registry.npmjs.org/eslint-ast-utils/-/eslint-ast-utils-1.1.0.tgz"
SRC_URI[md5sum] = "71611967fe8bae6ff31c648a0708a5b9"
SRC_URI[sha256sum] = "62c45c2e14c85c42ad67a501c7a7d8dad9e034746b5219b5a3f252b3a7e28fb7"

NPM_PKGNAME = "eslint-ast-utils"

inherit npmhelper
inherit native
