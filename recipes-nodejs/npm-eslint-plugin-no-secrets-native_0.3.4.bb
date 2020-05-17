SUMMARY = "NPM: eslint-plugin-no-secrets"
DESCRIPTION = "An eslint rule that searches for potential secrets/keys in code"
HOMEPAGE = "https://github.com/nickdeis/eslint-plugin-no-secrets#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37ed47233af64d072eea63e6bc8342bf"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-no-secrets/-/eslint-plugin-no-secrets-0.3.4.tgz"
SRC_URI[md5sum] = "a252ba951f846d5b5b4a5e85d85a0cb1"
SRC_URI[sha256sum] = "1949c0401b19d73b7f066563a6a6d0f33ea918d8065522c1f8cd6c60c02ebf79"

NPM_PKGNAME = "eslint-plugin-no-secrets"

inherit npmhelper
inherit native
