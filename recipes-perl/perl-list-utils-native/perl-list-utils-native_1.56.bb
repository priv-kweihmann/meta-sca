SUMMARY = "A selection of general-utility list subroutines"
HOMEPAGE = "https://metacpan.org/pod/List::Util"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=21;md5=21c3aed4474bc6fbe084cb3c7b497482"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Scalar-List-Utils-${PV}.tar.gz"

SRC_URI[md5sum] = "284a30ac6dfd99a03025fd0edc6cb1ed"
SRC_URI[sha256sum] = "15b8537d40fb3e6dae64b2e7e983c47a99b2c20816a180bb9c868b787a12ab5b"

S = "${WORKDIR}/Scalar-List-Utils-${PV}"

inherit cpan
inherit cpan-upgrade-check
inherit native
