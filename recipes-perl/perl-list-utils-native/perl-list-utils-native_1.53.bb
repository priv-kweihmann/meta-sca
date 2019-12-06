SUMMARY = "A selection of general-utility list subroutines"
HOMEPAGE = "https://metacpan.org/pod/List::Util"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PE/PEVANS/Scalar-List-Utils-${PV}.tar.gz"

SRC_URI[md5sum] = "901d8cd8859b9b9a56002df1023e94ea"
SRC_URI[sha256sum] = "bd4086b066fb3b18a0be2e7d9bc100a99aa0f233ad659492340415c7b2bdae99"

S = "${WORKDIR}/Scalar-List-Utils-${PV}"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM  = "file://README;beginline=21;md5=21c3aed4474bc6fbe084cb3c7b497482"

inherit native
inherit cpan
