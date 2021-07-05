SUMMARY = "NPM: @secretlint/secretlint-rule-github"
DESCRIPTION = "A secretlint rule for sendgrid api keys."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-github/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e83bae4ac4028a692e5b926c82a6d860"

DEPENDS = "npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-github/-/secretlint-rule-github-3.3.0.tgz"
SRC_URI[md5sum] = "2836fa025fe1dd8d5f499a56265779cf"
SRC_URI[sha256sum] = "16cc4eb2c7246a47a777934acafe08f4a3366641d9e322cd3b4fc79b7c43c43c"

NPM_PKGNAME = "@secretlint/secretlint-rule-github"

inherit npmhelper
inherit native
