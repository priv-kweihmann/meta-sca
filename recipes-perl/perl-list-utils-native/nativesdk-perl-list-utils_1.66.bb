SUMMARY = "A selection of general-utility list subroutines"
HOMEPAGE = "https://metacpan.org/pod/List::Util"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=21;md5=21c3aed4474bc6fbe084cb3c7b497482"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Scalar-List-Utils-${PV}.tar.gz"

SRC_URI[md5sum] = "2132d7a9dec0417f9bbe52789d4b5658"
SRC_URI[sha256sum] = "9bf113e682b43fa93c8803e43e96afce5f81ea4027912d0d9acdc9b591b05370"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Scalar-List-Utils-${PV}"

inherit cpan
inherit_defer nativesdk
