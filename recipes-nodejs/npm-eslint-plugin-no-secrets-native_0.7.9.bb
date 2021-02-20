SUMMARY = "NPM: eslint-plugin-no-secrets"
DESCRIPTION = "An eslint rule that searches for potential secrets/keys in code"
HOMEPAGE = "https://github.com/nickdeis/eslint-plugin-no-secrets#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37ed47233af64d072eea63e6bc8342bf"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-plugin-no-secrets/-/eslint-plugin-no-secrets-0.7.9.tgz"
SRC_URI[md5sum] = "20948db2a4c0a42c30220d09a0ac1614"
SRC_URI[sha256sum] = "94c4e1d475a23e097bbdbb37952cd20be6e90270ec9b338a66f83ecd69971805"

NPM_PKGNAME = "eslint-plugin-no-secrets"

inherit npmhelper
inherit native
