SUMMARY = "NPM: meow"
DESCRIPTION = "CLI app helper"
HOMEPAGE = "https://github.com/sindresorhus/meow#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-camelcase-keys-native \
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

SRC_URI = "https://registry.npmjs.org/meow/-/meow-7.1.0.tgz"
SRC_URI[md5sum] = "64f61430a6025dbcd1a041479baf0d1a"
SRC_URI[sha256sum] = "e6aff605afa86b97d77c7f189df1a065d590eaf9a6da3f986cf5ed72a95ad5ab"

NPM_PKGNAME = "meow"

inherit npmhelper
inherit native
