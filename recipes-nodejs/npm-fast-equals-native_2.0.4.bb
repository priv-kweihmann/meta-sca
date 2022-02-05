SUMMARY = "NPM: fast-equals"
DESCRIPTION = "A blazing fast equality comparison, either shallow or deep"
HOMEPAGE = "https://github.com/planttheidea/fast-equals#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=77dbf7585d1337fc314a126be9d1d558"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/fast-equals/-/fast-equals-2.0.4.tgz"
SRC_URI[md5sum] = "4bbdc30ceb6f2e240d1295bfdc643fb7"
SRC_URI[sha256sum] = "95dca61cc0238d9efbfad19909c8f90cd409096202318ddd747d2a168431e7fd"

NPM_PKGNAME = "fast-equals"

inherit npmhelper
inherit native
