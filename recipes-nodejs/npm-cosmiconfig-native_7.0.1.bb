SUMMARY = "NPM: cosmiconfig"
DESCRIPTION = "Find and load configuration from a package.json property, rc file, or CommonJS module"
HOMEPAGE = "https://github.com/davidtheclark/cosmiconfig#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=faf65be8f439b913bb5e892b7684a729"

DEPENDS = "npm-import-fresh-native \
           npm-parse-json-native \
           npm-path-type-native \
           npm-types-parse-json-native \
           npm-yaml-native"

SRC_URI = "https://registry.npmjs.org/cosmiconfig/-/cosmiconfig-7.0.1.tgz"
SRC_URI[md5sum] = "fd5d087eaf59550a824fb03c83f8a191"
SRC_URI[sha256sum] = "1b9f862930284ec9842c7f236555b900cf0d26280a24cf634acf7f134176c109"

NPM_PKGNAME = "cosmiconfig"

inherit npmhelper
inherit native
