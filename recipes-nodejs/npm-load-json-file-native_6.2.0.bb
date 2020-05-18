SUMMARY = "NPM: load-json-file"
DESCRIPTION = "Read and parse a JSON file"
HOMEPAGE = "https://github.com/sindresorhus/load-json-file#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = "npm-graceful-fs-native \
           npm-parse-json-native \
           npm-strip-bom-native \
           npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/load-json-file/-/load-json-file-6.2.0.tgz"
SRC_URI[md5sum] = "0bffb7f15b7d1d51b92a2187b3ffd859"
SRC_URI[sha256sum] = "705c1cfc9c4bc05a0b4962aceee7704745c95fcd20ded3193a68fddbdb62f215"

NPM_PKGNAME = "load-json-file"

inherit npmhelper
inherit native
