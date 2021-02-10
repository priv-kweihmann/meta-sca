SUMMARY = "Ensure that a platform has weaken support"
HOMEPAGE = "https://metacpan.org/pod/Task::Weaken"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=29b2e3806695cb66d447268f5a9fd5c7"

SRC_URI = "https://cpan.metacpan.org/authors/id/E/ET/ETHER/Task-Weaken-${PV}.tar.gz"

SRC_URI[md5sum] = "5645d2aceb2336b5d55a61388fee5966"
SRC_URI[sha256sum] = "2383fedb9dbaef646468ea824afbf7c801076720cfba0df2a7a074726dcd66be"

S = "${WORKDIR}/Task-Weaken-${PV}"

inherit cpan
inherit native
