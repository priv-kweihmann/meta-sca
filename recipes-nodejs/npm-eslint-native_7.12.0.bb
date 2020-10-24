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

SRC_URI = "https://registry.npmjs.org/eslint/-/eslint-7.12.0.tgz"
SRC_URI[md5sum] = "a21e2947296024b7bc2474fce35536db"
SRC_URI[sha256sum] = "eb95a904e6deb4937b3ce473db891d10d17e8fbc146e92e3afd6eb6340d1a6bf"

NPM_PKGNAME = "eslint"

inherit npmhelper
inherit native
