SUMMARY = "NPM: meow"
DESCRIPTION = "CLI app helper"
HOMEPAGE = "https://github.com/sindresorhus/meow#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-arrify-native \
           npm-camelcase-keys-native \
           npm-camelcase-native \
           npm-decamelize-keys-native \
           npm-hard-rejection-native \
           npm-minimist-options-native \
           npm-normalize-package-data-native \
           npm-read-pkg-up-native \
           npm-redent-native \
           npm-trim-newlines-native \
           npm-type-fest-native \
           npm-types-minimist-native \
           npm-yargs-parser-native"

SRC_URI = "https://registry.npmjs.org/meow/-/meow-7.0.1.tgz"
SRC_URI[md5sum] = "0bcd763545abdd58f130c652851e0346"
SRC_URI[sha256sum] = "77b3589d7c16d101ae5ed7a9d0d34246f383c102a058d715f1cd96be9af4c5aa"

NPM_PKGNAME = "meow"

inherit npmhelper
inherit native
