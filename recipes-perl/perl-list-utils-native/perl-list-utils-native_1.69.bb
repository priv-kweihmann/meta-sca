SUMMARY = "A selection of general-utility list subroutines"
HOMEPAGE = "https://metacpan.org/pod/List::Util"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=21;md5=21c3aed4474bc6fbe084cb3c7b497482"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Scalar-List-Utils-${PV}.tar.gz"

SRC_URI[md5sum] = "8553204916b0af5422c599e9f4ea6997"
SRC_URI[sha256sum] = "49108037dc31ba4953aa8be57c1c72f3e922dde1fa328f1eb39a329f1e6314fc"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Scalar-List-Utils-${PV}"

inherit cpan
inherit_defer native
