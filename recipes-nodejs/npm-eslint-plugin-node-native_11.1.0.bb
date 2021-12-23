SUMMARY = "NPM: eslint-plugin-node"
DESCRIPTION = "Additional ESLint's rules for Node.js"
HOMEPAGE = "https://github.com/mysticatea/eslint-plugin-node#readme"

DEPENDS = "npm-eslint-plugin-es-native npm-eslint-utils-native npm-ignore-native npm-minimatch-native npm-resolve-native npm-semver-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=893385a31dda2493704bc7f39bc976a0"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-node/-/eslint-plugin-node-11.1.0.tgz"
SRC_URI[md5sum] = "5cd01b6581d4ee5fd0c899e86668af26"
SRC_URI[sha256sum] = "ea5158a318025e6ca59b0ad6f43f118b981f88e4b102ee99233d1e7c2465184b"

NPM_PKGNAME = "eslint-plugin-node"

inherit npmhelper
inherit native
