SUMMARY = "NPM: eslint-plugin-n"
DESCRIPTION = "Additional ESLint's rules for Node.js"
HOMEPAGE = "https://github.com/weiran-zsd/eslint-plugin-node#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=893385a31dda2493704bc7f39bc976a0"

DEPENDS = "npm-builtins-native \
           npm-eslint-plugin-es-native \
           npm-eslint-utils-native \
           npm-ignore-native \
           npm-is-core-module-native \
           npm-minimatch-native \
           npm-resolve-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-n/-/eslint-plugin-n-15.2.0.tgz"
SRC_URI[md5sum] = "b7a0f58b46e00ebb6db1357c76a3bf4b"
SRC_URI[sha256sum] = "61857bb2e9c06af1b3781156aef03529dc229986119fa83a33acff4360d66e3e"

NPM_PKGNAME = "eslint-plugin-n"

inherit npmhelper
inherit native
