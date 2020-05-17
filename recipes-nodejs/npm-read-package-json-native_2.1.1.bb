SUMMARY = "NPM: read-package-json"
DESCRIPTION = "The thing npm uses to read package.json files with semantics and defaults and validation"
HOMEPAGE = "https://github.com/npm/read-package-json#readme"

DEPENDS = "npm-glob-native npm-graceful-fs-native npm-json-parse-better-errors-native npm-normalize-package-data-native npm-npm-normalize-package-bin-native"

LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6392dc4522c189c9616b2ec1ab763bec"

SRC_URI = "https://registry.npmjs.org/read-package-json/-/read-package-json-2.1.1.tgz"
SRC_URI[md5sum] = "9876b6b1386f186c52458bedcd40872d"
SRC_URI[sha256sum] = "17bef613253de6b6c6a5d4658bcefa8931e441cb3aead00121a483745b94ac98"

NPM_PKGNAME = "read-package-json"

inherit npmhelper
inherit native
