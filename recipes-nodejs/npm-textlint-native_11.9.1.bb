SUMMARY = "NPM: textlint"
DESCRIPTION = "The pluggable linting tool for text and markdown."
HOMEPAGE = "https://github.com/textlint/textlint/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=f3452a94937d21f84bc38880f636e3ba"

DEPENDS = "npm-debug-native \
           npm-deep-equal-native \
           npm-file-entry-cache-native \
           npm-get-stdin-native \
           npm-glob-native \
           npm-is-file-native \
           npm-log-symbols-native \
           npm-map-like-native \
           npm-md5-native \
           npm-mkdirp-native \
           npm-optionator-native \
           npm-path-to-glob-pattern-native \
           npm-rc-config-loader-native \
           npm-read-pkg-native \
           npm-read-pkg-up-native \
           npm-structured-source-native \
           npm-textlint-ast-node-types-native \
           npm-textlint-ast-traverse-native \
           npm-textlint-feature-flag-native \
           npm-textlint-fixer-formatter-native \
           npm-textlint-kernel-native \
           npm-textlint-linter-formatter-native \
           npm-textlint-module-interop-native \
           npm-textlint-textlint-plugin-markdown-native \
           npm-textlint-textlint-plugin-text-native \
           npm-textlint-types-native \
           npm-textlint-utils-native \
           npm-try-resolve-native \
           npm-unique-concat-native"

SRC_URI = "https://registry.npmjs.org/textlint/-/textlint-11.9.1.tgz"
SRC_URI[md5sum] = "1f46e2a3e10d609f11ce9042abeeb56a"
SRC_URI[sha256sum] = "c954b8bd99c7fcf2a5ec354614b23e3b4a5dc30b203889476792662acccb7165"

NPM_PKGNAME = "textlint"

inherit npmhelper
inherit native
