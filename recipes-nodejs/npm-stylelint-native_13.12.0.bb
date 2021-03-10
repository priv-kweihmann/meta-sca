SUMMARY = "NPM: stylelint"
DESCRIPTION = "A mighty, modern CSS linter."
HOMEPAGE = "https://stylelint.io"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0e0ecf49fffcf64b1f3fa0a956ea44a0"

DEPENDS = "npm-autoprefixer-native \
           npm-balanced-match-native \
           npm-chalk-native \
           npm-cosmiconfig-native \
           npm-debug-native \
           npm-execall-native \
           npm-fast-glob-native \
           npm-fastest-levenshtein-native \
           npm-file-entry-cache-native \
           npm-get-stdin-native \
           npm-global-modules-native \
           npm-globby-native \
           npm-globjoin-native \
           npm-html-tags-native \
           npm-ignore-native \
           npm-import-lazy-native \
           npm-imurmurhash-native \
           npm-known-css-properties-native \
           npm-lodash-native \
           npm-log-symbols-native \
           npm-mathml-tag-names-native \
           npm-meow-native \
           npm-micromatch-native \
           npm-normalize-selector-native \
           npm-postcss-html-native \
           npm-postcss-less-native \
           npm-postcss-media-query-parser-native \
           npm-postcss-native \
           npm-postcss-resolve-nested-selector-native \
           npm-postcss-safe-parser-native \
           npm-postcss-sass-native \
           npm-postcss-scss-native \
           npm-postcss-selector-parser-native \
           npm-postcss-syntax-native \
           npm-postcss-value-parser-native \
           npm-resolve-from-native \
           npm-slash-native \
           npm-specificity-native \
           npm-string-width-native \
           npm-strip-ansi-native \
           npm-style-search-native \
           npm-stylelint-postcss-css-in-js-native \
           npm-stylelint-postcss-markdown-native \
           npm-sugarss-native \
           npm-svg-tags-native \
           npm-table-native \
           npm-v8-compile-cache-native \
           npm-write-file-atomic-native"

SRC_URI = "https://registry.npmjs.org/stylelint/-/stylelint-13.12.0.tgz"
SRC_URI[md5sum] = "86bda794d5be31c3e1358d69fe9dafe2"
SRC_URI[sha256sum] = "d6152dc2ff4deecd5c7b94cd3ecef81031fa94310ba567098ff8cc2dfb1abf25"

NPM_PKGNAME = "stylelint"

inherit npmhelper
inherit native
