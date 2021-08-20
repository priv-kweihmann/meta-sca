SUMMARY = "NPM: read-package-json"
DESCRIPTION = "The thing npm uses to read package.json files with semantics and defaults and validation"
HOMEPAGE = "https://github.com/npm/read-package-json#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6392dc4522c189c9616b2ec1ab763bec"

DEPENDS = "npm-glob-native \
           npm-json-parse-even-better-errors-native \
           npm-normalize-package-data-native \
           npm-npm-normalize-package-bin-native"

SRC_URI = "https://registry.npmjs.org/read-package-json/-/read-package-json-4.0.0.tgz"
SRC_URI[md5sum] = "53dccaeac12ef08d28d9fe8509dd88dd"
SRC_URI[sha256sum] = "3f5d8bb71cf2d01145047340b1e7987cfef11f640747b5b77966743e9a106f67"

NPM_PKGNAME = "read-package-json"

inherit npmhelper
inherit native
