SUMMARY = "NPM: ms"
DESCRIPTION = "Tiny millisecond conversion utility"
HOMEPAGE = "https://github.com/vercel/ms#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license.md;md5=2b8bc52ae6b7ba58e1629deabd53986f"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/ms/-/ms-2.1.3.tgz"
SRC_URI[md5sum] = "a50e4bf82f754914316bfca3dfbcf352"
SRC_URI[sha256sum] = "f6616e15e530ed552f9daa2d3ce71963947c6bc7c98c9b64fd3e673fd02622c6"

NPM_PKGNAME = "ms"

inherit npmhelper
inherit native
