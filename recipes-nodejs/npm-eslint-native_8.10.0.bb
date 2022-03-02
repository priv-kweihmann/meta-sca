SUMMARY = "NPM: eslint"
DESCRIPTION = "An AST-based pattern checker for JavaScript."
HOMEPAGE = "https://eslint.org"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b58aa052648f366fd94c13b91b417d5"

DEPENDS = "npm-ajv-native \
           npm-chalk-native \
           npm-cross-spawn-native \
           npm-debug-native \
           npm-doctrine-native \
           npm-escape-string-regexp-native \
           npm-eslint-eslintrc-native \
           npm-eslint-scope-native \
           npm-eslint-utils-native \
           npm-eslint-visitor-keys-native \
           npm-espree-native \
           npm-esquery-native \
           npm-esutils-native \
           npm-fast-deep-equal-native \
           npm-file-entry-cache-native \
           npm-functional-red-black-tree-native \
           npm-glob-parent-native \
           npm-globals-native \
           npm-humanwhocodes-config-array-native \
           npm-ignore-native \
           npm-import-fresh-native \
           npm-imurmurhash-native \
           npm-is-glob-native \
           npm-js-yaml-native \
           npm-json-stable-stringify-without-jsonify-native \
           npm-levn-native \
           npm-lodash.merge-native \
           npm-minimatch-native \
           npm-natural-compare-native \
           npm-optionator-native \
           npm-regexpp-native \
           npm-strip-ansi-native \
           npm-strip-json-comments-native \
           npm-text-table-native \
           npm-v8-compile-cache-native"

SRC_URI = "https://registry.npmjs.org/eslint/-/eslint-8.10.0.tgz"
SRC_URI[md5sum] = "6498d4a2c5fa53b90cc0fbf21bc0c38b"
SRC_URI[sha256sum] = "dadd508c13ac5c54ad0f38d37f338c6f86707101915e6dec84f3e4511c96baa5"

NPM_PKGNAME = "eslint"

inherit npmhelper
inherit native
