SUMMARY = "A selection of general-utility list subroutines"
HOMEPAGE = "https://metacpan.org/pod/List::Util"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://README;beginline=21;md5=21c3aed4474bc6fbe084cb3c7b497482"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Scalar-List-Utils-${PV}.tar.gz"

SRC_URI[md5sum] = "e09c1a5c08d9b2f49ecb38333c16cd68"
SRC_URI[sha256sum] = "7a5a66d14e3790e4532347bfdd7c46ec6db3363b15c4bcc5c2f9d83c81ef1b0f"

S = "${WORKDIR}/Scalar-List-Utils-${PV}"

inherit cpan
inherit cpan-upgrade-check
inherit native
