SUMMARY = "NPM: eslint-module-utils"
DESCRIPTION = "Core utilities to support eslint-plugin-import and other module-related plugins."
HOMEPAGE = "https://github.com/import-js/eslint-plugin-import#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e012cdf02fc1d8b17c6c65424a590feb"

DEPENDS = "npm-debug-native \
           npm-find-up-native \
           npm-pkg-dir-native"

SRC_URI = "https://registry.npmjs.org/eslint-module-utils/-/eslint-module-utils-2.7.0.tgz"
SRC_URI[md5sum] = "ea3e664d95a4ff8cca109161e97c66bd"
SRC_URI[sha256sum] = "b756f04a447138de73eb681674a9825782ffb95167c80591eaa25017b7b923a9"

NPM_PKGNAME = "eslint-module-utils"

inherit npmhelper
inherit native
