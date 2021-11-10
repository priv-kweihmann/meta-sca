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

SRC_URI = "https://registry.npmjs.org/@eslint/eslintrc/-/eslintrc-1.0.4.tgz"
SRC_URI[md5sum] = "4ad4b40c876064c444f52bf2590bc959"
SRC_URI[sha256sum] = "0cf33b2037daa760848a04756f73879f0ff3b50c2dec6de83b23372ff08bcbcf"

NPM_PKGNAME = "@eslint/eslintrc"

inherit npmhelper
inherit native
