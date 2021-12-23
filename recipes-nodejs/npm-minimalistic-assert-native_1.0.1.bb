SUMMARY = "NPM: minimalistic-assert"
DESCRIPTION = "minimalistic-assert ==="
HOMEPAGE = "https://github.com/calvinmetcalf/minimalistic-assert"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4e9cb27a3915b014b1f4c9c7d21912b"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/minimalistic-assert/-/minimalistic-assert-1.0.1.tgz"
SRC_URI[md5sum] = "b283bfa274ed0fa8b0a65f0adf4136cb"
SRC_URI[sha256sum] = "f16522c947d6dbe3a99f5ff4296ccc253090b838959abdddc45fe81edb03f3a0"

NPM_PKGNAME = "minimalistic-assert"

inherit npmhelper
inherit native
