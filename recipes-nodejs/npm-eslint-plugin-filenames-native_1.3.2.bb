SUMMARY = "NPM: eslint-plugin-filenames"
DESCRIPTION = "Eslint rule for consistent filenames."
HOMEPAGE = "https://github.com/selaux/eslint-plugin-filenames"

DEPENDS = "npm-lodash.camelcase-native npm-lodash.kebabcase-native npm-lodash.snakecase-native npm-lodash.upperfirst-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-filenames/-/eslint-plugin-filenames-1.3.2.tgz"
SRC_URI[md5sum] = "43594698affab0bb319b31c52f81d507"
SRC_URI[sha256sum] = "1b1b1b7a76b40529f5fde7eaa7791dc93edf5edfe7cd46bdc3141ed57595685a"

NPM_PKGNAME = "eslint-plugin-filenames"

inherit npmhelper
inherit native
