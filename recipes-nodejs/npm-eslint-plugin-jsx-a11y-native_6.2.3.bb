SUMMARY = "NPM: eslint-plugin-jsx-a11y"
DESCRIPTION = "Static AST checker for accessibility rules on JSX elements."
HOMEPAGE = "https://github.com/evcohen/eslint-plugin-jsx-a11y#readme"

DEPENDS = "npm-aria-query-native npm-array-includes-native npm-ast-types-flow-native npm-axobject-query-native npm-babel-runtime-native npm-damerau-levenshtein-native npm-emoji-regex-native npm-has-native npm-jsx-ast-utils-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=8a54d70af8daeb4ac38a9b28b2f24dee"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-jsx-a11y/-/eslint-plugin-jsx-a11y-6.2.3.tgz"
SRC_URI[md5sum] = "ce5da7c9482e1d90ee42fef40361349c"
SRC_URI[sha256sum] = "1d85a065d6bf8235d48fbf2f81e307fdb0e1ec831cafc24d63595e9f73129d38"

NPM_PKGNAME = "eslint-plugin-jsx-a11y"

inherit npmhelper
inherit native
