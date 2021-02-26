SUMMARY = "NPM: read-package-json"
DESCRIPTION = "The thing npm uses to read package.json files with semantics and defaults and validation"
HOMEPAGE = "https://github.com/npm/read-package-json#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6392dc4522c189c9616b2ec1ab763bec"

DEPENDS = "npm-glob-native \
           npm-json-parse-even-better-errors-native \
           npm-normalize-package-data-native \
           npm-npm-normalize-package-bin-native"

SRC_URI = "https://registry.npmjs.org/read-package-json/-/read-package-json-3.0.1.tgz"
SRC_URI[md5sum] = "29473f2a70abde99e92e61fa210f9add"
SRC_URI[sha256sum] = "50646f8d7cda732450983809d51dd515668aa666cf4119aa72b238667108c777"

NPM_PKGNAME = "read-package-json"

inherit npmhelper
inherit native
