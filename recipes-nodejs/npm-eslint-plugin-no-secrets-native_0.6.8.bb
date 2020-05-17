SUMMARY = "NPM: eslint-plugin-no-secrets"
DESCRIPTION = "An eslint rule that searches for potential secrets/keys in code"
HOMEPAGE = "https://github.com/nickdeis/eslint-plugin-no-secrets#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37ed47233af64d072eea63e6bc8342bf"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-plugin-no-secrets/-/eslint-plugin-no-secrets-0.6.8.tgz"
SRC_URI[md5sum] = "6184dde3dfbd277a4b4e07f924b629e6"
SRC_URI[sha256sum] = "8bfd8350b1483f46ce5fef6e8788156256e0248eb2f72532fc21a0fda84c80ff"

NPM_PKGNAME = "eslint-plugin-no-secrets"

inherit npmhelper
inherit native
