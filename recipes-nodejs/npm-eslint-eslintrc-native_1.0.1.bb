SUMMARY = "NPM: @eslint/eslintrc"
DESCRIPTION = "The legacy ESLintRC config file format for ESLint"
HOMEPAGE = "https://github.com/eslint/eslintrc#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1f0f520c61625b7338d0a038d6bb8e34"

DEPENDS = "npm-ajv-native \
           npm-debug-native \
           npm-espree-native \
           npm-globals-native \
           npm-ignore-native \
           npm-import-fresh-native \
           npm-js-yaml-native \
           npm-minimatch-native \
           npm-strip-json-comments-native"

SRC_URI = "https://registry.npmjs.org/@eslint/eslintrc/-/eslintrc-1.0.1.tgz"
SRC_URI[md5sum] = "25073089883cf9256630aeb0a662d3e0"
SRC_URI[sha256sum] = "c7bd1e2c448712ac0725edd48d608f4167458737d2afe278e7fc7a7ebf9ec12a"

NPM_PKGNAME = "@eslint/eslintrc"

inherit npmhelper
inherit native
