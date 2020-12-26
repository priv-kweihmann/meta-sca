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

SRC_URI = "https://registry.npmjs.org/meow/-/meow-8.1.0.tgz"
SRC_URI[md5sum] = "934cf207bc120f040ac0ba601da1c8fb"
SRC_URI[sha256sum] = "5bf1e6cc259f654718f69174f6c3288a028860eb490af780aeb2114cc7a0d93e"

NPM_PKGNAME = "meow"

inherit npmhelper
inherit native
