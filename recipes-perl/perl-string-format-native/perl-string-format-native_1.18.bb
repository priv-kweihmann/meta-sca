SUMMARY = "sprintf-like string formatting capabilities with arbitrary format definitions"
HOMEPAGE = "https://metacpan.org/pod/String::Format"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552"

SRC_URI = "https://cpan.metacpan.org/authors/id/S/SR/SREZIC/String-Format-${PV}.tar.gz"

SRC_URI[md5sum] = "64174b4fac230228cadfa2be4410ef1a"
SRC_URI[sha256sum] = "9e417a8f8d9ea623beea2d13a47c0d5a696fc8602c0509b826cd45f97b76e778"

S = "${WORKDIR}/String-Format-${PV}"

inherit cpan
inherit native
