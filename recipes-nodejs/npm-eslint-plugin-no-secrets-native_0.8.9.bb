SUMMARY = "NPM: eslint-plugin-no-secrets"
DESCRIPTION = "An eslint rule that searches for potential secrets/keys in code"
HOMEPAGE = "https://github.com/nickdeis/eslint-plugin-no-secrets#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=37ed47233af64d072eea63e6bc8342bf"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/eslint-plugin-no-secrets/-/eslint-plugin-no-secrets-0.8.9.tgz"
SRC_URI[md5sum] = "338883fe90d672bfacf8542ab4e64b1f"
SRC_URI[sha256sum] = "91c667d3aed40d6dc2ac2ed9c86dc7fdc587ab09009e9ce731524aaffac4881e"

NPM_PKGNAME = "eslint-plugin-no-secrets"

inherit npmhelper
inherit native
