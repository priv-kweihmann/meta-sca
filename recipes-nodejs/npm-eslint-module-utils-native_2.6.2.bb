SUMMARY = "NPM: eslint-module-utils"
DESCRIPTION = "Core utilities to support eslint-plugin-import and other module-related plugins."
HOMEPAGE = "https://github.com/import-js/eslint-plugin-import#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e012cdf02fc1d8b17c6c65424a590feb"

DEPENDS = "npm-debug-native \
           npm-pkg-dir-native"

SRC_URI = "https://registry.npmjs.org/eslint-module-utils/-/eslint-module-utils-2.6.2.tgz"
SRC_URI[md5sum] = "06d10ef4318597aff69e1d2e237c65c8"
SRC_URI[sha256sum] = "c6769f6c2bfbf0a5363f9999b4271c4c6ed09d2eb55ee839062d65bd7765a94a"

NPM_PKGNAME = "eslint-module-utils"

inherit npmhelper
inherit native
