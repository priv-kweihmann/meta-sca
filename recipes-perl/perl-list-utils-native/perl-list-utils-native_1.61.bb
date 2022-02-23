SUMMARY = "A selection of general-utility list subroutines"
HOMEPAGE = "https://metacpan.org/pod/List::Util"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=21;md5=21c3aed4474bc6fbe084cb3c7b497482"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Scalar-List-Utils-${PV}.tar.gz"

SRC_URI[md5sum] = "ac1e7abcdf2d850863e30fb2be41929c"
SRC_URI[sha256sum] = "96e0c3cd9529b7a297c3a4eed97d1c88edf2a0a3b3a19fa2ae9fac729906044f"

S = "${WORKDIR}/Scalar-List-Utils-${PV}"

inherit cpan
inherit cpan-upgrade-check
inherit native
