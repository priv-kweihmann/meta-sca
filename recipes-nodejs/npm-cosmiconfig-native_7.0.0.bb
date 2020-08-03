SUMMARY = "NPM: cosmiconfig"
DESCRIPTION = "Find and load configuration from a package.json property, rc file, or CommonJS module"
HOMEPAGE = "https://github.com/davidtheclark/cosmiconfig#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=faf65be8f439b913bb5e892b7684a729"

DEPENDS = "npm-import-fresh-native \
           npm-parse-json-native \
           npm-path-type-native \
           npm-types-parse-json-native \
           npm-yaml-native"

SRC_URI = "https://registry.npmjs.org/cosmiconfig/-/cosmiconfig-7.0.0.tgz"
SRC_URI[md5sum] = "b4478a77634a418c0135a198ab56b977"
SRC_URI[sha256sum] = "e8c9489c9450e044af37dfb869f7609727a825e592af254532182fff9c8e18f8"

NPM_PKGNAME = "cosmiconfig"

inherit npmhelper
inherit native
