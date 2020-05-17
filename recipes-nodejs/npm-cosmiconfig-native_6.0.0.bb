SUMMARY = "NPM: cosmiconfig"
DESCRIPTION = "Find and load configuration from a package.json property, rc file, or CommonJS module"
HOMEPAGE = "https://github.com/davidtheclark/cosmiconfig#readme"

DEPENDS = "npm-import-fresh-native npm-parse-json-native npm-path-type-native npm-types-parse-json-native npm-yaml-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=faf65be8f439b913bb5e892b7684a729"

SRC_URI = "https://registry.npmjs.org/cosmiconfig/-/cosmiconfig-6.0.0.tgz"
SRC_URI[md5sum] = "6c0da4d084535babb1d828762a7f2bac"
SRC_URI[sha256sum] = "81a7376fac0b88dadbf46bf15033ecb77eb4f75d99493d7b46bd3e1ed63726e3"

NPM_PKGNAME = "cosmiconfig"

inherit npmhelper
inherit native
