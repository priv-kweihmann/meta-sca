SUMMARY = "NPM: eslint-module-utils"
DESCRIPTION = "Core utilities to support eslint-plugin-import and other module-related plugins."
HOMEPAGE = "https://github.com/import-js/eslint-plugin-import#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e012cdf02fc1d8b17c6c65424a590feb"

DEPENDS = "npm-debug-native \
           npm-find-up-native"

SRC_URI = "https://registry.npmjs.org/eslint-module-utils/-/eslint-module-utils-2.7.2.tgz"
SRC_URI[md5sum] = "79a6ea211f3811628f816c0997025993"
SRC_URI[sha256sum] = "06f646b840f8caa47aa6e10eddf44aafaafbfb4567b2b036e84fb651b4d0e339"

NPM_PKGNAME = "eslint-module-utils"

inherit npmhelper
inherit native
