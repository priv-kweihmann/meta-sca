SUMMARY = "NPM: eslint-module-utils"
DESCRIPTION = "Core utilities to support eslint-plugin-import and other module-related plugins."
HOMEPAGE = "https://github.com/import-js/eslint-plugin-import#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e012cdf02fc1d8b17c6c65424a590feb"

DEPENDS = "npm-debug-native \
           npm-find-up-native \
           npm-pkg-dir-native"

SRC_URI = "https://registry.npmjs.org/eslint-module-utils/-/eslint-module-utils-2.7.1.tgz"
SRC_URI[md5sum] = "a6766be0141e3a9ac35a5757c966e455"
SRC_URI[sha256sum] = "222fb4c220f3a1995669a47a164e3dbf11bf7231b2289691ecbdf66380a1d626"

NPM_PKGNAME = "eslint-module-utils"

inherit npmhelper
inherit native
