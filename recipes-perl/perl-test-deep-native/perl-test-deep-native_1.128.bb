SUMMARY = "Extremely flexible deep comparison"
HOMEPAGE = "https://metacpan.org/pod/Test::Deep"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Test-Deep-${PV}.tar.gz"

SRC_URI[md5sum] = "9bc47147ea720fc01bc6b214afb884ff"
SRC_URI[sha256sum] = "852d7e836fba8269b0b755082051a24a1a309d015a8b76838790af9e3760092f"

S = "${WORKDIR}/Test-Deep-${PV}"

LICENSE = "GPL-2.0 & Artistic-1.0"
# module doesn't ship an explicit LICENSE file
LIC_FILES_CHKSUM  = "file://${COMMON_LICENSE_DIR}/GPL-1.0;md5=e9e36a9de734199567a4d769498f743d"

inherit native
inherit cpan
