SUMMARY = "A selection of general-utility list subroutines"
HOMEPAGE = "https://metacpan.org/pod/List::Util"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=21;md5=21c3aed4474bc6fbe084cb3c7b497482"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Scalar-List-Utils-${PV}.tar.gz"

SRC_URI[md5sum] = "2e9e72dab0a3171be207117b70bb9e58"
SRC_URI[sha256sum] = "c685bad8021f008f321288b7c3182ec724ab198a77610e877c86f3fad4b85f07"

S = "${WORKDIR}/Scalar-List-Utils-${PV}"

inherit cpan
inherit cpan-upgrade-check
inherit native
