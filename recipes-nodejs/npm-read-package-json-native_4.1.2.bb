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

SRC_URI = "https://registry.npmjs.org/read-package-json/-/read-package-json-4.1.2.tgz"
SRC_URI[md5sum] = "e42055bc6aac4cb9d7ac2cd68d9b6ea9"
SRC_URI[sha256sum] = "841fa40f8fbbdaed77c529419fd8edee1a8a54bf9b658d492d85840db0b0f42e"

NPM_PKGNAME = "read-package-json"

inherit npmhelper
inherit native
