SUMMARY = "NPM: require-directory"
DESCRIPTION = "Recursively iterates over specified directory, require()'ing each file, and returning a nested hash structure containing those modules."
HOMEPAGE = "https://github.com/troygoode/node-require-directory/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=903997d26b12b72b43aa60018387bb90"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/require-directory/-/require-directory-2.1.1.tgz"
SRC_URI[md5sum] = "f3a9010155b6a46066afbe2d07f624bd"
SRC_URI[sha256sum] = "703bee0844360383fe4a8792d4a5a562647426a053e7597a1d272ac554f386c8"

NPM_PKGNAME = "require-directory"

inherit npmhelper
inherit native
