SUMMARY = "NPM: eslint-plugin-jsx-a11y"
DESCRIPTION = "Static AST checker for accessibility rules on JSX elements."
HOMEPAGE = "https://github.com/jsx-eslint/eslint-plugin-jsx-a11y#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
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
           npm-language-tags-native \
           npm-minimatch-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-jsx-a11y/-/eslint-plugin-jsx-a11y-6.5.1.tgz"
SRC_URI[md5sum] = "427337683b1bea29d6c05d98c4589829"
SRC_URI[sha256sum] = "66d9ead6f8fc4c204491cd8ce2408007edf817a2277b1f3fc2d1f7f62ca42cba"

NPM_PKGNAME = "eslint-plugin-jsx-a11y"

inherit npmhelper
inherit native
