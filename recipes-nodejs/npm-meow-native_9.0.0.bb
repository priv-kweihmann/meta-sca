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

SRC_URI = "https://registry.npmjs.org/meow/-/meow-9.0.0.tgz"
SRC_URI[md5sum] = "b76319f9ddd1025286a332b61d16ba75"
SRC_URI[sha256sum] = "bdaf3a3157dd7c6dd9c82dfcf390e2753021b513eb58c0ebca9c9ea5c4640ce2"

NPM_PKGNAME = "meow"

inherit npmhelper
inherit native
