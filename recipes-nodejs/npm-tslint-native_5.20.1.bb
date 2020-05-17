SUMMARY = "NPM: tslint"
DESCRIPTION = "An extensible static analysis linter for the TypeScript language"
HOMEPAGE = "https://palantir.github.io/tslint"

DEPENDS = "npm-babel-code-frame-native npm-builtin-modules-native npm-chalk-native npm-commander-native npm-diff-native npm-glob-native npm-js-yaml-native npm-minimatch-native npm-mkdirp-native npm-resolve-native npm-semver-native npm-tslib-native npm-tsutils-native"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRC_URI = "https://registry.npmjs.org/tslint/-/tslint-5.20.1.tgz"
SRC_URI[md5sum] = "ce7c46ab63822dcf701ea990fd749028"
SRC_URI[sha256sum] = "958e99984a1abf94adeaecb356cb32e4c2a3db88d84082488fdfda9b11512203"

NPM_PKGNAME = "tslint"

inherit npmhelper
inherit native
