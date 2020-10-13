SUMMARY = "NPM: read-package-json"
DESCRIPTION = "The thing npm uses to read package.json files with semantics and defaults and validation"
HOMEPAGE = "https://github.com/npm/read-package-json#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6392dc4522c189c9616b2ec1ab763bec"

DEPENDS = "npm-glob-native \
           npm-json-parse-even-better-errors-native \
           npm-normalize-package-data-native \
           npm-npm-normalize-package-bin-native"

SRC_URI = "https://registry.npmjs.org/read-package-json/-/read-package-json-3.0.0.tgz"
SRC_URI[md5sum] = "bea9e820d5f958b1add46569fd1633b4"
SRC_URI[sha256sum] = "0ab8f7b2cbe74cb8ddfb9577c421b22d9b53b35e17afd30479c9d9a6bce1c457"

NPM_PKGNAME = "read-package-json"

inherit npmhelper
inherit native
