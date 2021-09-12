SUMMARY = "A selection of general-utility list subroutines"
HOMEPAGE = "https://metacpan.org/pod/List::Util"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=21;md5=21c3aed4474bc6fbe084cb3c7b497482"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Scalar-List-Utils-${PV}.tar.gz"

SRC_URI[md5sum] = "6fd0593ae677f413262005b6c9b282ee"
SRC_URI[sha256sum] = "c895ce17d9ba5198abf8f6bf7622cd20505b12002e73512c442f5295007a5b3c"

S = "${WORKDIR}/Scalar-List-Utils-${PV}"

inherit cpan
inherit cpan-upgrade-check
inherit native
