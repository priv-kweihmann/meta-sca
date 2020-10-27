SUMMARY = "NPM: eslint-plugin-jsx-a11y"
DESCRIPTION = "Static AST checker for accessibility rules on JSX elements."
HOMEPAGE = "https://github.com/evcohen/eslint-plugin-jsx-a11y#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8a54d70af8daeb4ac38a9b28b2f24dee"

DEPENDS = "npm-aria-query-native \
           npm-array-includes-native \
           npm-ast-types-flow-native \
           npm-axe-core-native \
           npm-axobject-query-native \
           npm-babel-runtime-native \
           npm-damerau-levenshtein-native \
           npm-emoji-regex-native \
           npm-has-native \
           npm-jsx-ast-utils-native \
           npm-language-tags-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-jsx-a11y/-/eslint-plugin-jsx-a11y-6.4.1.tgz"
SRC_URI[md5sum] = "4e97edfaa3cb1d0cb2052bfcbecc0efc"
SRC_URI[sha256sum] = "d26a9a8e243798a2399aa19549417260be3c95d012c0082c4428d2c565df7faa"

NPM_PKGNAME = "eslint-plugin-jsx-a11y"

inherit npmhelper
inherit native
