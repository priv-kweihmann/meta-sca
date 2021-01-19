SUMMARY = "NPM: cli-boxes"
DESCRIPTION = "Boxes for use in the terminal"
HOMEPAGE = "https://github.com/sindresorhus/cli-boxes#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cli-boxes/-/cli-boxes-3.0.0.tgz"
SRC_URI[md5sum] = "ecd51fcc2a745c4d1a3e11ff3d5a6005"
SRC_URI[sha256sum] = "6620935f35628b5d20a1b3270345928da11b02a72d37bbb0b1a09474f97b4f39"

NPM_PKGNAME = "cli-boxes"

inherit npmhelper
inherit native
