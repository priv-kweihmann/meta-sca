SUMMARY = "NPM: @fimbul/wotan"
DESCRIPTION = "Pluggable TypeScript and JavaScript linter"
HOMEPAGE = "https://github.com/fimbullinter/wotan#readme"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS = "npm-bind-decorator-native \
           npm-chalk-native \
           npm-debug-native \
           npm-diff-native \
           npm-fimbul-mimir-native \
           npm-fimbul-ymir-native \
           npm-glob-native \
           npm-import-local-native \
           npm-inversify-native \
           npm-is-negated-glob-native \
           npm-js-yaml-native \
           npm-json5-native \
           npm-minimatch-native \
           npm-normalize-glob-native \
           npm-reflect-metadata-native \
           npm-resolve-native \
           npm-semver-native \
           npm-stable-native \
           npm-tslib-native \
           npm-tsutils-native"

SRC_URI = "https://registry.npmjs.org/@fimbul/wotan/-/wotan-0.23.0.tgz"
SRC_URI[md5sum] = "223d5af199822d7230558776cf5b2564"
SRC_URI[sha256sum] = "9072f33c5ad517d6db05e2beb7c14bd5f0abb259a9e9a2ea783e9ab11320f6fe"

NPM_PKGNAME = "@fimbul/wotan"

inherit npmhelper
inherit native
