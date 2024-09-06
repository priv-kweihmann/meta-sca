SUMMARY = "A selection of general-utility list subroutines"
HOMEPAGE = "https://metacpan.org/pod/List::Util"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=21;md5=21c3aed4474bc6fbe084cb3c7b497482"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Scalar-List-Utils-${PV}.tar.gz"

SRC_URI[md5sum] = "3b6defcbc040625a73a2d1674a833938"
SRC_URI[sha256sum] = "ddc10e6c410ba35374f69365df4c66e32784352bd3cd88a8ad020e41f47a80c4"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Scalar-List-Utils-${PV}"

inherit cpan
inherit_defer native
