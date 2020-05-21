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
           npm-leven-native \
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
           npm-postcss-reporter-native \
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

SRC_URI = "https://registry.npmjs.org/stylelint/-/stylelint-13.5.0.tgz"
SRC_URI[md5sum] = "1e176eaa92dff332f8e0dde6570abd14"
SRC_URI[sha256sum] = "c0525de5f85d29422b0ea83e94c24a5ea71e62ce960a701aa21ceec2a3a06fc4"

NPM_PKGNAME = "stylelint"

inherit npmhelper
inherit native
