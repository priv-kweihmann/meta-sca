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

SRC_URI = "https://registry.npmjs.org/read-package-json/-/read-package-json-4.1.1.tgz"
SRC_URI[md5sum] = "a5730054c325e03ad439b6136419c657"
SRC_URI[sha256sum] = "4aab5b08a51db641fd8cc2cc58069ca4e5953f2561b4233fb48ec2363b7690b9"

NPM_PKGNAME = "read-package-json"

inherit npmhelper
inherit native
