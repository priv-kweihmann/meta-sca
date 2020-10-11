SUMMARY = "NPM: eslint"
DESCRIPTION = "An AST-based pattern checker for JavaScript."
HOMEPAGE = "https://eslint.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=04d32f89e7aa1677f8a860eb0b6adb83"

DEPENDS = "npm-ajv-native \
           npm-babel-code-frame-native \
           npm-chalk-native \
           npm-cross-spawn-native \
           npm-debug-native \
           npm-doctrine-native \
           npm-enquirer-native \
           npm-eslint-eslintrc-native \
           npm-eslint-scope-native \
           npm-eslint-utils-native \
           npm-eslint-visitor-keys-native \
           npm-espree-native \
           npm-esquery-native \
           npm-esutils-native \
           npm-file-entry-cache-native \
           npm-functional-red-black-tree-native \
           npm-glob-parent-native \
           npm-globals-native \
           npm-ignore-native \
           npm-import-fresh-native \
           npm-imurmurhash-native \
           npm-is-glob-native \
           npm-js-yaml-native \
           npm-json-stable-stringify-without-jsonify-native \
           npm-levn-native \
           npm-lodash-native \
           npm-minimatch-native \
           npm-natural-compare-native \
           npm-optionator-native \
           npm-progress-native \
           npm-regexpp-native \
           npm-semver-native \
           npm-strip-ansi-native \
           npm-strip-json-comments-native \
           npm-table-native \
           npm-text-table-native \
           npm-v8-compile-cache-native"

SRC_URI = "https://registry.npmjs.org/eslint/-/eslint-7.11.0.tgz"
SRC_URI[md5sum] = "5781274576a615087b9fd5513974d81a"
SRC_URI[sha256sum] = "f4d34cfb473c42d49406dfbe314bea1b920a7537360765e5da5cf64dd822ae7f"

NPM_PKGNAME = "eslint"

inherit npmhelper
inherit native
