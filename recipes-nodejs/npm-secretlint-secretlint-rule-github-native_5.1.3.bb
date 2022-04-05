SUMMARY = "NPM: @secretlint/secretlint-rule-github"
DESCRIPTION = "A secretlint rule for sendgrid api keys."
HOMEPAGE = "https://github.com/secretlint/secretlint/tree/master/packages/@secretlint/secretlint-rule-github/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e83bae4ac4028a692e5b926c82a6d860"

DEPENDS = "npm-secretlint-types-native \
           npm-textlint-regexp-string-matcher-native"

SRC_URI = "https://registry.npmjs.org/@secretlint/secretlint-rule-github/-/secretlint-rule-github-5.1.3.tgz"
SRC_URI[md5sum] = "179fc34f9a87e25371b9e585442ae90d"
SRC_URI[sha256sum] = "6d46e9758525cba1c3a9c5b5054ba1202a1306d0de7453383844d66346238446"

NPM_PKGNAME = "@secretlint/secretlint-rule-github"

inherit npmhelper
inherit native
