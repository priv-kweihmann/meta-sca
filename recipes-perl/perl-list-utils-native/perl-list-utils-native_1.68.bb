SUMMARY = "A selection of general-utility list subroutines"
HOMEPAGE = "https://metacpan.org/pod/List::Util"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=21;md5=21c3aed4474bc6fbe084cb3c7b497482"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Scalar-List-Utils-${PV}.tar.gz"

SRC_URI[md5sum] = "25df95820296c09b417b79efa4d47516"
SRC_URI[sha256sum] = "23317e4346fe8747f0167eccd1881d6369aa71023f014cd6f846988843295906"

UNPACKDIR ??= "${WORKDIR}/sources"
S = "${UNPACKDIR}/Scalar-List-Utils-${PV}"

inherit cpan
inherit_defer native
