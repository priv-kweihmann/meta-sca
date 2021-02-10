SUMMARY = "Extremely flexible deep comparison"
HOMEPAGE = "https://metacpan.org/pod/Test::Deep"

LICENSE = "GPL-2.0 & Artistic-1.0"
# module doesn't ship an explicit LICENSE file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Test-Deep-${PV}.tar.gz"

SRC_URI[md5sum] = "d466e471108f7f7a5df3802cb13761ac"
SRC_URI[sha256sum] = "4064f494f5f62587d0ae501ca439105821ee5846c687dc6503233f55300a7c56"

S = "${WORKDIR}/Test-Deep-${PV}"

inherit cpan
inherit native
