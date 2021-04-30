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

SRC_URI = "https://registry.npmjs.org/stylelint/-/stylelint-13.13.0.tgz"
SRC_URI[md5sum] = "9b4f227831efa11e1c2c49a554069280"
SRC_URI[sha256sum] = "aa7aa57d7c42141004aa84e77ff4a74b4e5a69cd77b947d5df024c070d946b5c"

NPM_PKGNAME = "stylelint"

inherit npmhelper
inherit native
