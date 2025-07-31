SUMMARY = "A selection of general-utility list subroutines"
HOMEPAGE = "https://metacpan.org/pod/List::Util"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=21;md5=21c3aed4474bc6fbe084cb3c7b497482"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Scalar-List-Utils-${PV}.tar.gz"

SRC_URI[md5sum] = "e4eee5921c195177b6432d4d10c631f9"
SRC_URI[sha256sum] = "e0cc03f9fe3565cdf4d6102654f87bba3bca2d8ff989da38307e857d0ae3c886"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Scalar-List-Utils-${PV}"

inherit cpan
inherit_defer native
