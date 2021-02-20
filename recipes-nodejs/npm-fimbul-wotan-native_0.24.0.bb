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

SRC_URI = "https://registry.npmjs.org/@fimbul/wotan/-/wotan-0.24.0.tgz"
SRC_URI[md5sum] = "27887bcdd051082482ad13550678ea26"
SRC_URI[sha256sum] = "944ac40f468235a0d65eb314431c86d9d1449a220532b078db184690f9452135"

NPM_PKGNAME = "@fimbul/wotan"

inherit npmhelper
inherit native
