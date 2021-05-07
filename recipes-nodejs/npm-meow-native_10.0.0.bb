SUMMARY = "NPM: meow"
DESCRIPTION = "CLI app helper"
HOMEPAGE = "https://github.com/sindresorhus/meow#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-camelcase-keys-native \
           npm-decamelize-keys-native \
           npm-decamelize-native \
           npm-hard-rejection-native \
           npm-minimist-options-native \
           npm-normalize-package-data-native \
           npm-read-pkg-up-native \
           npm-redent-native \
           npm-trim-newlines-native \
           npm-type-fest-native \
           npm-types-minimist-native \
           npm-yargs-parser-native"

SRC_URI = "https://registry.npmjs.org/meow/-/meow-10.0.0.tgz"
SRC_URI[md5sum] = "6b79c39612191e2fc675e6218707933f"
SRC_URI[sha256sum] = "3edb7a9e9a8dac8bcf94d25c168fac145c13abbcb4f432c0a95d366e4d5c264b"

NPM_PKGNAME = "meow"

inherit npmhelper
inherit native
