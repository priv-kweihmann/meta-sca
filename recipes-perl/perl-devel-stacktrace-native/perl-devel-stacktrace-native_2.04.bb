SUMMARY = "An object representing a stack trace"
HOMEPAGE = "https://metacpan.org/pod/Devel::StackTrace"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=413b72969e7a18b96018abbdfd52e35e"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Devel-StackTrace-${PV}.tar.gz"

SRC_URI[md5sum] = "a5b09f7be7f2b10b525a9740676906d8"
SRC_URI[sha256sum] = "cd3c03ed547d3d42c61fa5814c98296139392e7971c092e09a431f2c9f5d6855"

S = "${WORKDIR}/Devel-StackTrace-${PV}"

inherit cpan
inherit native
