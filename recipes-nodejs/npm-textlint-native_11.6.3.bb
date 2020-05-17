SUMMARY = "NPM: textlint"
DESCRIPTION = "The pluggable linting tool for text and markdown."
HOMEPAGE = "https://github.com/textlint/textlint/"

DEPENDS = "npm-debug-native npm-deep-equal-native npm-file-entry-cache-native npm-get-stdin-native npm-glob-native npm-is-file-native npm-log-symbols-native npm-map-like-native npm-md5-native npm-mkdirp-native npm-optionator-native npm-path-to-glob-pattern-native npm-rc-config-loader-native npm-read-pkg-native npm-read-pkg-up-native npm-structured-source-native npm-textlint-ast-node-types-native npm-textlint-ast-traverse-native npm-textlint-feature-flag-native npm-textlint-fixer-formatter-native npm-textlint-kernel-native npm-textlint-linter-formatter-native npm-textlint-module-interop-native npm-textlint-textlint-plugin-markdown-native npm-textlint-textlint-plugin-text-native npm-textlint-types-native npm-textlint-utils-native npm-try-resolve-native npm-unique-concat-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f3452a94937d21f84bc38880f636e3ba"

SRC_URI = "https://registry.npmjs.org/textlint/-/textlint-11.6.3.tgz"
SRC_URI[md5sum] = "19f358f150cfba1c5b064ceab7e79287"
SRC_URI[sha256sum] = "2206c45f212c4d2d7b99364315da11c712c59eab97a2ddb415fe9aea255bcee8"

NPM_PKGNAME = "textlint"

inherit npmhelper
inherit native
