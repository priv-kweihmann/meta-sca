SUMMARY = "File path utility"
HOMEPAGE = "https://metacpan.org/pod/Path::Tiny"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a801633f1c5bd3f1f7aa60bc72e95df9"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DA/DAGOLDEN/Path-Tiny-${PV}.tar.gz"

SRC_URI[md5sum] = "cb34fd356725ec12b78e88ddac37db08"
SRC_URI[sha256sum] = "32138d8d0f4c9c1a84d2a8f91bc5e913d37d8a7edefbb15a10961bfed560b0fd"

S = "${WORKDIR}/Path-Tiny-${PV}"

inherit cpan
inherit native
