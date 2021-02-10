SUMMARY = "Get information about a class and its structure"
HOMEPAGE = "https://metacpan.org/pod/Class::Inspector"

LICENSE = "GPL-2.0 & Artistic-1.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a7c9eabf506fa8737d9971cc308b473"

SRC_URI = "https://cpan.metacpan.org/authors/id/P/PL/PLICEASE/Class-Inspector-${PV}.tar.gz"

SRC_URI[md5sum] = "084c3aeec023639d21ecbaf7d4460b21"
SRC_URI[sha256sum] = "cc295d23a472687c24489d58226ead23b9fdc2588e522f0b5f0747741700694e"

S = "${WORKDIR}/Class-Inspector-${PV}"

inherit cpan
inherit native
