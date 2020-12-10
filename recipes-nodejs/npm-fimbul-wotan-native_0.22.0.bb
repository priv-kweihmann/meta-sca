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

SRC_URI = "https://registry.npmjs.org/@fimbul/wotan/-/wotan-0.22.0.tgz"
SRC_URI[md5sum] = "d2d83890d15cacccf132202df3554bad"
SRC_URI[sha256sum] = "7385734b338361496b51c7b8e62989dbc828eb756a719553119b6ae4d8d6ec19"

NPM_PKGNAME = "@fimbul/wotan"

inherit npmhelper
inherit native
