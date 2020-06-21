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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-jsx-a11y/-/eslint-plugin-jsx-a11y-6.3.1.tgz"
SRC_URI[md5sum] = "bdc544c16969b9d425eb1c65bec17e8b"
SRC_URI[sha256sum] = "67bf1436be19c540c4d110a91622da1c176646e03f33a5737fcf472fb67c38a1"

NPM_PKGNAME = "eslint-plugin-jsx-a11y"

inherit npmhelper
inherit native
