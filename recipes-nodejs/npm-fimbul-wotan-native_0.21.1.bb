SUMMARY = "NPM: @fimbul/wotan"
DESCRIPTION = "Pluggable TypeScript and JavaScript linter"
HOMEPAGE = "https://github.com/fimbullinter/wotan#readme"

DEPENDS = "npm-bind-decorator-native npm-chalk-native npm-debug-native npm-diff-native npm-fimbul-mimir-native npm-fimbul-ymir-native npm-glob-native npm-import-local-native npm-inversify-native npm-is-negated-glob-native npm-js-yaml-native npm-json5-native npm-minimatch-native npm-normalize-glob-native npm-reflect-metadata-native npm-resolve-native npm-semver-native npm-stable-native npm-tslib-native npm-tsutils-native"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI = "https://registry.npmjs.org/@fimbul/wotan/-/wotan-0.21.1.tgz"
SRC_URI[md5sum] = "3e75e9c8b45055ac444a40326e1c948d"
SRC_URI[sha256sum] = "91b9bcb870ad3be64b0962fc6d7f0a14f603d243d4b8ee508c89a78e734ec36f"

NPM_PKGNAME = "@fimbul/wotan"

inherit npmhelper
inherit native
