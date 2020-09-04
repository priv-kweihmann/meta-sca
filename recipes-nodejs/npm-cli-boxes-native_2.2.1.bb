SUMMARY = "NPM: cli-boxes"
DESCRIPTION = "Boxes for use in the terminal"
HOMEPAGE = "https://github.com/sindresorhus/cli-boxes#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cli-boxes/-/cli-boxes-2.2.1.tgz"
SRC_URI[md5sum] = "d51dd5ff02b14948e67107b20973c0e7"
SRC_URI[sha256sum] = "0757a81d1d63a587db3da7f3c7870d9d77a47367fba2263bcf4d58a9c592a87a"

NPM_PKGNAME = "cli-boxes"

inherit npmhelper
inherit native
