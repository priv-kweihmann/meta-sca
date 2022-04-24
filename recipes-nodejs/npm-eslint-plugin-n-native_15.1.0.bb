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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-n/-/eslint-plugin-n-15.1.0.tgz"
SRC_URI[md5sum] = "96c0a3c0fd2b0c674c87f50f885d212a"
SRC_URI[sha256sum] = "f8a317481dc3d9a18b35a65ec707d703b1e9c92c0c25a19ff0e5531f68fc5c36"

NPM_PKGNAME = "eslint-plugin-n"

inherit npmhelper
inherit native
