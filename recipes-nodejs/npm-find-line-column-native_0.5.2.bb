SUMMARY = "NPM: find-line-column"
DESCRIPTION = "Given string and position, return line and column of position"
HOMEPAGE = "https://github.com/duereg/find-line-column"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.md;beginline=24;md5=477dfa54ede28e2f361e7db05941d7a7"

SRC_URI = "https://registry.npmjs.org/find-line-column/-/find-line-column-0.5.2.tgz"
SRC_URI[md5sum] = "a2a64efa2cfe700aee2ac7f55a9700cd"
SRC_URI[sha256sum] = "c32d7d6f266c87ef0b84fcdeb4ee3b8eff892f8bfbf5292d366f62fe7ff2c8d5"

NPM_PKGNAME = "find-line-column"

inherit npmhelper
inherit native
