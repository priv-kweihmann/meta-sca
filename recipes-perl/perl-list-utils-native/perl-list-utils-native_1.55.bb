SUMMARY = "A selection of general-utility list subroutines"
HOMEPAGE = "https://metacpan.org/pod/List::Util"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=21;md5=21c3aed4474bc6fbe084cb3c7b497482"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Scalar-List-Utils-${PV}.tar.gz"

SRC_URI[md5sum] = "7988f5111e33ba47e175cf3e86b0d93f"
SRC_URI[sha256sum] = "4d2bdc1c72a7bc4d69d6a5cc85bc7566497c3b183c6175b832784329d58feb4b"

S = "${WORKDIR}/Scalar-List-Utils-${PV}"

inherit cpan
inherit native
