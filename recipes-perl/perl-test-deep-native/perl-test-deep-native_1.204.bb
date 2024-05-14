SUMMARY = "Extremely flexible deep comparison"
HOMEPAGE = "https://metacpan.org/pod/Test::Deep"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-1.0-or-later & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dcd5765092b27873cc41a2a1ddfb8e7"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RJ/RJBS/Test-Deep-${PV}.tar.gz"

SRC_URI[md5sum] = "fcff296434cd92538ae9de9d1744705f"
SRC_URI[sha256sum] = "b6591f6ccdd853c7efc9ff3c5756370403211cffe46047f082b1cd1611a84e5f"

S = "${WORKDIR}/Test-Deep-${PV}"

inherit cpan
inherit_defer native
