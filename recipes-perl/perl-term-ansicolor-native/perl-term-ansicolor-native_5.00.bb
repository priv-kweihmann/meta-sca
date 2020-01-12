SUMMARY = "Color screen output using ANSI escape sequences"
HOMEPAGE = "https://metacpan.org/pod/Term::ANSIColor"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RR/RRA/Term-ANSIColor-${PV}.tar.gz"

SRC_URI[md5sum] = "4f9286b2615cc10d4e38e6ef480148ed"
SRC_URI[sha256sum] = "abcd5c6d289bcd4e0602aba8d0b627b6d1d2c23c566f69a7064d42d04c7c249f"

S = "${WORKDIR}/Term-ANSIColor-${PV}"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM  = "file://LICENSE;md5=7f47ee6ceac50a8ae8e62cfc9e35a213"

inherit native
inherit cpan
