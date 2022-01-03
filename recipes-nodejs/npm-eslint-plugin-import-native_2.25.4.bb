SUMMARY = "NPM: eslint-plugin-import"
DESCRIPTION = "Import with sanity."
HOMEPAGE = "https://github.com/import-js/eslint-plugin-import"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e012cdf02fc1d8b17c6c65424a590feb"

DEPENDS = "npm-array-includes-native \
           npm-array.prototype.flat-native \
           npm-debug-native \
           npm-doctrine-native \
           npm-eslint-import-resolver-node-native \
           npm-eslint-module-utils-native \
           npm-has-native \
           npm-is-core-module-native \
           npm-is-glob-native \
           npm-minimatch-native \
           npm-object.values-native \
           npm-resolve-native \
           npm-tsconfig-paths-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-import/-/eslint-plugin-import-2.25.4.tgz"
SRC_URI[md5sum] = "441bc6892fc8ba6a5b335b241d27954b"
SRC_URI[sha256sum] = "96d40d97f89261c792a276dc515c20fafbbc4c2e24d6e51d34a53b700957021d"

NPM_PKGNAME = "eslint-plugin-import"

inherit npmhelper
inherit native
