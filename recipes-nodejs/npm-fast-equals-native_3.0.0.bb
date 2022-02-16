SUMMARY = "NPM: fast-equals"
DESCRIPTION = "A blazing fast equality comparison, either shallow or deep"
HOMEPAGE = "https://github.com/planttheidea/fast-equals#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=77dbf7585d1337fc314a126be9d1d558"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/fast-equals/-/fast-equals-3.0.0.tgz"
SRC_URI[md5sum] = "e62e6511ab53d47a37ec65b7d9e54d78"
SRC_URI[sha256sum] = "4277b1fb0ca2458a4c9a53894219fb37df34c675d639391e7699dbb779a93bd3"

NPM_PKGNAME = "fast-equals"

inherit npmhelper
inherit native
