SUMMARY = "Color screen output using ANSI escape sequences"
HOMEPAGE = "https://metacpan.org/pod/Term::ANSIColor"

SRC_URI = "https://cpan.metacpan.org/authors/id/R/RR/RRA/Term-ANSIColor-${PV}.tar.gz"

SRC_URI[md5sum] = "51fb530f0afed4213bd6154b11e421ff"
SRC_URI[sha256sum] = "8161c7434b1984bde588d75f22c786c46cb6d35d264d58111db0b82537de4bad"

S = "${WORKDIR}/Term-ANSIColor-${PV}"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM  = "file://LICENSE;md5=4dd720fb9246a9d5227aba78b36913a6"

inherit native
inherit cpan
