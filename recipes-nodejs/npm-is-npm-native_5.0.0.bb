SUMMARY = "NPM: is-npm"
DESCRIPTION = "Check if your code is running as an npm script"
HOMEPAGE = "https://github.com/sindresorhus/is-npm#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/is-npm/-/is-npm-5.0.0.tgz"
SRC_URI[md5sum] = "9d3ecca84a059ef53b17c8e8d7948fae"
SRC_URI[sha256sum] = "d102235ef57322d85188e776a89f82dc177d31f784eb91a4ef91c02a24a7f473"

NPM_PKGNAME = "is-npm"

inherit npmhelper
inherit native
