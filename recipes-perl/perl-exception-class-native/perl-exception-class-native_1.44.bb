SUMMARY = "A module that allows you to declare real exception classes in Perl"
HOMEPAGE = "https://metacpan.org/pod/Exception::Class"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=193fd3e574d395c34717d0a14f20b553"

SRC_URI = "https://cpan.metacpan.org/authors/id/D/DR/DROLSKY/Exception-Class-${PV}.tar.gz"

SRC_URI[md5sum] = "6b5bb8e4ad2b1f6120fc1d33ae45e91b"
SRC_URI[sha256sum] = "33f3fbf8b138d3b04ea4ec0ba83fb0df6ba898806bcf4ef393d4cafc1a23ee0d"

S = "${WORKDIR}/Exception-Class-${PV}"

inherit cpan
inherit native
