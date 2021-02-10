SUMMARY = "Color screen output using ANSI escape sequences"
HOMEPAGE = "https://metacpan.org/pod/Term::ANSIColor"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7f47ee6ceac50a8ae8e62cfc9e35a213"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RR/RRA/Term-ANSIColor-${PV}.tar.gz"

SRC_URI[md5sum] = "5b097ce054447c649de4a022213349c6"
SRC_URI[sha256sum] = "6281bd87cced7a885c38aa104498e3cd4b5f4c276087442cf68c67379318f27d"

S = "${WORKDIR}/Term-ANSIColor-${PV}"

inherit cpan
inherit native
