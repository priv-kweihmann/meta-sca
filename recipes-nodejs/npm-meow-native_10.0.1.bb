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

SRC_URI = "https://registry.npmjs.org/meow/-/meow-10.0.1.tgz"
SRC_URI[md5sum] = "4a4cae4ae8dc120b52d3f6d01092d580"
SRC_URI[sha256sum] = "e656c7d1da329ca48a0ac07bde3ac5b6f02b59b160104b470a4f6fb2cbecca80"

NPM_PKGNAME = "meow"

inherit npmhelper
inherit native
