SUMMARY = "NPM: eslint-module-utils"
DESCRIPTION = "Core utilities to support eslint-plugin-import and other module-related plugins."
HOMEPAGE = "https://github.com/benmosher/eslint-plugin-import#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e012cdf02fc1d8b17c6c65424a590feb"

DEPENDS = "npm-debug-native \
           npm-pkg-dir-native"

SRC_URI = "https://registry.npmjs.org/eslint-module-utils/-/eslint-module-utils-2.6.1.tgz"
SRC_URI[md5sum] = "fa43a3e9fb656da0f01d67a724835c63"
SRC_URI[sha256sum] = "96afeaed25065a3c9b7587a848d58d207f700eb107da82a2ab5dd64a2a9bd7fc"

NPM_PKGNAME = "eslint-module-utils"

inherit npmhelper
inherit native
