SUMMARY = "Perl implementation of the which utility as an API"
HOMEPAGE = "https://metacpan.org/pod/File::Which"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4aece164a4cb5012c03e0b99aa7c6a4"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/File-Which-${PV}.tar.gz"

SRC_URI[md5sum] = "c8f054534c3c098dd7a0dada60aaae34"
SRC_URI[sha256sum] = "b79dc2244b2d97b6f27167fc3b7799ef61a179040f3abd76ce1e0a3b0bc4e078"

S = "${WORKDIR}/File-Which-${PV}"

inherit cpan
inherit native
