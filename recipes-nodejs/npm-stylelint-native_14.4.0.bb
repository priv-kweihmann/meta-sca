SUMMARY = "NPM: stylelint"
DESCRIPTION = "A mighty, modern CSS linter."
HOMEPAGE = "https://stylelint.io"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0e0ecf49fffcf64b1f3fa0a956ea44a0"

DEPENDS = "npm-balanced-match-native \
           npm-colord-native \
           npm-cosmiconfig-native \
           npm-css-functions-list-native \
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
           npm-is-plain-object-native \
           npm-known-css-properties-native \
           npm-mathml-tag-names-native \
           npm-meow-native \
           npm-micromatch-native \
           npm-normalize-path-native \
           npm-normalize-selector-native \
           npm-picocolors-native \
           npm-postcss-media-query-parser-native \
           npm-postcss-native \
           npm-postcss-resolve-nested-selector-native \
           npm-postcss-safe-parser-native \
           npm-postcss-selector-parser-native \
           npm-postcss-value-parser-native \
           npm-resolve-from-native \
           npm-specificity-native \
           npm-string-width-native \
           npm-strip-ansi-native \
           npm-style-search-native \
           npm-supports-hyperlinks-native \
           npm-svg-tags-native \
           npm-table-native \
           npm-v8-compile-cache-native \
           npm-write-file-atomic-native"

SRC_URI = "https://registry.npmjs.org/stylelint/-/stylelint-14.4.0.tgz"
SRC_URI[md5sum] = "3a114755764b7908811e0dcba192bd7b"
SRC_URI[sha256sum] = "a3af74f97313d2e34439309c7c6c007d28251adb41cad1c97d8d0ca6dee8960e"

NPM_PKGNAME = "stylelint"

inherit npmhelper
inherit native
