SUMMARY = "NPM: read-package-json"
DESCRIPTION = "The thing npm uses to read package.json files with semantics and defaults and validation"
HOMEPAGE = "https://github.com/npm/read-package-json#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6392dc4522c189c9616b2ec1ab763bec"

DEPENDS = "npm-glob-native \
           npm-json-parse-even-better-errors-native \
           npm-normalize-package-data-native \
           npm-npm-normalize-package-bin-native"

SRC_URI = "https://registry.npmjs.org/read-package-json/-/read-package-json-5.0.0.tgz"
SRC_URI[md5sum] = "6ce43fd114a20a0013b4a3acc0fe14c2"
SRC_URI[sha256sum] = "1a70a49e727b519ea7caff7d4ae612bef39d22c5c0de8aeedc006920b424f94d"

NPM_PKGNAME = "read-package-json"

inherit npmhelper
inherit native
