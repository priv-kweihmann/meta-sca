SUMMARY = "NPM: cli-cursor"
DESCRIPTION = "Toggle the CLI cursor"
HOMEPAGE = "https://github.com/sindresorhus/cli-cursor#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-restore-cursor-native"

SRC_URI = "https://registry.npmjs.org/cli-cursor/-/cli-cursor-4.0.0.tgz"
SRC_URI[md5sum] = "8efc1f20729465f2ab7c8c2ca7d737ef"
SRC_URI[sha256sum] = "6bdc7452fc0b1bcbf4534ab5fb7e82295f95ffc89fd4ac0f9f286be158b930ab"

NPM_PKGNAME = "cli-cursor"

inherit npmhelper
inherit native
