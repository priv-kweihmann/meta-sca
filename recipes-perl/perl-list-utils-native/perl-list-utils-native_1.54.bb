SUMMARY = "A selection of general-utility list subroutines"
HOMEPAGE = "https://metacpan.org/pod/List::Util"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Scalar-List-Utils-${PV}.tar.gz"

SRC_URI[md5sum] = "eac720c0b94856b5c91c68b19d5cd80d"
SRC_URI[sha256sum] = "a6eda0eb8fd69890c2369ad12c1fd1b8aab5b38793cac3688d7fc402c630bf79"

S = "${WORKDIR}/Scalar-List-Utils-${PV}"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM  = "file://README;beginline=21;md5=21c3aed4474bc6fbe084cb3c7b497482"

inherit native
inherit cpan
