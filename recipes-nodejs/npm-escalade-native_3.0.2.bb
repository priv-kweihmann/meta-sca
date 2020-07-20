SUMMARY = "NPM: escalade"
DESCRIPTION = "A tiny (183B to 210B) and fast utility to ascend parent directories"
HOMEPAGE = "https://github.com/lukeed/escalade#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=1cb46128f91146188c0ded3a1c6144f3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/escalade/-/escalade-3.0.2.tgz"
SRC_URI[md5sum] = "b3591cc57b0ad4fac4b62aee53113635"
SRC_URI[sha256sum] = "ea30b3995ee3d761fbff0e8348e7f23e208e0e6ec22ac9cc622938dd0a049d90"

NPM_PKGNAME = "escalade"

inherit npmhelper
inherit native
