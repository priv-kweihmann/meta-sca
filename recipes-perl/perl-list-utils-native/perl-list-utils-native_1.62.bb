SUMMARY = "A selection of general-utility list subroutines"
HOMEPAGE = "https://metacpan.org/pod/List::Util"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=21;md5=21c3aed4474bc6fbe084cb3c7b497482"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Scalar-List-Utils-${PV}.tar.gz"

SRC_URI[md5sum] = "2e5186779360f938c8ec83030c7b5a03"
SRC_URI[sha256sum] = "7279c4ec7df0cf2c0acb874abdfe86956f5028d2414974db56edfbed8a4d339f"

S = "${WORKDIR}/Scalar-List-Utils-${PV}"

inherit cpan
inherit native
