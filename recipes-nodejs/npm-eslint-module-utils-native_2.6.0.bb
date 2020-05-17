SUMMARY = "NPM: eslint-module-utils"
DESCRIPTION = "Core utilities to support eslint-plugin-import and other module-related plugins."
HOMEPAGE = "https://github.com/benmosher/eslint-plugin-import#readme"

DEPENDS = "npm-debug-native npm-pkg-dir-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e012cdf02fc1d8b17c6c65424a590feb"

SRC_URI = "https://registry.npmjs.org/eslint-module-utils/-/eslint-module-utils-2.6.0.tgz"
SRC_URI[md5sum] = "5ecdb9b4fe2d18892cb28fa4c376fc54"
SRC_URI[sha256sum] = "7aadc77cd4dc6c6e070c4f87eeb40644952bff6efe5e9aaf14d53090a0582b51"

NPM_PKGNAME = "eslint-module-utils"

inherit npmhelper
inherit native
