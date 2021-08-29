SUMMARY = "NPM: read-package-json"
DESCRIPTION = "The thing npm uses to read package.json files with semantics and defaults and validation"
HOMEPAGE = "https://github.com/npm/read-package-json#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6392dc4522c189c9616b2ec1ab763bec"

DEPENDS = "npm-glob-native \
           npm-json-parse-even-better-errors-native \
           npm-normalize-package-data-native \
           npm-npm-normalize-package-bin-native"

SRC_URI = "https://registry.npmjs.org/read-package-json/-/read-package-json-4.0.1.tgz"
SRC_URI[md5sum] = "d30db9b80dff2613f1e44b65756f7aa2"
SRC_URI[sha256sum] = "a93b601b94e0e5bb52caef3abe0a4552de035ed56f56a8c9a76be366851347b7"

NPM_PKGNAME = "read-package-json"

inherit npmhelper
inherit native
