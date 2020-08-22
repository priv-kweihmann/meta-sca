SUMMARY = "NPM: read-package-json"
DESCRIPTION = "The thing npm uses to read package.json files with semantics and defaults and validation"
HOMEPAGE = "https://github.com/npm/read-package-json#readme"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6392dc4522c189c9616b2ec1ab763bec"

DEPENDS = "npm-glob-native \
           npm-json-parse-even-better-errors-native \
           npm-normalize-package-data-native \
           npm-npm-normalize-package-bin-native"

SRC_URI = "https://registry.npmjs.org/read-package-json/-/read-package-json-2.1.2.tgz"
SRC_URI[md5sum] = "a42c529d55f33192e42d5aa4e3994624"
SRC_URI[sha256sum] = "6245bea210013db44f19930a1a59d2e302b6b8600f1066540f371ddcd5488d68"

NPM_PKGNAME = "read-package-json"

inherit npmhelper
inherit native
